package Hierarchical;

class Human{  
void eat(){System.out.println("eating");}  
}  
class legs extends Human{  
void walk(){System.out.println("walking");}  
}  
class hands extends Human{  
void shake(){System.out.println("Shake...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
hands c=new hands();  
c.eat();  
c.shake();  
}} 