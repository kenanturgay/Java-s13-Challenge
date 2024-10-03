package employeeApp;

import java.util.Arrays;

public class Employee {
    private long id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(long id, String fullname, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }

    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Index out of bounds! Please provide a valid index.");
        } else if (healthplans[index] != null) {
            System.out.println("The healthplan at index " + index + " is already occupied.");
        } else {
            healthplans[index] = name;
            System.out.println("Healthplan '" + name + "' has been added at index " + index);
        }
    }
}
