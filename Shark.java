public class Shark extends Animal {

    private boolean frenzy = false;

    public Shark(String name){
        super(name, 0, Type.FISH);

        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean blood){
        this.frenzy = blood;
    }

    public void status(){
        if(frenzy){
            System.out.println(getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(getName() + " is swimming peacefully.");
        }
    }

}
