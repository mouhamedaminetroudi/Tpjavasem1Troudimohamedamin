import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class gestionetudians {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <String> arl=new ArrayList<>();
        arl.add("Alia");
        arl.add("Samira");
        arl.add("Amira");
        System.out.println(arl);
        if(arl.contains("Samira")){
            System.out.println("Samira est existe");
            }else{
                System.out.println("samira non existe");
            }
            arl.set(0,"Alia ben salah"); 
            System.out.println(arl);
            System.out.println("le nom qui suprimer");
            String ch=sc.nextLine();
            if(arl.contains(ch)){
                arl.remove(ch); 
             }else{
                 System.out.println("note non trouver");
             }
             System.out.println(arl);
             for(String n:arl){
                 System.out.println(n);
             }
             
             System.out.println();


    }
}
