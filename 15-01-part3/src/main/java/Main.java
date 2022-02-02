import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Person [] persons = {
                new Person("Артем", "Куба"),
                new Person("Надя", "Ашан"),
                new Person("Діма", "Карт"),
                new Person("Джош", "Нучота"),
        };

        for (Person per:persons
             ) {
            System.out.println(per.toString());
        }

        City town = new City("Kyiv", "Ukraine", "830km", 2962180);
        Country country = new Country("Ukraine", town, "Ukrainian", 2, "603,628 km2", 41319838);

        System.out.println(country.toString());

        Fraction[] fractions = {
                new Fraction(20, 20),
                new Fraction(19, 20)
        };

        for (Fraction f:fractions
        ) {
            System.out.println(f.toString());
        }

        Book [] books = {
                new Book(),
                new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling", "Bloomsbury", "Fantasy", 607, 2007)
        };

        for(Book b:books){
            System.out.println(b.toString());
        }

        Motorcycle moto = new Motorcycle("R 1250 RS", "BMW", 2018, 1254);

        System.out.println(moto.toString());

    }
}