package flower_store;

import java.util.ArrayList;

public class Rose extends Flower{
    public static class FlowerBucket {
        private ArrayList<FlowerPack> packs;

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
}
