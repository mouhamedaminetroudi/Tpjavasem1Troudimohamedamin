public class chainebuffer {
    public static void main(String[]args){
        StringBuffer ch2=new StringBuffer("l");
        StringBuffer ch1= new StringBuffer("j");
        StringBuffer ch_sb= new StringBuffer(ch1);
        ch1=ch1.append("ava");
        ch_sb=ch_sb.append("est sensible a la classe");
        System.out.println("contenue ch_sb="+ch_sb);
        System.out.println("contenue ch1="+ch1);
        boolean test=(ch1==ch_sb);
        System.out.println(test);
        if(test){
            System.out.println("ch_sb et ch1 pointent sur le meme objet !");
        }
        else{
            System.out.println("ch_sb et ch1 pointent sur des objets differents§");
        }
        ch2=ch2.append("angage");
        System.out.println(ch2);


    }
    
}
