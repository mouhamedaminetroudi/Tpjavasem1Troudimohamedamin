public class stringBuffer {
    public static void main(String[]args){
/*         String s="java";
        s=s.concat("est cool");
        System.out.println(s); */
/*         
        StringBuffer sb=new StringBuffer("java");
        sb.append("est cool");
        System.out.println(sb); */
/*         String s="j";
        String s2=s;
        s=s.concat("ava");
        System.out.println(s);
        System.out.println(s2); */
        StringBuffer ch = new StringBuffer("j");
        StringBuffer s1=ch;
        ch.append("ava");
     String   c=ch.substring(2,4);
        
        System.out.println("ch="+ch+"s1="+s1);
        System.out.println(c);

    }
    
}
