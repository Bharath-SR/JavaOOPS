// Abstract class
abstract class Abstraction {
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Animal is sleeping");
  }
}

class Lion extends Abstraction {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("Lion sounds ");
  }
}

class Main {
  public static void main(String[] args) {
    Lion l = new Lion(); // Create a Pig object
    l.animalSound();
    l.sleep();
  }
}