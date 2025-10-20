import java.util.Scanner;
public class ex6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire verbe ");
        StringBuffer ch=new StringBuffer(sc.nextLine());
        while((ch.charAt(ch.length()-2)!='e')&&(ch.charAt(ch.length() -1)!='r')){
            System.out.println("ecrire verbe finit par er");
            ch.append(sc.nextLine());
           
        }
        String ch1="";
        String ch2="";
        for(int i =0;i<ch.length()-1;i++){
           ch1+=ch.charAt(i); 
        }
        for(int i =0;i<ch.length()-2;i++){
            ch2+=ch.charAt(i); 
         }

        char a='s';
        String b="ons",c="ez",d="ent";
        System.out.println("leconjugaison: "+ch1+" "+(ch1+a)+" "+ch1+" "+(ch2+b)+" " +(ch2+c)+" "+(ch2+d));
        
        
    }
}
