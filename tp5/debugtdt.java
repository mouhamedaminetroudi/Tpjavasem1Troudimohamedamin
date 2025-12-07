import java.util.StringTokenizer;
import java.util.Scanner;
public class debugtdt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir une phrase");
        String ch=sc.nextLine();
        StringTokenizer st=new StringTokenizer(ch," ");
        String c1;
        String longmot;
        String phrase= "java est amusant";
        
        while(st.hasMoreElements()){
            String mot=st.nextToken();
            System.out.println(mot);
            for(int i=0;i<mot.length();i++){

            }
        }
        
        



    }
    
}
