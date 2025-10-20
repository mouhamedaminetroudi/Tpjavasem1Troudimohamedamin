import java.util.Scanner;
public class ex7 {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ecrire un entier");
       int nombre=sc.nextInt();
       String chaine=String.valueOf(nombre);
       System.out.println("l'entier convertir en chaine "+chaine);
   } 
}
