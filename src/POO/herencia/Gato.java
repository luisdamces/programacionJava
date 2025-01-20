package POO.herencia;

public class Gato extends Animal{
    private String color;
    private String raza;

    public Gato(String name, String sound, int noOfLegs, String color, String raza) {
        super(name, sound, noOfLegs);
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void acariciar(){
        System.out.println("Pprrrrrrrrr");
    }
}
