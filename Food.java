class Food extends Budget {
    private final String name;
    private final int quantity;

    public Food(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}