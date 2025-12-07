import java.util.Scanner;
public class saisirBuffer {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("veiller saisir une phrase");
        String ch=sc.nextLine();
        StringBuffer ch1=new StringBuffer(ch);
        System.out.println(ch1);
        boolean res;
        res=(ch.equals(ch1));
        sc.close();
    }

    
}
