import java.util.StringTokenizer;

public class noveaux {
    public static void main(String[]args){
        String texte1="dsfqs sqdsd qsdsd" ;
        StringTokenizer st1 =new StringTokenizer(texte1," ");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

    }
}
