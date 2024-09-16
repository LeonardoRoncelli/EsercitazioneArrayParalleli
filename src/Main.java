import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num=0;
        int scelta;
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
            switch(scelta){
                case 1:
                    System.out.print("Inserisci il numero delle auto che vuoi aggiungere ");
                    num=input.nextInt();
                    String[]marca=new String[num];
                    String[]modello=new String[num];
                    double[]prezzo=new double[num];
                    for (int i = 0; i < num; i++) {
                        System.out.println("Inserisci la marca dell'auto ");
                        marca[i] = input.nextLine();
                        System.out.println("Inserisci il modello dell'auto ");
                        modello[i] = input.nextLine();
                        System.out.println("Inserisci il prezzo dell'auto ");
                        prezzo[i] = input.nextDouble();
                }
            }
        }while(scelta!=0);
    }
}