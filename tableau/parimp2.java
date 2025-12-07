import java.util.Scanner;
public class parimp2 {
    public static void affiche(int[]t){
        System.out.print("[");
       for(int i=0; i<t.length; i++){
           System.out.print(t[i]+" ");

       } 
       System.out.print("]");
    }
public static int[]tpair(int[]t){
    int countp=0;
    
    for(int i=0;i<t.length;i++){
        if(t[i]%2==0){
            countp++;
        }

    }

    int[]tpair=new int[countp];
    int j=0;
    for(int i=0;i<t.length;i++){
        if(t[i]%2==0){
            tpair[j]=t[i];
            j++;
        }
    }
    return tpair;

}
public static int[]timpaire(int[]t){
    int count=0;
    for(int i=0;i<t.length;i++){
        if(t[i]%2!=0){
            count++;
        }
    }
    int[]timpaire=new int[count];
    int j=0;
    for(int i=0;i<t.length;i++){
        if(t[i]%2!=0){
            timpaire[j]=t[i];
            j++ ;
        }
    }
    return timpaire;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir taille de tableau");
        int n=sc.nextInt();
        while(n<=0){
            System.out.println("saisir taille de tableau");
            n=sc.nextInt();

        }
        int[] tab1 =new int[n];

        for(int i=0;i<n;i++){
            System.out.println("saisir les case");
            tab1[i]=sc.nextInt();

        



    }

    affiche(tab1);
    System.out.println("tableau");
    
    affiche(tpair(tab1));
    System.out.println("tableau pair entier");
    affiche(timpaire(tab1));
    System.out.println("tableau impair entier");
    
}}
