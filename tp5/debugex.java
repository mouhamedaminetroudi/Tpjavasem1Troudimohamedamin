import java.util.Scanner;

public class debugex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer entier");
        int n=sc.nextInt();
        int somme=0;
        for(int i=0;i<=n;i++){
            somme+=1;

        }
        System.out.println("la somme entie "+n+" est "+somme);
        sc.close();

    }
}
