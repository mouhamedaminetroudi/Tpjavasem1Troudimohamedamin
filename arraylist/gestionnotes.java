import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gestionnotes{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arl=new ArrayList<>();
        System.out.println("saisir nombre des note");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("saisir les notes");
            int no=sc.nextInt();
            if(no>20){
                System.out.println("maximaum 20");
                no=sc.nextInt();
            }else{
               arl.add(no); 
            }
            
        }
        System.out.println(arl);
        int max=Collections.max(arl);
        System.out.println("melleur note est:"+ max);
        System.out.println("quelle note suprimer");
        int ns=sc.nextInt();
        if(arl.contains(ns)){
           arl.remove(String.valueOf(ns)); 
        }else{
            System.out.println("note non trouver");
        }
        
        System.out.println(arl);
        Collections.sort(arl);
        System.out.println("trier croissant les note"+arl);
        System.out.println("donner endex  mmodifier");
        int mn=sc.nextInt();
        System.out.println("donner nouvelle note");
        int nn=sc.nextInt(); 
        
        arl.set(mn,nn); 

        System.out.println(arl);



    }
    
}