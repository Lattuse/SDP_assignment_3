package realestate;

public class StandardApartment implements Apartment {
    private double area;

    public StandardApartment(double area) {
        this.area = area;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Area must be positive");
        }
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}
