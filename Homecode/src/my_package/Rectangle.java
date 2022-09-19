package my_package;

public class Rectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.calculateArea(5,14));

    }

   public int calculateArea(int length, int width){
       return length * width;
   }



}
