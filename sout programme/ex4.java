import java.util.Scanner;

public class ex4 {
    public static boolean lectureN(int a){
        if (a>0){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean estarmstrong(int x){
        int a=0;
        String b=String.valueOf(x);
        for(int i=0;i<b.length();i++){
            a+=Math.pow((int)(b.charAt(i)), 3);
        }
        if(a==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner un entier inferieur 1000");
        int t=sc.nextInt();
        while(t>1000){
            System.out.println("donner un entier inferieur 1000");
            t=sc.nextInt();
        }
        if(lectureN(t)){
            if(estarmstrong(t)){
                System.out.println("entier est armastrong");
            }
            else{
                System.out.println("entier est non armastrong");
            }
        }
    }
}
