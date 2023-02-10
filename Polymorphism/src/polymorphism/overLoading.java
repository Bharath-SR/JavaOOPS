package polymorphism;

class overLoading {

	  // method without parameter
	  public void show() {
	   System.out.println("Hello");
	  }

	  // method with single parameter
	  public void show(char a) {
	   {
		   System.out.println("OverLoading");
		  }

	  }
	}

	class Main {
	  public static void main(String[] args) {
	    overLoading d1 = new overLoading();

	    // call method without any argument
	    d1.show();
	    System.out.println("\n");

	    // call method with a single argument
	    d1.show('#');
	  }
	}
