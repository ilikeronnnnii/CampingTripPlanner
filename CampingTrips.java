import java.util.Vector;

class CampingTrips {
    private final String name;
    private final String location;
    private final Vector<Budget> budgets;

    public CampingTrips(String name, String location, Vector<Budget> budgets) {
        this.name = name;
        this.location = location;
        this.budgets = budgets;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Vector<Budget> getBudgets() {
        return budgets;
    }
}