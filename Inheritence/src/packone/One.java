package packone;

public class One {
	private void showPvt(){
		System.out.println("This is private show of One");
	}

	public void showPub(){
		System.out.println("This is public show of One ");
	}

    void showDft(){
    	System.out.println("This is default show of One ");
    }

    protected void showPro(){
    	System.out.println("This is protected show of One ");
    }

}

// This class is default class ('.')
class Two{
	private void showPvt(){
		System.out.println("This is private show of Two");
	}

	public void showPub(){
		System.out.println("This is public show of Two");
	}

    void showDft(){
    	System.out.println("This is default show of Two ");
    }

    protected void showPro(){
    	System.out.println("This is protected show of Two ");
    }

} 