import java.util.StringTokenizer;
public class debug3 {
    public static void main(String[] args) {
        String phrase= "java est amusant";
        StringBuffer sb=new StringBuffer(phrase);
        sb.reverse();
        System.out.println(sb);
        StringTokenizer st=new StringTokenizer(phrase," ");
        int c=0;
        while(st.hasMoreTokens()){
            
            String mot=st.nextToken();
            c++;
            System.out.println(mot);
        }
        System.out.println(c);
    }
}
