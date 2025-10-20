import java.util.Scanner;
public class ex5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire une chane");
        String ch1=sc.nextLine();
        while(ch1.length()>50){
            System.out.println("ecrire une chaine");
             ch1=sc.nextLine();
        }
        int s=0;
        for(int i=0;i<ch1.length();i++){
            char x;
            x=(ch1.charAt(i));
            if(Character.isLowerCase(x)){
                s+=1;
            }

        }
        System.out.println(s);
    }
}
