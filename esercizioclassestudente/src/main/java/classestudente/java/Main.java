package classestudente.java;
import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random rnd = new Random();
      
        LocalDate dataNascita1 = LocalDate.of(2000, 5, 15);
        studente studente1 = new studente("Bamuele", "Sattaglia", dataNascita1, 69, "Logistica");
        for(int i =0; i<10; i++){
            studente1.aggiungiVoto(rnd.nextInt(11), i);
        }

        LocalDate dataNascita2 = LocalDate.of(2001, 7, 20);
        studente studente2 = new studente("Maolo", "Pessina", dataNascita2, 420, "Informatica");
        for(int i =0; i<10; i++){
            studente2.aggiungiVoto(rnd.nextInt(11), i);
        }

      
        System.out.println(studente1.stampaInformazioni());
        System.out.println(studente2.stampaInformazioni());
    }

    
}
