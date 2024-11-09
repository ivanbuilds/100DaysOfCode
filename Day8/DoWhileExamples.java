package dowhileexamples;

public class DoWhileExamples {

    public static void main(String[] args) {
        
        int counter = 0;
        
        do {
            System.out.println("I'm in the iteration n° " + (counter+1));
            counter++;
        } while (counter < 10);
    }
    
}
