public class GreatShark extends Shark {

    public GreatShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        return !(animal instanceof Canary) && super.canEat(animal);
    }

    @Override
    public boolean eat(Animal animal) {
        if(animal instanceof Canary){
            System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            return false;
        } else if(animal instanceof Shark){
            System.out.println(getName() + ": The best meal one could wish for.");
            return true;
        }

        return super.eat(animal);
    }

}
