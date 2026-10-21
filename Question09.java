//Research Paper Metadata Encoder 

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase().trim();
        String [] words = word.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            String text = words[i];
            int count=0;
            int ans2=0;
             boolean[] seen = new boolean[26];
            // for(int j=0;j<text.length();j++){
            //     ans2 += (int)text.charAt(j) - 'A' + 1;
            //     for(int k=j+1;k<text.length();k++){
            //         if(text.charAt(j)!=text.charAt(k))count++;
            //     }
            // }
            for (int j = 0; j < text.length(); j++) {
                char ch = text.charAt(j);
                ans2 += ch - 'A' + 1;

                if (!seen[ch - 'A']) {
                    seen[ch - 'A'] = true;
                    count++;
                }
            }
            int value = count*count;
            int absDiff = Math.abs(ans2-value);
            // if(absDiff==0) ans =ans2;
            // else ans = absDiff;
              if (absDiff == 0) {
                ans.append(ans2);
            } else {
                ans.append(absDiff);
            }
        }
        System.out.println(ans);
    
    }
}
