//8: Smart Logics Route Encoder 	Expert 	
import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase().trim();
        String [] words = word.split("\\s+");
        String ans = "";
        for(int i=0;i<words.length;i++){
            String text = words[i];
            int low=0;
            int high = text.length()-1;
            while(low<=high){
                if(low==high){
                    int midVal = (int)text.charAt(low)-'A'+1;
                    ans = ans+(midVal*text.length());
                }
                else{
                    int value1 = (int)text.charAt(low)-'A'+1;
                    int value2 = (int)text.charAt(high)-'A'+1;
                    int sub = Math.abs(value1-value2);
                    ans += (sub*text.length());
                    
                }
                low++;
                high--;
            }
        }
        System.out.println(ans);
    }
}
