import java.util.Scanner;
public class ex4 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("ecrire paragraphe ne depasser 30 character");
        String ch=sc.nextLine();
        while(ch.length()>30){
            System.out.println("ecrire chane ne pas depasser 30 charactere");
            sc.nextLine();
        }
        int a;
        char x;
        String ch1="";
        for(int i=0;i<ch.length();i++){
           x=(ch.charAt(i));
           a=((int)(x)+3);
           ch1+=(char)(a);
        }
        System.out.println(ch1);
    }
    
}
