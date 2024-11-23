package inheritanceexcercise;

public class InheritanceExcercise {

    public static void main(String[] args) {
        
        /* 
        // Inheritance
        Employee empl = new Employee ();
                
        empl.getEmployeeId();
        empl.getFirsName();
        
        Consultant cons = new Consultant();
        
        cons.getConsultantId();
        cons.getFirsName();
        */
               
       
        // Polymorphism
        Person vector [] = new Person [5];
        vector [0] = new Person ();
        vector [1] = new Employee ();
        vector [2] = new Consultant ();
        vector [3] = new Manager ();
        
        
        Person pers = new Person ();
        Consultant cons = new Consultant();
        
        pers = cons;
        
    }
    
}
