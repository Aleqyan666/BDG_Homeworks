package Strings;

import java.sql.Array;
import java.util.ArrayList;

public class MyString {

    /**
     *
     * @param s1
     * @param s2
     * @return value of 2 String variables
     */
    static String  concatenation(String s1, String s2){
        return s1 + s2;
    }

    /**
     *
     * @param j1
     * @param j2
     */
    static void concatenationB(String j1, int j2){
        System.out.println(j1 + j2);
    }

//    static String blankSymbol(String mySent){
//
//    }

    /**
     *
     * @param example
     * @return reverse type of param
     */
    static void reverseString(String example){
        StringBuilder sb = new StringBuilder(example);
        System.out.println(sb.reverse());
    }

    /**
     * determining matches
     * @param line
     * @param token
     */
    static void countSubString(String line, String token) {


        String[] something = line.split(" ");

        int count = 0;

        for (int i = 0; i < something.length; i++) {

            if (token.equals(something[i])) {
                count++;
            }
        }
        System.out.println(count);

    }


    /**
     * Converting to Upper case
     * @param myWord
     */
    static void   toUpperCase(String myWord){
        System.out.println(myWord.toUpperCase());
    }

    /**
     * checking the symbol count ( adding symbols)
     * @param line
     * @return line
     */
    static String  lineLength20(String line){
        while(line.length() < 20){
            line += "*";
        }
        return line;
    }

//    static String symbolReplacer(String line){
//
//
//    }

    /**
     * whether null or not
     * @param info
     */
    static void nullOrNot(String info){
        if (info.equals(null)){
            System.out.println("Is null");
        }else {
            System.out.println("Is not null");
        }
    }

    /**
     * printing a part of string
     * @param password
     * @param n
     */
    static void printPartOfString(String password, int n){
        System.out.println(password.substring(0,n));
    }

    /**
     * printing a part of stringbuilder
     * @param myObj
     * @param n
     */
    static void printPartOfStb(String myObj, int n){
        StringBuilder sb = new StringBuilder(myObj);
        System.out.println(sb.substring(0,n));
    }

    /**
     * determining index of string
     * @param line
     * @param token
     */
    static void indexOfMyVar(String line, String token){
        if (line.contains(token) == true){
            System.out.println(line.indexOf(token));
        }
    }

    /**
     *
     * @param line
     * @return sentence "** instead of "a"s
     */

    static String replacingA(String line){

        for (int i = 0; i <= line.length(); i++){
            if (line.charAt(i) == 'a'){
                line.replace('a','*');
            }
        }
        return line;
    }

    static int reverseMyNumber(int k){
        return Integer.reverse(k);
    }




    public static void main(String[] args) {

        String s1 = "abc";

        String s2 = "acb";

        System.out.println(s1.compareTo(s2));

        System.out.println(232);
    }

}
