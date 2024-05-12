package sofka.com.co.models;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import sofka.com.co.tasks.login.LoginInSauce;

public class User {

    Faker faker = new Faker();

    private final String firstName = faker.name().firstName();

    private final String lastName = faker.name().lastName();

    private final String postalCode = faker.address().zipCode();



    public String getLastName() {
        return lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public static User userInfpormation() {
        return new User();
    }
}
