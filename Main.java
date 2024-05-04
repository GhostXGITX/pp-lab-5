import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person[] people =new Person[5];

            final int b = 10;

            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Jack Rabbit", 20);
            people[2] = new Person("Will Smith", 27);
            people[3] = new Person("Gary Roger", 35);
            people[4] = new Person("Rob Lil", 56);
            

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                System.out.println("Result for " + person.getName() + " + " + result);

                Messenger messenger = new EmailMessenger();
                messenger.sendMessage("The result for " + person.getName() + " is: " + result);
            }
            
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }

}
