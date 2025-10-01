package realestate;

public record HouseAdapter(House house) implements Apartment {

    @Override
    public double getArea() {
        return house.getLength() * house.getWidth();
    }

}
