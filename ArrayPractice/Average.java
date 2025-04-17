//Create a Java program that finds and prints the average of values in a double array.
public class Average{
    public static void main(String ...args){
        // create array 
        double[] numbers = {34.3,43.4,5.5,44};
        double sum = 0;

        //calculate sum
        for(int i=0; i< numbers.length; i++){
            sum += numbers[i];
        }

        //calculate avg 
        double avg = sum/numbers.length;

        //print average
        System.out.println("Average is: " +avg);
    }
}