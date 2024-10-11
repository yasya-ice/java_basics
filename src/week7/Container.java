package week7;
import java.util.ArrayList;

public class Container {
    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases;
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "empty (0 kg)";
        } else {
            return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }
}
