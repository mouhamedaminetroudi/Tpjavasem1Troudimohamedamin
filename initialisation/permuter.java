import java.util.Scanner;
public class permuter {
public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("donner un entier a");
    a=sc.nextInt();
    System.out.println("donner un entier b");
    b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a="+a +"b="+b); /*a=7b=10 */


    
}
}
