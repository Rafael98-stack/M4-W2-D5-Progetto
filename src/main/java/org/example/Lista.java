package org.example;

public class Lista extends Inclusi {
    String Autore;
    Enum Genere;
    Enum Periodicita;

    public Lista(String autore,String titolo, Enum genere, long codiceISBN, int anno, int pagine) {
        this.Autore = autore;
        this.Titolo=titolo;
        this.Genere = genere;
        this.CodiceISBN = codiceISBN;
        this.AnnoPublicazione = anno;
        this.numeroPagine = pagine;
    }

    public Lista(Enum periodicita,String titolo, long codiceISBN, int anno, int pagine) {
        this.Periodicita = periodicita;
        this.Titolo=titolo;
        this.CodiceISBN=codiceISBN;
        this.AnnoPublicazione=anno;
        this.numeroPagine=pagine;
    }



    public String getAutore(){
        return this.Autore;
    }
    public Enum getGenere(){
        return this.Genere;
    }
    public Enum getPeriodicita(){
        return this.Periodicita;
    }
    public Long getCodiceISBN(){
        return this.CodiceISBN;
    }
    public int getAnnoPublicazione(){
        return this.AnnoPublicazione;
    }
    public int getNumerodiPagine(){
        return this.numeroPagine;
    }
    @Override
public String toString(){
        if(this.Periodicita== PeriodicitaT.MENSILE || this.Periodicita== PeriodicitaT.SEMESTRALE || this.Periodicita== PeriodicitaT.SETTIMANALE){
           return  "Rivista{" +
                    "Periodicita'= '" + Periodicita + '\'' +
                   ",Titolo= '"+Titolo+'\''+
                    ", ISBN= '" +CodiceISBN+'\''+
                    ", Anno Publicazione= '"+AnnoPublicazione+'\''+
                    ", Pagine= '"+numeroPagine+'\''+
                    '}';
        } else {
        return  "Libro{" +
                "Autore= '" + Autore + '\'' +
                ",Titolo= '"+Titolo+'\''+
                ", Genere= '" + Genere +'\''+
                ", ISBN= '" +CodiceISBN+'\''+
                ", Anno Publicazione= '"+AnnoPublicazione+'\''+
                ", Pagine= '"+numeroPagine+'\''+
                '}';
}}

    public void remove(int numero) {
    }
}
