package Encapsulation;
//Write a Java program to create a class called House with private instance variables address, numberOfRooms
// , and area. Provide public getter and setter methods to access and modify these variables.
// Add a method called calculatePrice() that returns the price of the house based on its area and a price
// per square meter.

class House{
    private String address;
    private int noOfRooms;
    private float area;

    public float calculatePrice(float pricePerSqMeter) { //
        float price=area*pricePerSqMeter;
        return price;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
public class Question10 {
    public static void main(String[] args) {
House h=new House();
h.setArea(250.f);
h.setAddress("Kaligaon Village ,Molekhal Market,Almora,Uttrakhand");
h.setNoOfRooms(2);
float res=h.calculatePrice(20);
        System.out.println(h.getAddress());
        System.out.println(h.getArea());
        System.out.println(h.getNoOfRooms());
        System.out.println(res);
    }
}
