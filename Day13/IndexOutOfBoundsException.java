package indexoutofboundsexception;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        
        int vector[] = new int[3];
      
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        
        // This loop will cause an ArrayIndexOutOfBoundsException on the last iteration
        /*for (int i=0; i<4; i++) {
            System.out.println("Value: " + vector[i]);
        }*/
        
        // This line would also cause an ArrayIndexOutOfBoundsException
        /* System.out.println("The value for the 3rd position is: " + vector[3]);*/
    }
    
}
