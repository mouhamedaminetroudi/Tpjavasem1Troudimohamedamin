import java.util.Scanner;

public class app1 {
    public static boolean lecturen(int n){
        
        
        if(n>0){
            return true;
        }else{
            return false;
        }
    }
    public static int[]remplirtab(int[]t,int n){
        Scanner sc=new Scanner(System.in);

        
        for(int i=0;i<n;i++){
            System.out.println("remplir les case");
            t[i]=sc.nextInt();
            while(!lecturen(t[i])){
                System.out.println("l'entier obligatoirement positif");
                t[i]=sc.nextInt();
            }
            
        }
        return t;
    }
    public static int[]remlacer(int x1,int[]t){
        Scanner sc=new Scanner(System.in);
        System.out.println("ecrire neavelle entier");
        int x2=sc.nextInt();
        for(int i=0;i<t.length;i++){

            if(x1==t[i]){
                t[i]=x2;
            }
            
        }
        return t;
    }
    public static void affiche(int[]t){
        System.out.print("[");
       for(int i=0; i<t.length; i++){
           System.out.print(t[i]+" ");

       } 
       System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir taille de tableau");
        int n=sc.nextInt();
        while(n<=0){
            System.out.println("saisir taille de tableau");
            n=sc.nextInt();

        }
        int[]t=new int[n];
        int[]tab=remplirtab(t,n);
        affiche(tab);
        System.out.println("le tableau");
        System.out.println("ecrire x1");
        int x1=sc.nextInt();
        affiche(remlacer(x1, tab));
        


        

    }
}
