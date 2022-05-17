public class Address {
    private String town;
    private String street;
    private int building;
    private int flat;

    public Address(String town, String street, int building, int flat){
        this.town = town;
        this.street = street;
        this.building = building;
        this.flat = flat;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setBuilding(int building) {
        this.building = building;
    }
    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address: " +
                "town='" + this.town + '\'' +
                ", street='" + this.street + '\'' +
                ", building=" + this.building +
                ", flat=" + this.flat +
                ';';
    }
}
