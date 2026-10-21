//Secure Access Token Generator 
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String word = sc.nextLine().toUpperCase().trim();
        String ans = "" ;
        String[] words = word.split("\\s+");
         for (int i = 0; i < words.length; i++) {
            String text = words[i];
                int low=0;
                int high=text.length()-1;
                while(low<=high){
                    if(low == high){
                        int midVal = (int) text.charAt(low) - 'A' + 1;
                        int val = midVal*text.length();
                        ans = ans+val;
                    }
                    else{
                        int asciiVal = (int)text.charAt( low) - 'A'+1;
                        int asciiVal2= (int) text.charAt(high) - 'A'+1;
                        int sub = Math.abs(asciiVal-asciiVal2);
                        int valueToAdd;
                       if (sub == 0) {
                        valueToAdd = asciiVal + asciiVal2;
                        } else {
                            valueToAdd = sub;
                    }
                    ans = ans + valueToAdd; 
                    }
                    low++;
                    high--;
                }
        }   
        System.out.println(ans);
    }
}
