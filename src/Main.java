import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int conta=0;
        int scelta;
        String[]marca=new String[100];
        String[]modello=new String[100];
        double[]prezzo=new double[100];
        do {
            System.out.println("Inserisci 0 per uscire");
            System.out.println("Inserisci 1 per aggiungere una nuova auto");
            System.out.println("Inserisci 2 per visualizzare tutte le auto");
            System.out.println("Inserisci 3 per ricercare l'auto tramite marca e modello");
            System.out.println("Inserisci 4 per cancellare un'auto");
            System.out.println("Inserisci 5 per modificare i dati di un auto");
            System.out.println("Inserisci 6 per visualizzare le auto in ordine crescente");
            System.out.println("Inserisci 7 per visualizzare tutti i modelli diesel");
            System.out.print("Inserisci la tua scelta ");
            scelta=input.nextInt();
            switch(scelta) {
                case 1: {
                    if (conta < 100) {
                        System.out.print("Inserisci la marca dell'auto: ");
                        String marcaIns= input.next();
                        System.out.print("Inserisci il modello dell'auto: ");
                        String modelloIns = input.next();
                        System.out.print("Inserisci il prezzo dell'auto: ");
                        double prezzoIns = input.nextDouble();
                        Funzioni.aggiunta(conta,marca,modello,prezzo, marcaIns,modelloIns,prezzoIns);
                    } else {
                        System.out.println("Lunghezza massima array raggiunta");
                    }
                }
                case 2:{
                    Funzioni.visualizza(marca,modello,prezzo,conta);
                }
                case 3:{
                    String marca3;
                    String modello3;
                    System.out.print("Inserisci la marca da ricercare: ");
                    marca3=input.next();
                    System.out.print("Inserisci il modello da ricercare: ");
                    modello3=input.next();
                    Funzioni.ricerca(marca3,modello3,marca,modello,conta);
                }
                case 4: {
                    String cancMarca;
                    String cancModello;
                    String temp=null;
                    System.out.print("Inserisci la marca da cancellare: ");
                    cancMarca = input.next();
                    System.out.print("Inserisci il modello da cancellare: ");
                    cancModello = input.next();
                    Funzioni.cancella(cancMarca,cancModello,temp,conta,marca,modello);
                }
                case 5:{
                    String modMarca;
                    String modModello;
                    double modPrezzo;
                    System.out.print("Inserisci la marca da modificare: ");
                    modMarca= input.next();
                    System.out.print("Inserisci il modello da modificare: ");
                    modModello= input.next();
                    System.out.print("Inserisci il prezzo da modificare: ");
                    modPrezzo= input.nextDouble();
                    for(int i=0;i<conta;i++){
                        if(marca[i].equals(null)&&modello[i].equals(null)&&prezzo[i]==0){
                            marca[i]= input.next();
                            modello[i]= input.next();
                            prezzo[i]= input.nextDouble();
                        }
                    }
                    Funzioni.modifica(modMarca,modModello,modPrezzo,marca,modello,prezzo,conta);
                }
                case 6:{
                    int min=0;
                    Funzioni.ordinate(conta,marca,min);
                }
                case 7:{
                    Funzioni.diesel(conta,modello,marca,prezzo);
                }
            }
        }while(scelta!=0);
    }
}