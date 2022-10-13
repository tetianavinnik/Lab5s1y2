package flower_store;

import java.util.ArrayList;

public class Store {
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public boolean getFlower(Flower flower) {
        return flowers.remove(flower);
    }

    public boolean search(Flower flower) {
        return flowers.contains(flower);
    }
}
