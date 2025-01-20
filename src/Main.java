public class Main {
    public static void main(String[] args) {
        int num1=5;
        int num2=199;
        int suma=0;
        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                suma=suma+i;
            }
        }
        System.out.println(suma);
    }
}