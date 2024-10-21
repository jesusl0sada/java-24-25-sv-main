package ProgramaciónModular;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int zahl1, zahl2;
        int capicua, zahlcapicua;
        System.out.println("Sag mig zwei zahlen");
        zahl1=tastatur.nextInt();
        zahl2=tastatur.nextInt();
        if(zahl1<0||zahl2<0||zahl1>zahl2) {
            System.out.println("zwei zahlen muss positiv sein");
        }
        else {
            capicua=0;
            System.out.println("capicua zahlen zwischen "+zahl1+" und "+zahl2+":");
            for(zahlcapicua=zahl1;zahlcapicua<=zahl2;zahlcapicua++) {
                if (istcapicua(zahlcapicua)) {
                    System.out.println(zahlcapicua);
                    capicua++;
                }
            }
            System.out.println("zahlen gefunden: "+capicua);

        }
    }
    public static int umkehren(int zahl1) {
        int invertierte =0;
        while(zahl1!=0) {
            int ziffer = zahl1%10;
            invertierte = invertierte*10+ziffer;
            zahl1/=10;
        }			return invertierte;


    }

    public static boolean istcapicua(int zahlcapicua) {
        return zahlcapicua == umkehren(zahlcapicua);


    }
}