public class Funzioni {
    public static void aggiunta (int conta, String[] marca, String[]modello, double[]prezzo, String marcaIns, String modelloIns, double prezzoIns) {
        marca[conta]=marcaIns;
        modello[conta]=modelloIns;
        prezzo[conta]=prezzoIns;
    }
    public static void visualizza (String[]marca,String[]modello,double[]prezzo,int conta){
        for (int i=0;i<conta;i++) {
            System.out.println(marca[i]);
            System.out.print(modello[i]);
            System.out.print(prezzo[i]);
        }
    }
    public static String ricerca (String marca3, String modello3, String[]marca,String[]modello,int conta){
        String s1="";
        String s2="";
        String modMarca="";
        for(int i=0;i<conta;i++){
            if(marca[i].equalsIgnoreCase(marca3)&&modello[i].equalsIgnoreCase(modello3)){
                s1=marca[i];
                s2=modello[i];
                modMarca=s1+" "+s2;
                break;
            }
        }
        return modMarca;
    }
    public static void cancella (String cancMarca,String cancModello,String temp,int conta,String[]marca,String[]modello){
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
    public static void ordinate (int conta,String[]marca,int min){
        for(int i=0;i<conta-1;i++){
            min=i;
            for(int j=i+1;j<conta;j++){
                if(marca[j].compareTo(marca[min])<0){
                    min=j;
                }
            }
        }
    }
    public static void diesel (int conta,String[] modello,String[]marca,double[]prezzo){
        for(int i=0;i<conta;i++){
            if(modello[i].equalsIgnoreCase("diesel")){
                System.out.println(marca[i]);
                System.out.println(modello[i]);
                System.out.println(prezzo[i]);
            }
        }
    }
    public static void modifica (String modMarca,String modModello,double modPrezzo,String[]marca,String[]modello,double[]prezzo,int conta){
        for (int i=0;i<conta;i++){
            if(marca[i].equalsIgnoreCase(modMarca)&&modello[i].equalsIgnoreCase(modModello)&&prezzo[i]==modPrezzo){
                marca[i]=null;
                modello[i]=null;
                prezzo[i]=0;
            }
        }
    }
}
