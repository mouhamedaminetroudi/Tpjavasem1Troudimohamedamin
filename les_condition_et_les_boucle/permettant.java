import java.util.Scanner;
public class permettant{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x;
        System.out.println("donner le temperature");
        x= sc.nextDouble();
        if(x<0){
            System.out.println("l'etat est glace");
        }else if(x<=100){
            System.out.println("l'etat eau");
        }else{
            System.out.println("vapeur");
        }
    }
}