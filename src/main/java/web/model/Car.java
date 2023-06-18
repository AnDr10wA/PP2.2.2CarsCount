package web.model;



public class Car {

    private String brand;

    private String model;

    private int yearOfmanufacture ;

    public Car() {
    }

    public Car(String brand, String model, int yearOfmanufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfmanufacture = yearOfmanufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfmanufacture() {
        return yearOfmanufacture;
    }

    public void setYearOfmanufacture(int yearOfmanufacture) {
        this.yearOfmanufacture = yearOfmanufacture;
    }
}
