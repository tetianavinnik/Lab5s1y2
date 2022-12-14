package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private int price;

    public String getColor() {
        return color.toString();
    }
}
