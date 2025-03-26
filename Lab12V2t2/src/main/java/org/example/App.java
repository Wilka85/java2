package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester tester1 = new Tester("Ivan", "Petrov");
        Tester tester2 = new Tester("Anna", "Smirnova", 3);
        Tester tester3 = new Tester("Oleg", "Ivanov", 5, "Advanced", 3000.0);

        tester1.displayInfo();
        tester2.displayInfo(true);
        tester3.displayInfo(true,true);
        Tester.companyPolicy();
    }
}
