import java.util.Scanner;
public class ex2 {
    public static boolean lectureN(int a){
        if (a>0){
            return true;
        }else{
            return false;
        }
    }
    public static int compter(String ch) {
        int s=0;
        for(int i=0;i<ch.length();i++){
            if(ch.charAt(i)!=','){
                s=i;
            }
        }
        return s+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire un entie");
        int a=sc.nextInt();
        String ch1=String.valueOf(a);
        
        if(lectureN(a)){
            System.out.println("le somme de chiffre est :"+compter(ch1));
        }
    }
}
