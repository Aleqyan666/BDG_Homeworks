public class Main2 {

    public static void main(String[] args) {

    City c1 = new City();
    City c2 = new City();
    City c3 = new City();
    City c4 = new City();

    c1.name = "Yerevan";
    c1.population = 1075000;

    c2.name = "New York";
    c2.population = 8380000;

    c3.name = "Moscow";
    c3.population = 11920000;

    c4.name = "Paris";
    c4.population = 2161000;



    }
}

class Author{}
class Student{}
class City{
    public String name;
    public int population;
}

class Address{
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
}

class Bank{
    public String bankName;
    public Address address;
}


