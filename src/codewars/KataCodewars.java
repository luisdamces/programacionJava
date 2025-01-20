package codewars;

public class KataCodewars {
    public static void main(String[] args) {
        /*
        int[] resl=twoSum(new int[]{1, 2, 3}, 4);
        System.out.println(resl[0]);
        System.out.println(resl[1]);
        */
        //System.out.println(getCount2("Hola que tal"));
        //System.out.println(squareDigits(9119));
        System.out.println(escuadradoper(25));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] resl=new int[2];
        for(int i=0; i<numbers.length;i++){
            for(int j=0; j<numbers.length;j++){
                if(i!=j){
                    if(numbers[i]+numbers[j]==target){
                        resl[0]=i;
                        resl[1]=j;
                    }
                }
            }
        }
        return resl;
    }
    public static int getCount(String str) {
        String[] vocales = {"a", "e", "i", "o", "u"};
        int cont=0;
        //recorre cadena por sus posiciones
        for(int i=0; i<str.length();i++){
            //recorre vacales
            for(String v:vocales){
                //compara cada caracter, convirtiendo a String y compara con la vocal
                if(Character.toString(str.charAt(i)).equals(v)){
                    cont++;
                }
            }
        }
        return cont;
    }
    public static int getCount2(String str) {
        int cont=0;
        //recorre cadena por sus posiciones
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                cont++;
            }
        }
        return cont;
    }
    public static String disemvowel(String str) {
        String[] vocales = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for(String v:vocales){
            str = str.replaceAll(v, "");
        }
        return  str;
    }
    //  811181               9119
    public static int squareDigits(int n) {
        //"9119"
        String numero = Integer.toString(n);
        int digito=0;
        String resultao="";
        for(int i=0;i<numero.length();i++){
            //"9" -- 9
            digito=Character.getNumericValue(numero.charAt(i));
            //81
            digito=digito*digito;
            resultao=resultao+digito;
        }
        return Integer.parseInt(resultao); // TODO Implement me
    }

    public static boolean escuadradoper(int n){
        String numero="";
        boolean decimal = false;
        char digito;
        int suma=0;
        for(int i=0;i<numero.length();i++){
            digito=numero.charAt(i);
            if(digito=='.'){
                decimal=true;
            }
            if(decimal==true){
                suma+=Character.getNumericValue(numero.charAt(i));
            }
        }
        if(suma==0){
            return true;
        }
        return false;
    }

}
