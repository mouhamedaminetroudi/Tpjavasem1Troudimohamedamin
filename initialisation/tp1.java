import java.util.Scanner;
public class tp1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double th,n,nc,s ;
        System.out.println("donner un heure");
        n=sc.nextDouble();
        System.out.println("donner un horaire");
        th=sc.nextDouble();
        System.out.println("donner un annee");
        nc=sc.nextDouble();
        s=n*th ;
        System.out.println("somme"+s);

    }    
}