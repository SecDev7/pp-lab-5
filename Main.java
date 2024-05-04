import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 30);
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error creating person: " + e.getMessage());
        }
    }
}
