package Statements;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {

    }
    public void oddEven(int x){
        if (x % 2 == 0){
            System.out.println("X is even");
        }else{
            System.out.println("X is odd");
        }
    }

    public void determineSign(int y){
        if (y > 0){
            System.out.println("Y is positive");
        }else{
            System.out.println("Y is negative");
        }
    }

    //chgitem inchi boolean, bayc sout ov el karay grey without return ;)
    public boolean stugoxMethod(int s){
        if ((s < 8 && s > 5) || (s < 20 && s > 15)){
            return true;
        }else{
            return false;
        }
    }

    public void divide(int L){
        if (L % 35 == 0){
            System.out.println("L is divisible by 35");
        }else{
            System.out.println("L is not divisible by 35");
        }
    }

    public  boolean yeranish(int J){
        if ((J / 10) / 10 == 7){
            return true;
        }else{
            return false;
        }
    }

    public void greatest(int first, int second, int third){
        if ((first > second) && (first > third)){
            System.out.println("The first number is the greatest");
        } else if ((second > first) && (second > third)) {
            System.out.println("The second number is the greatest");
        } else if ((third > second) && (third > first)) {
            System.out.println("The third number is the greatest");
        }
    }

    public void nahanj(int year){
        if (year % 4 == 0){
            System.out.println("Nahanj tari");
        }else{
            System.out.println("Nahanj chi");
        }
    }

    public void printNums(int number){
        for ( number = 1; number <= 200; number++ ){
            System.out.println(number);
        }
    }

    public void lastDigit(int ourNumber){
        System.out.println(ourNumber % 10);
    }

    public void sum(){
        int x2 = 1;
        int y2 = 0;

        while((x2 <5 ) && (y2 < 10)){
            System.out.println(x2 + y2);
        }
    }


    public void sumOfFiveDiv(int N, int myNumber, int sumOfAll){
        Scanner scanner = new Scanner(System.in);
          N = scanner.nextInt();
   for (myNumber = 0; myNumber < N; myNumber++){
            if (myNumber % 5 == 0){
                sumOfAll += myNumber;
            }
            System.out.println(sumOfAll);
        }
    }


    public void printEvenNum(){}

    public void printMaxMIn(int givenNumber){
        System.out.println((givenNumber + 1) / 2);
    }

}

