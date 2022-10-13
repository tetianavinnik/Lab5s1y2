package flower_store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }

    public int getPrice() {
        int total = 0;
        for (int i = 0; i<packs.size(); i++) {
            total += packs.get(i).getPrice();
        }
        return total;
    }
}
