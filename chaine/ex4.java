import java.util.Scanner;
public class ex4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire phrase");
        String ch=sc.nextLine() ;
        while(ch.length()>30){
            System.out.println("ecrire phrase");
            ch=sc.nextLine();
            
        }
        char a;
        String ch1="";
        for(int i=0;i<ch.length();i++){
            a=ch.charAt(i);
            int code=(int) (a);
            ch1+=(char)(code+3);
            

            
        }
        System.out.println("new chaine="+ch1);
    }

}
 