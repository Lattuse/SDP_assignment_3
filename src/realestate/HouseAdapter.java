package realestate;

public class HouseAdapter implements Apartment {
    private final House house;

    public HouseAdapter(House house) {
        this.house = house;
    }

    @Override
    public double getArea() {
        return house.getLength() * house.getWidth();
    }
}
