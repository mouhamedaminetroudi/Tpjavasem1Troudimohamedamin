public class operationLogique {
    public static void main(String[] args) {
        int a=6 , b=21 ;
        Boolean res;
        res= a>b ;
        System.out.println("a>b?" + res); /*a>b?false */
        res=!(a>b);
        System.out.println("!(a>b)?"+res);/*!(a>b)?true */
        res = a<b;
        System.out.println("a<b?"+res);/*a<b?true */
        res =a==b;
        System.out.println("a==b?"+res);/*a==b?false */
        res=a!=b;
        System.out.println("a!=b?"+res);/*a!=b?true */
        res=(a<b)&(a==b);
        System.out.println("(a<b)&(a==b)?"+res);/*(a<b)&(a==b)?false */
        res=(a<b)|(a==b);
        System.out.println("res=(a<b)|(a==b)?"+res);/*res=(a<b)|(a==b)?true */
        res=(a<b)^(a==b);
        System.out.println("res=(a<b)^(a==b)?"+res);/*res=(a<b)^(a==b)?true */
        res=a<b?true:false ;
        System.out.println("res=a<b?true:false?"+res);/*res=a<b?true:false?true */
        
    }
    
}
