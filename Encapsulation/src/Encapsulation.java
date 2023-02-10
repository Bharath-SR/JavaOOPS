
class Encapsulation {

  private String name;

  // getter method
  public String getName() {
    return name;
  }

  // setter method
  public void setName(String name) {
    this.name = name;
  }
}

class Main {
  public static void main(String[] args) {

    Encapsulation e = new Encapsulation();

    // change age using setter
    e.setName("Bharath");

    // access age using getter
    System.out.println("My name is " + e.getName());
  }
}