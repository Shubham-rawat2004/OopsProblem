package Inheritance;
//. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

    class  Person{
        private String firstName;

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        private String  lastName;

    }
    class  Employees extends Person {
         private Employee id;

        public Employee getId() {
            return id;
        }

        public void setId(Employee id) {
            this.id = id;
        }
        @Override
        public String getLastName() {
            return super.getLastName().toUpperCase()+" Software Engineer ";
        }
    }

public class Question7{
    public static void main(String[] args) {

    }
}