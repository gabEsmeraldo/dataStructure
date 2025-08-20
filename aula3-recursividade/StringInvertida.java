public class StringInvertida {
    public static String inverter(String str){
        if(str.length() == 1){return str;}
        return inverter(str.substring(1)) + str.charAt(0); 
    }
    public static void main(String[] args) {
        String string = "Socorram-me subi no onibus em marrocos";
        System.out.println(string);
        System.out.println(inverter(string));
    }    
}
