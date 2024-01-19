package org.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextInt(1, 100);
        };
        Supplier<Integer> annoSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextInt(1900, 2024);
        };
        Supplier<Long> longISBNSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextLong(100000L, 300000L);
        };
        Supplier<PeriodicitaT> randomPeriodicitaSupplier = () -> {
            Random random = new Random();
            int randomIndex = random.nextInt(PeriodicitaT.values().length);
            return PeriodicitaT.values()[randomIndex];
        };
        Supplier<GenereG> randomGenereGSupplier = () -> {
            Random random = new Random();
            int randomIndex = random.nextInt(GenereG.values().length);
            return GenereG.values()[randomIndex];
        };
        Set<Lista> libreria = new HashSet<>();
        Lista libri1 = new Lista("Marco","LaMortazza", randomGenereGSupplier.get(), longISBNSupplier.get(), annoSupplier.get(), integerSupplier.get());
        libreria.add(libri1);
        Lista rivista1 =new Lista(randomPeriodicitaSupplier.get(),"MotorSport", longISBNSupplier.get(), annoSupplier.get(), integerSupplier.get());
        libreria.add(rivista1);

aggiungiAllaLista(libreria,1);
       stampaLista(libreria);
        System.out.println(libreria.size());

        modificaLista(libreria,2);
        stampaLista(libreria);
        System.out.println(libreria.toArray()[0]);

    }


    ///////////////////////////////////////////////////////////////////////////////
    public static void stampaLista(Set<Lista> libreria) {
        for (Lista lista : libreria) {
            System.out.println(lista);
        }
    }
    public static void aggiungiAllaLista(Set<Lista> libreria,int quantita){
        for(int i=0;i<quantita;i++){
libreria.add(new Lista(null,"",0,0,0));
        }
    }
    public static void modificaLista(Set<Lista> libreria,int posizione){
 libreria.getClass();
    }
}
