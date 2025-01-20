package POO.herencia;

class Animal {
    private String name;
    private String sound;
    private int noOfLegs;

    public Animal(String name, String sound, int noOfLegs) {
        this.name = name;
        this.sound = sound;
        this.noOfLegs = noOfLegs;
    }
    public Animal(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void comer(){
        System.out.println("MM que rico!!");
    }

}