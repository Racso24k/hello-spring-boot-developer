package acme.com.spring.boot.platform.generic.domain.model.entity;

import java.util.UUID;

public class Developer {
    private final UUID id =  UUID.randomUUID();
    private String firstName;
    private String lastName;

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public boolean hasAnyNameBlank() {
        return firstName != null && lastName != null;
    }

    public boolean hasAnyNameEmpty() {
        return firstName == null || lastName == null;
    }


}
