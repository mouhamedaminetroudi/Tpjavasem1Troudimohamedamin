import java.util.Scanner;
public class ex8 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner une phrase");
        String ch=sc.nextLine();
        int x=0;
        for(int i=0;i<ch.length();i++){
            x+=1;
        }
        System.out.println(x);
        
    }
} 