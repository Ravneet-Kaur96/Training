package packthread;
class Message{
	String msg;
	Message(){
		msg="No Message";
	}
	void writeMessage(){
		msg="Live Your Life Your Way";
		System.out.println("Message Written");
	}
	void readMessage(){
		System.out.println("Message is :"+msg);
	}

}

class ReaderMsg extends Thread{
	Message mRef;
	ReaderMsg(Message m){
		mRef=m;
	}
	public void run(){
		synchronized(mRef){
			try {
				mRef.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			mRef.readMessage();
		}
	}
}
class WriterMsg extends Thread{
	Message mRef;
	WriterMsg(Message m){
		mRef=m;
	}
	public void run(){
		synchronized(mRef){

				mRef.writeMessage();
				mRef.notify();

		}
	}
}
public class WNDemo {

	public static void main(String[] args) {
		Message mRef=new Message();
		ReaderMsg ref=new ReaderMsg(mRef);
		ref.start();
		WriterMsg wRef=new WriterMsg(mRef);
		wRef.start();

	}

}