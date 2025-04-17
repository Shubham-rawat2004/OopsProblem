package Encapsulation;
//Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.
class Car{

    private String company_Name;
    private String model_Name;
   private int year ;
   private float mileage;

     Car(String company_Name,String model_Name,int year,float mileage){  // constructor used to initialize object variables
         this.company_Name=company_Name;
         this.model_Name=model_Name;
         this.year=year;
         this.mileage=mileage;
     }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getModel_Name() {
        return model_Name;
    }

    public void setModel_Name(String model_Name) {
        this.model_Name = model_Name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float distance,float petrolUsed) {
        float mileage=distance/petrolUsed;
        this.mileage=mileage;
    }
}
public class Question6 {
    public static void main(String[] args) {
    Car cc=new Car("Hyundai","H23",2008,40);
    cc.setMileage(1200,9);
    cc.setCompany_Name("THAR");
    cc.setYear(2026);
    cc.setModel_Name("T26");
        System.out.println(cc.getCompany_Name());
        System.out.println(cc.getMileage());
        System.out.println(cc.getModel_Name());
        System.out.println(cc.getYear());

    }
}
