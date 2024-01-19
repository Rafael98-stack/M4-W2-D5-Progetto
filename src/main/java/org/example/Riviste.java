package org.example;

public class Riviste extends Inclusi{
Enum Periodicita;
public Riviste(){}
    public Riviste(Enum periodicita){
    this.Periodicita=periodicita;
    }
   public Enum getperiodicita(){
   return this.Periodicita;
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
        return "User{" +
                "Periodicita'= '" + Periodicita + '\'' +
                ", ISBN= '" +CodiceISBN+'\''+
                ", Anno Publicazione= '"+AnnoPublicazione+'\''+
                ", Pagine= '"+numeroPagine+'\''+
                '}';
    }

}
