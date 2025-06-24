// 1.wap to reverse a string
public class ReverseString{
    static StringBuffer reverseString(String str){
        StringBuffer newStr = new StringBuffer(str);
        StringBuffer reversedString = newStr.reverse();
        return reversedString;
    }
    public static void main(String[] args){
        String str = "vaishnavi";
        System.out.println(reverseString(str));
    }
}