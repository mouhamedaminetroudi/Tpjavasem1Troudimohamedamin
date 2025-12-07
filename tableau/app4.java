import java.util.Scanner;



public class app4 {
    public static boolean lecturen(int[][]t){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(t[i][j]<=0){
                    return false;

                }
            }    
        }  
        return true;     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("donner nobre de ligne");
        int l=sc.nextInt();
        System.out.println("saisir nobre de colone");
        int c=sc.nextInt();
        int[][] mat=new int[l][c];
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                System.out.println("remplir matrice");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("la matrice =");
        for(int i=0;i<l;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}
