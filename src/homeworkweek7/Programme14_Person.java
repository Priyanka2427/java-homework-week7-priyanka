package homeworkweek7;

/**
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.Constructor used
  */

public class Programme14_Person {

    private String firstName;
    private String lastName;
    private int age;

    // Method to get the first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get the last name
    public String getLastName() {
        return lastName;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    // Method to set the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to set the age with validation
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if the person is a teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method to get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Programme14_Person person = new Programme14_Person(); // Constructor always start with classname.
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }
}


