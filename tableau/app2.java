import java.util.Scanner;

public class app2 {
    public static boolean saisirn(int n){
        if(n>0){
            return true;
        }else{
            return false;
        }
    }
    public static int[] remplir(int[]t,int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("remplir les case");
            t[i]=sc.nextInt();
            while(saisirn(t[i])==false){
                System.out.println("moyen strictement positif");
                t[i]=sc.nextInt();
            }
            
        }
        return t;
    }
    public static int calcmoyen(int[]t,int n){
        int tot=0;
        int moy;
        for(int i=0;i<n;i++){
            tot+=t[i];
            

        }
        moy=tot/n;
        return moy;
    }
    public static int nombredenote(int[]t,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(t[i]>calcmoyen(t,n)){
                count++;
            }
        }
        return count;
    }
    public static void affiche(int[]t){
        System.out.print("[");
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
        }
        System.out.print("]");
        System.out.println("le tableau");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir taille de tableau");
        int n=sc.nextInt();
        while(n<10){
            System.out.println("saisir taille de tableau");
            n=sc.nextInt();
        }
        int []t=new int[n];
        int[]tab=remplir(t, n);
        
        affiche(tab);
        System.out.println("moyenne ="+calcmoyen(tab, n));
        System.out.println("les note>moyene="+nombredenote(tab, n));
        
    }
}
