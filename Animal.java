public class Animal {

    protected enum Type {
        MAMMAL, FISH, BIRD
    }

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    private String name;
    private int legs;
    private Type type;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;

        numberOfAnimals++;

        switch (type){
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }

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

    public static int getNumberOfAnimals() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("There ")
                .append(numberOfAnimals > 1 ? "are " : "is ")
                .append(numberOfAnimals)
                .append(numberOfAnimals > 1 ? " animals" : " animal")
                .append(" in our world.");

        System.out.println(sb.toString());
        return numberOfAnimals;
    }

    public static int getNumberOfMammals(){
        StringBuilder sb = new StringBuilder();
        sb
                .append("There ")
                .append(numberOfMammals > 1 ? "are " : "is ")
                .append(numberOfMammals)
                .append(numberOfMammals > 1 ? " mammals" : " mammal")
                .append(" in our world.");

        System.out.println(sb.toString());
        return numberOfMammals;
    }

    public static int getNumberOfFish(){
        StringBuilder sb = new StringBuilder();
        sb
                .append("There ")
                .append(numberOfFish > 1 ? "are " : "is ")
                .append(numberOfFish)
                .append(numberOfFish > 1 ? " fish" : " fish")
                .append(" in our world.");

        System.out.println(sb.toString());
        return numberOfFish;
    }

    public static int getNumberOfBirds(){
        StringBuilder sb = new StringBuilder();
        sb
                .append("There ")
                .append(numberOfBirds > 1 ? "are " : "is ")
                .append(numberOfBirds)
                .append(numberOfBirds > 1 ? " birds" : " bird")
                .append(" in our world.");

        System.out.println(sb.toString());
        return numberOfBirds;
    }

}
