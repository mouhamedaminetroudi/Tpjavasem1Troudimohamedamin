import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <String> arl=new ArrayList<>();
        arl.add("Alia");
        arl.add("souad");
        arl.add("hbiba");
        System.out.println(arl);
        if(arl.contains("ala")){
            System.out.println("mawjoud😁");
        }else{
            System.out.println("moch mawjoud🫣");
        }
        arl.set(0, "mehrez");
        System.out.println(arl);
        System.out.println("ecrire le prenom suprimer");
        String ch=sc.nextLine();
        if(arl.contains(ch)){
            arl.remove(ch);

        }else{
            System.out.println("note non trouver");
        }
    }
    
}
