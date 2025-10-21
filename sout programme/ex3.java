import java.util.Scanner;

public class ex3 {
    public static boolean lectureN(int a){
        if (a>0){
            return true;
        }else{
            return false;
        }
    }
    public static int calculsomme(int x){
        int a=0;
        
        for(int i=1;i<=x;i++){
            a+=i*i; //math.pow(i,2)

        }
        return a;
        
    } 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("dounner un entier");
        int b=sc.nextInt();
        if(lectureN(b)){
            System.out.println(calculsomme(b));
        }
    }
}
