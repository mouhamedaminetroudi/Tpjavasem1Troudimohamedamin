import java.util.Scanner;
public class ex5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire phrase");
        String ch=sc.nextLine();
        while(ch.length()>50){
            System.out.println("ecrire chaine ne deppaser 50 charactere");
            sc.nextLine();
        }
        int s=0,ss=0;
        
        for(int i=0;i<ch.length();i++){
            
            if(Character.isLowerCase(ch.charAt(i))){
                s+=1;
            }
            else{
                ss+=1;
            }
        }
        System.out.println("miniscule:"+s );
        System.out.println("majuscul:"+ss);
    }
    
}
