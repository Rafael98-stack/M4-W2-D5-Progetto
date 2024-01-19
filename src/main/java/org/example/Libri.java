package org.example;

public class Libri extends Inclusi {
    String Autore;
    Enum Genere;
    public Libri(){}
    public Libri(String autore,Enum genere,long codiceISBN,int anno,int pagine){
        this.Autore=autore;
        this.Genere=genere;
        this.CodiceISBN=codiceISBN;
        this.AnnoPublicazione=anno;
        this.numeroPagine=pagine;
    }
    @Override
    public String toString(){
        return "User{" +
                "name= '" + Autore + '\'' +
                ", Genere= '" + Genere +'\''+
                ", ISBN= '" +CodiceISBN+'\''+
                ", Anno Publicazione= '"+AnnoPublicazione+'\''+
                ", Pagine= '"+numeroPagine+'\''+
                '}';
    }
    public String getAutore(){
        return this.Autore;
    }
    public Enum getGenere(){
        return this.Genere;
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
}
