import java.util.Scanner;
public class calculer{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        double th,n,enc,s ;
        System.out.println("donner le nombre d'heure");
        n=Sc.nextDouble();
        System.out.println("donner les taux horaire");
        th=Sc.nextDouble();
        System.out.println("donner le nombre d'annee");
        enc=Sc.nextDouble();
        s=n*th;
        System.out.println(s);
    }
}