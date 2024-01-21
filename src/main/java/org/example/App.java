package org.example;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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


       stampaLista(libreria);
        System.out.println(libreria.size());

        aggiungiLibroAllaLibreria(libreria,"Nuovo Autore","Nuovo Titolo",null,0,0,0);
        aggiungiLibroAllaLibreria(libreria,"Nuovo Autore","Nuovo Titolo",null,321321321,0,0);

        stampaLista(libreria);
        System.out.println(libreria.size());

        Map<Integer, List<Lista>> listaPerPublicazione = libreria.stream().filter(a -> a.getAnnoPublicazione() >= 1960).collect(Collectors.groupingBy(list -> list.getAnnoPublicazione()));
        listaPerPublicazione.forEach((anno, lista) -> System.out.println("Film del: " + anno + ", " + lista));

        Map<Long, List<Lista>> listaPerISBN = libreria.stream().filter(a -> a.getCodiceISBN() >= 200000L).collect(Collectors.groupingBy(list -> list.getCodiceISBN()));
        listaPerISBN.forEach((isbn, lista) -> System.out.println("Preferenza ISBN: " + isbn + ", " + lista));

//        List<Lista> usersSortedByName = libreria.stream().sorted(Comparator.comparing(Lista::getAutore)).toList();
//        usersSortedByName.forEach(System.out::println);
    }



    ///////////////////////////////////////////////////////////////////////////////
    public static void stampaLista(Set<Lista> libreria) {
        for (Lista lista : libreria) {
            System.out.println(lista);
        }
    }


    public static void aggiungiLibroAllaLibreria(  Set<Lista> libreria,String autore,String titolo, Enum genere, long codiceISBN, int anno, int pagine) {
String Autore = autore;
String Titolo=titolo;
Enum Genere=genere;
long CodiceISBN=codiceISBN;
int Anno = anno;
int Pagine= pagine;
        libreria.add(new Lista(Autore,Titolo,Genere,CodiceISBN,Anno,Pagine));
    }


}
