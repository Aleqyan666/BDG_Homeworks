package Classes;

public class Runner {
   public static String []  countries(){

       for (Country country1 : Country.values()){
           System.out.println(country1);
       }
       return null;
    }

    public static void main(String[] args) {

    countries();


    }
}
