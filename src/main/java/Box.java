import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> itemsInBox;
    private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable item) {
        double newTotalWeight = this.weight() + item.weight();

        if (item == this) {
            System.out.println("Cannot add box to itself!");
            return;
        }

        // Check if adding the item stays within the maximum capacity
        if (newTotalWeight <= maximumCapacity) {
            itemsInBox.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable item : this.itemsInBox) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
