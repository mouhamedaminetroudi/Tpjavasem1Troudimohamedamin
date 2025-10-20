
import java.util.Scanner;
public class demoBuffer{
    public static void main(String[]args){
         //StringBuffer ch1=new StringBuffer("j");        
        //StringBuffer ch2=new StringBuffer();
        
  /*      ch2=ch2.append("l");
        //ch2=ch1.append("l");
        System.out.println("ch2="+ch2);
        System.out.println("ch1="+ch1); */


/*         String s1="j";
        String s2=s1;
        s1=s1.concat("ava");

        System.out.println("s1="+s1);
        System.out.println("s2="+s2); */


/*         StringBuffer s1=new StringBuffer("j");
        StringBuffer s2=s1;
        s1=s1.append("ava");
        System.out.println(s1);
        System.out.println(s2);
 */



/* StringBuffer ch_sb=ch1;
ch1=ch1.append("ava");
ch_sb=ch_sb.append("est sensible ala case");
System.out.println(ch1);
System.out.println(ch_sb);
boolean test=(ch_sb==ch1);
if(test){
    System.out.println("ch_sb et ch1 pointer sur le meme objet"); bstringtokenizer separation par espace


}else{
    ch2=ch2.append("angage");
    System.out.println("ch2="+ch2);
} */



 Scanner sc=new Scanner(System.in);
System.out.println("veillez saisir une phrase");
//String ch2=sc.nextLine();
StringBuffer ch=new StringBuffer(sc.nextLine());

System.out.println("le contenu de string bufferest :"+ch);// retourner don ch le contenu de ch2
sc.close(); 







    }
}