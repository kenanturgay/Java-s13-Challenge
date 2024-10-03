package employeeApp;

import java.util.Arrays;

public class Company {

    private long id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(String name, long id, int giro, String[] developerNames) {
        this.name = name;
        this.id = id;
        setGiro(giro); // Giro'yu setter ile ayarladık.
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        if (giro < 0) {
            this.giro = 0; // Negatif değer olamaz.
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Index out of bounds! Please provide a valid index.");
        } else if (developerNames[index] != null) {
            System.out.println("The employee at index " + index + " is already occupied.");
        } else {
            developerNames[index] = name;
            System.out.println("Employee '" + name + "' has been added at index " + index);
        }
    }


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
