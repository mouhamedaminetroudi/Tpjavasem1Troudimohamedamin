import java.util.Scanner;

public class ex1 {
    public static boolean lectureN(int a){
        if (a>0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean estpair(int b){
        if(b%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int x=0;
        int y=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=10;i++){
            System.out.println("ecrire un entier");

            int s=sc.nextInt();
            if(lectureN(s)){
                if(estpair(s)){
                    System.out.println("l'entier est paire");
                    x+=1;
                }else{
                    System.out.println("l'entier est impaire");
                    y+=1 ;
                }

            }

        }
        System.out.println("l'entier paire ="+x);
        System.out.println("l'entier impaire ="+y);
    }
}
