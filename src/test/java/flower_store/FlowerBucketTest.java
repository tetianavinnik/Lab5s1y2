package flower_store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private Rose.FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new Rose.FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    private void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

}
