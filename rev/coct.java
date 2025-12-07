import java.util.Scanner;
import java.util.StringTokenizer;

public class coct {
    public static int count(String ch) {
        int v = 0, b = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isLowerCase(ch.charAt(i))) {
                v += 1;

            } else {
                b += 1;
            }
        }
        return v;

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire phrase");
        String ch=sc.nextLine();
        int v=count(ch);
        System.out.println(v);
        StringTokenizer st1=new StringTokenizer(ch," ");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        if(count(ch)==0){
            ch=ch.toLowerCase();
            System.out.println(ch);
        }

    }

}
