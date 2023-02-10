package polymorphism;

class Laptop {
  public void display() {
    System.out.println("Laptop is powerful machine");
  }
}

class Java extends Laptop {
  @Override
  public void display() {
    System.out.println("Java Programming");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Java class
    Java j = new Java();
    j.display();

    // create an object of Laptop class
    Laptop l1 = new Laptop();
    l1.display();
  }
} 