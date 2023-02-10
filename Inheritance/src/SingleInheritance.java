class Engine{  
	
void start()
{
	System.out.println("Starting");}  
}  

class Car extends Engine{  
	
void sound()
{
	System.out.println("making sound...");}  

}  
class SingleInheritance{  
public static void main(String args[]){  
Car c=new Car();  
c.start();  
c.sound();  
}}  