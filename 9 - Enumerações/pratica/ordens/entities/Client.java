package entities;

import java.time.LocalDate;

public class Client {
    private String name; 
    private String email; 
    private LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
