package Encapsulation;
//Write a Java program to create a class called Smartphone with private instance variables brand,
// model, and storageCapacity. Provide public getter and setter methods to access and modify these variables
// . Add a method called increaseStorage() that takes an integer value and increases the storageCapacity
// by that value.

class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

public  int increaseStorage(int storage){
    storageCapacity=storageCapacity+storage;
    return storageCapacity;
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

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
public class Question9 {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.setBrand("iPhone");
        sp.setModel("i-Phone16ProMax");
        sp.setStorageCapacity(4);
        sp.increaseStorage(5);
        System.out.println(sp.getBrand());
        System.out.println(sp.getModel());
        int updatedStorage=sp.getStorageCapacity();
        System.out.println("Updated Storage is "+ updatedStorage);
    }
}
