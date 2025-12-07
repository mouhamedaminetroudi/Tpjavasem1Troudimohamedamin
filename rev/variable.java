import java.util.Scanner;

public class variable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("doner entier x");
        x=sc.nextInt();
        System.out.println("saisir un entier y");
        y=sc.nextInt();
        x=y+x;
        y=x-y;
        x=x-y;
        System.out.println("x="+x+"y="+y);
        System.out.println(Math.abs(-5));
    }

}
