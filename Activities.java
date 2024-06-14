import java.awt.*;

class Activities extends Budget {
    private final String name;
    private final Color color;

    public Activities(String name, double cost, Color color) {
        this.name = name;
        setCost(cost);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}