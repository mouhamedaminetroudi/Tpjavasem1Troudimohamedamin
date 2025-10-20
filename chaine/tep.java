import java.util.Scanner;

public class tep{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
/*         String s1="j";
        String s2=s1;
        s1=s1.concat("ava");
        System.out.println(s1);
        System.out.println(s2); */
        StringBuffer s1=new StringBuffer("j");
        
        StringBuffer s2=s1; 
        s1=s1.append("ava");
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);

    }
}