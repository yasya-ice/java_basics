package week7;
import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Thing> things;
    private final int maxWeight;

    public Suitcase(int total) {
        this.things = new ArrayList<>();
        this.maxWeight = total;
    }
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    public void printThings() {
        if (things.isEmpty()) {
            System.out.println("The suitcase is empty");
        } else {
            for (Thing thing : things) {
                System.out.println(thing);
            }
        }
    }
    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    @Override
    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else {
            return things.size() + " things (" + totalWeight() + " kg)";
        }
    }
}
