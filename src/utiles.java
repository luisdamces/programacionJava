public class utiles {
    public static int calculaMinimo(int[] numeros){
        int min = 99999;
        for (int i = 0; i < numeros.length; i++) {
            if(min>numeros[i]){
                min=numeros[i];
            }
        }
        return min;
    }
    public static int calculaMaximo(int[] numeros){
        int max = -999999;
        for (int i = 0; i < numeros.length; i++) {
            if(max<numeros[i]){
                max=numeros[i];
            }
        }
        return max;
    }
}
