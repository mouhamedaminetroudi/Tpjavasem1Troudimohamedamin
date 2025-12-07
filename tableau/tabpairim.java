import java.util.Scanner;

public class tabpairim {
    public static boolean lecturen(int n){
        if(n>0){
            return true;
        }else{
            return false;
        }
    }
    public static void affiche(int[]t){
        System.out.print("[");
        for(int i=0 ;i<t.length;i++){
            System.out.print(t[i]+" ");
        }
        System.out.print("]");
    }
    
    public static int[] remplir(int[]t,int n){
        
        for(int i=0;i<n;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("remplir");
            t[i]=sc.nextInt();
            while(!lecturen(t[i])){
                System.out.println("enti obligatoire positif");
                t[i]=sc.nextInt();
            }

        }
        return t;
    }
    public static int[]tpair(int[]t,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(t[i]%2==0){
                count++;
            }
        }
        int[] tpair=new int[count];
        int j=0;
        for(int i=0;i<n;i++){
            if(t[i]%2==0){
                tpair[j]=t[i];
                j++;
            }
        }
        return tpair;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir la taille de tableau");
        int n=sc.nextInt();
        while(n<=0){
            System.out.println("saisir la taille de tableau");
            n=sc.nextInt(); 
        }
        int[] t=new int[n];
        int[] tab=remplir(t, n);
        affiche(tab);
        System.out.println();
        affiche(tpair(tab, n));

    }
}
