package Encapsulation;
//Write a Java program to create a class called Product with private instance variables productName,
// productCode, and price. Provide public getter and setter methods to access and modify these variables
// . Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.

class  Product{
    private String productName;
    private int productCode;
    private float price;

    Product(String  productName,int productCode,float price){ // constructor created to initializer object variable
        this.productCode=productCode;
        this.productCode=productCode;
        this.price=price;
    }
    public float applyDiscount(float disPercantage){
       float finalprice=price-disPercantage/100*price;
       return finalprice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class Question11 {
    public static void main(String[] args) {
        Product p=new Product("Nivea",34,300f);
        p.setPrice(300);
        p.setProductCode(999);
        p.setProductName("MamaEarth");
       float netPrice= p.applyDiscount(40);
        System.out.println(p.getPrice());
        System.out.println(p.getProductCode());
        System.out.println(p.getProductName());
        System.out.println(netPrice);
    }
}
