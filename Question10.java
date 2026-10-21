import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase().trim();
        String [] words = word.split("\\s+");
          StringBuilder result = new StringBuilder();
      
        for(int i=0;i<words.length;i++){
            String text = words[i];
            int low=0;
            int high = text.length()-1;
              int ans = 0;
            while(low<=high){
                if(low==high){
                    int midVal = (int)text.charAt(low)-'A'+1;
                    ans = ans+(midVal*text.length());
                }
                else{
                    int value1 = (int)text.charAt(low)-'A'+1;
                    int value2 = (int)text.charAt(high)-'A'+1;
                    
                    int sub = Math.abs(value1-value2);
                      int transformValue = sub;
                    if(sub%2==0) transformValue = sub/ 2;
                    else  transformValue = sub * 3;
                    
                    ans += transformValue;
                   
                    
                }
                low++;
                high--;
            }
             if (ans % 3 == 0) {
                result.append(ans / 3);
            } else {
                result.append(ans * 2);
            }
        }
        
            
        System.out.println(result);
    }
}
