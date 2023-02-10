public class Narrowing {
 
    public static void main(String[] args) {
    	 
        double d = 100.01;
              
        long l = (long) d; 
        int i = (int) l;
 
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("d= " + d);
 
    }
 
}