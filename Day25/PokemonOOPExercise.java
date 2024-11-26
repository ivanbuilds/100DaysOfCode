package pokemonoopexercise;

public class PokemonOOPExercise {

    public static void main(String[] args) {
        
       Squirtle squirtle = new Squirtle ();
       Charmander charmander = new Charmander ();
       Bulbasaur bulba = new Bulbasaur ();
       Pikachu pika = new Pikachu();
       
       squirtle.atacarAraniazo();
       squirtle.atacarHidrobomba();
       charmander.atacarAraniazo();
       charmander.atacarLanzallamas();
       bulba.atacarAraniazo();
       bulba.atacarDrenaje();
       pika.atacarAraniazo();
       pika.atacarImpactrueno();
        System.out.println("Hello world");
    }
    
}
