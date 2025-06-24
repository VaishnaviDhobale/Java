// 6.wap to count vowel and consonant 
public class VowelAndConsonant {
    static int vowelsCount = 0;
   static int consonant = 0;

    static void checkVowelsAndConsonants(String str){
        String vowels = "aeiouAEIOU";
        for(int i=0; i<str.length(); i++){
            if(vowels.indexOf(str.charAt(i)) != -1){
                vowelsCount+=1;
            }else{
                consonant+=1;
            }
        }
        System.out.println("Vowels count is: "+vowelsCount);
        System.out.println("consonant count is: "+consonant);
    }
    public static void main(String[] args) {
        String str = "vaishnavi";
        VowelAndConsonant.checkVowelsAndConsonants(str);

    }
}
