public class GreatShark extends Shark {

    public GreatShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        return !(animal instanceof Canary) && super.canEat(animal);
    }

    @Override
    public void eat(Animal animal) {
        if(animal instanceof Canary){
            System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
        } else if(animal instanceof Shark){
            System.out.println(getName() + ": The best meal one could wish for.");
        }

        super.eat(animal);
    }

}
