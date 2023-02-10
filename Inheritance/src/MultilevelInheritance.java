
class Engine1{  
	
void start()
{
	System.out.println("Starting");}  
}  

class Wheels extends Engine1{  
	
void wheel()
{
	System.out.println("Bus has 6 wheels...");}  

}  
class Bus extends Wheels{
	
	void move() {
	System.out.println("Bus Moves...");
} 
}
class MultilevelInheitance{  
public static void main(String args[]){  
Bus c=new Bus();  
c.start(); 
c.wheel();
c.move();  
}}