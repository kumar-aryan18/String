//Cybersecurity Message Fingerprint
import java.util.*; 
public class Question06 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);    
        String word = sc.nextLine().toUpperCase().trim();
        String ans = "" ;
        String[] words = word.split("\\s+");
         for (int i = 0; i < words.length; i++) {
            String text = words[i];
                int low=0;
                int high=low+1;
                while(high<text.length()){
                    if(text.length()==1){
                        int midVal = (int) text.charAt(low) - 'A' + 1;
                        ans = ans+midVal;
                    }
                    else{
                        int asciiVal = (int)text.charAt( low) - 'A'+1;
                        int asciiVal2= (int) text.charAt(high) - 'A'+1;
                        int sub = Math.abs(asciiVal-asciiVal2);
                        ans = ans + sub;
                    }
                    low++;
                    high++;
                }
        }   
        System.out.println(ans);
    }
}
