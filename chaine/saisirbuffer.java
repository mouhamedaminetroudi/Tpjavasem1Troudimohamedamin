import java.util.Scanner;
public class saisirbuffer {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("veuiller saisir une phrase");
        String ch1=sc.nextLine();
        StringBuffer ch=new StringBuffer(ch1);
        System.out.println("ch="+ch);
    }
}
