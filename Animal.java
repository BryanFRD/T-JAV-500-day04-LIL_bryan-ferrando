public class Animal {

    protected enum Type {
        MAMMAL, FISH, BIRD
    }

    private String name;
    private int legs;
    private Type type;

    public Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;

        System.out.println("My name is " + getName() + " and I am a " + getType());
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type.name().toLowerCase();
    }

    public void setType(Type newType) {
        this.type = newType;
    }

}
