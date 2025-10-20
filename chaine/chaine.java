import java.util.Scanner;


public class chaine {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("saisir une prase");
            String ch2=sc.nextLine();
            
           
            while(ch2.length()>30){
                System.out.println("saisir une prase");
                
                

        }
        String ch1="";
        
        for(int i=0;i<ch2.length();i++){
            char car;
            car = ch2.charAt(i);
         

            if (!(car == ' ' || car==',')){
                car=ch2.charAt(i);
                int code=(int)(car);
                
                ch1+=(char)(code+3);

            }
            

            
            
        }
        System.out.println(ch1);

}}
