class Transportation extends Budget {
    private String name;

    public Transportation(String name, double cost) {
        this.name = name;
        setCost(cost);
    }

    public String getName() {
        return name;
    }
}