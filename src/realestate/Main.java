package realestate;

public class Main {
    public static void main(String[] args) {
        Apartment flat = new StandardApartment(80);
        System.out.println("Apartment area: " + flat.getArea());

        House villa = new House(10, 15);
        Apartment villaAsApartment = new HouseAdapter(villa);

        System.out.println("Villa (as apartment) area: " + villaAsApartment.getArea());
    }
}