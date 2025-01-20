public class repasoexamen {
    public static String[] mensajes = {
            "Hola123 Mundo",
            "Es un ejemplo",
            "1Manzana2peras3uvas",
            "El reto está aquí",
            "Aventura increíble 45"
    };
    public static void main(String[] args) {
        maslarga();
        trespalabras();
        vocal();
        numeros();
        trescaracteres();
    }

    public static void maslarga(){
        String maslarga="";
        int longmaslarga=0;
        /*
        for (int i = 0; i < mensajes.length; i++) {
            if (longmaslarga<mensajes[i].length()){
                longmaslarga=mensajes[i].length();
                maslarga=mensajes[i];
            }
        }
         */
        for(String m: mensajes){
            if (longmaslarga<m.length()){
                longmaslarga=m.length();
                maslarga=m;
            }
        }
        System.out.println(maslarga+" "+longmaslarga);
    }
    public static void trespalabras(){
        String[] ps;
        for(String m: mensajes){
            ps=m.split(" ");
            if(ps.length == 3){
                System.out.println(ps[1]);
            }
        }
    }
    public static void vocal(){
        int n=0;
        for(String m: mensajes){
            char c = m.toLowerCase().charAt(0);
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
                n++;
            }
        }
        System.out.println(n);
    }
    public static void numeros(){
        int suma=0;
        for(String m: mensajes){
            for (int i = 0; i < m.length(); i++) {
                char d = m.charAt(i);
                if((d=='0')||(d=='1')||(d=='2')||(d=='3')||(d=='4')||(d=='5')||(d=='6')||(d=='7')||(d=='8')||(d=='9')){
                    suma+=Character.getNumericValue(d);
                }
            }
        }
        System.out.println(suma);
    }

    public static void trescaracteres(){
        String resul="";
        String aux="";
        for (String m:mensajes){
            aux=m.replaceAll(" ","");
            resul+=aux.substring(0,3);
        }
        System.out.println(resul);
    }
}
