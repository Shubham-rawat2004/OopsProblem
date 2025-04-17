package Encapsulation;
//Write a Java program to create a class called “Book” with private instance variables title, author, and price
// . Provide public getter and setter methods to access and modify these variables.
// Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by
// that percentage.
class  Book{
    private String title;
    private String author;
    private float price;

    Book(String title,String author,float price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }
    public float applyDiscount(float discount){
        float redPrice=discount/100*price;
        float finalPrice=price-redPrice;
        return finalPrice;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
public class Question8 {
    public static void main(String[] args) {
        Book b = new Book("The Reunion", "Robert Frost", 390.5f);
        b.setAuthor("Shubham Rawat");
        b.setPrice(200.f);
        b.setTitle("Brotherhood");
     float result= b.applyDiscount(25);
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());
        System.out.println(b.getTitle());
        System.out.println("Reduced price after discount is "+result);
    }
}