public class reverse {

   static void dil(String any){

       StringBuffer stringBuffer=new StringBuffer();
       stringBuffer.append(any);
       stringBuffer.reverse();
       System.out.println(stringBuffer);
       stringBuffer.append(" hell no to u");
       System.out.println(stringBuffer);
    }




    public static void main(String [] args){
        System.out.println("Hello ashutosh");
        dil("earth");
        dil("moon");
    }
}
