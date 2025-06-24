// 2.wap to check given no. is palindrome or not

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //take a scanner class to take input from programmer
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //convert num into string 
        String StrNum = Integer.toString(number);
        
        //convert string into string buffer to easylly reversed it 
        StringBuffer str = new StringBuffer(StrNum);
        StringBuffer reversedStr = str.reverse();

        //check string with reversed string 
        if(StrNum.equals(reversedStr.toString())){
            System.out.println("Given number "+number+" is polindrome.");
        }else{
            System.out.println("Given number "+number+" is not a polindrome.");
        }
    }
}
