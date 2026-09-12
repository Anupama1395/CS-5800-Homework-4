public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        setName(name);
        setYearBuilt(yearBuilt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = requireText(name, "Ship name");
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = requireText(yearBuilt, "Year built");
    }

    public void print() {
        System.out.println("Ship name: " + name);
        System.out.println("Year built: " + yearBuilt);
    }

    protected static String requireText(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be blank.");
        }
        return value.trim();
    }
}
