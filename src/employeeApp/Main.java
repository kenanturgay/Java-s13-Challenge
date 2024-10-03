package employeeApp;

import java.util.Calendar;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        String[] developerNames= new String[5];
        Company company = new Company("Turgay",34,15000000,developerNames);


        String[] healthPlans= new String[5];
        Employee employee = new Employee(36, "Kenan Turgay","kenan@gmail.com","password123", healthPlans);

        Healthplan healthplan = new Healthplan(47,"Berat", Plan.NAME);

        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthplan);

        company.addEmployee(0,"Berat Turgay");
        company.addEmployee(0,"Zeynep Turgay");// Hata verecek.
        System.out.println(company);

        employee.addHealthplan(1,"a");
        employee.addHealthplan(1,"b"); // hata verecek.
        System.out.println(employee);



    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {

        workWithData();


    }
}
