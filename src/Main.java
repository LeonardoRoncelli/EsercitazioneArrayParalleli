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
                        aggiunta(conta,marca,modello,prezzo, marcaIns,modelloIns,prezzoIns);
                    } else {
                        System.out.println("Lunghezza massima array raggiunta");
                    }
                }
                case 2:{
                        visualizza(marca,modello,prezzo,conta);
                }
                case 3:{
                    String marca3;
                    String modello3;
                    System.out.print("Inserisci la marca da ricercare: ");
                    marca3=input.next();
                    System.out.print("Inserisci il modello da ricercare: ");
                    modello3=input.next();
                    for(int i=0;i<conta;i++){
                        if(marca[i].equalsIgnoreCase(marca3)&&modello[i].equalsIgnoreCase(modello3)){
                            System.out.println(marca[i]);
                            System.out.println(modello[i]);
                            break;
                        }
                    }
                }
                case 4: {
                    String cancMarca;
                    String cancModello;
                    String temp;
                    System.out.print("Inserisci la marca da cancellare: ");
                    cancMarca = input.next();
                    System.out.print("Inserisci il modello da cancellare: ");
                    cancModello = input.next();
                    for (int i = 0; i < conta; i++) {
                        if (marca[i].equalsIgnoreCase(cancMarca) && modello[i].equalsIgnoreCase(cancModello)) {
                            temp = marca[i];
                            marca[i] = marca[conta];
                            marca[conta] = temp;
                            conta--;
                            break;
                        }
                    }
                }
                case 5:{
                    String ricercaMarca;
                    String ricercaModello;
                    double ricercaPrezzo;
                    System.out.print("Inserisci la marca da ricercare: ");
                    ricercaMarca= input.next();
                    System.out.print("Inserisci il modello da ricercare: ");
                    ricercaModello= input.next();
                    System.out.print("Inserisci il prezzo da ricercare: ");
                    ricercaPrezzo= input.nextDouble();
                    for(int i=0;i<conta;i++){
                        if(marca[i].equalsIgnoreCase(ricercaMarca)&&modello[i].equalsIgnoreCase(ricercaModello)&&prezzo[i]==ricercaPrezzo){
                            marca[i]= input.next();
                            modello[i]= input.next();
                            prezzo[i]= input.nextDouble();
                        }
                    }
                }
                case 6:{
                    int min;
                    for(int i=0;i<conta-1;i++){
                        min=i;
                        for(int j=i+1;j<conta;j++){
                            if(marca[j].compareTo(marca[min])<0){
                                min=j;
                            }
                        }
                    }
                }
            }
        }while(scelta!=0);
    }
    private static void aggiunta (int conta, String[] marca, String[]modello, double[]prezzo, String marcaIns, String modelloIns, double prezzoIns) {
        marca[conta]=marcaIns;
        modello[conta]=modelloIns;
        prezzo[conta]=prezzoIns;
    }
    private static void visualizza (String[]marca,String[]modello,double[]prezzo,int conta){
        for (int i=0;i<conta;i++) {
            System.out.println(marca[i]);
            System.out.print(modello[i]);
            System.out.print(prezzo[i]);
        }
    }
}