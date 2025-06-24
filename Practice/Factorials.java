// write  program to find factorial of a number?

public class Factorials {

    
    static int getFactorials(Integer num){
        int facto = 1;
        if(num==0){
            return 0;
        }
        for(int i=1; i<=num; i++){
           facto*=i;
        }

        return facto;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(getFactorials(num));
    }
}
