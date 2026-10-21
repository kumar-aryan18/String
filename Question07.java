//AI-Based Document Signature 

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase().trim();
        String [] words = word.split("\\s+");
        String ans = "";
        
        for(int i=0;i<words.length;i++){
            String text = words[i];
            int count=0;
            int ans2=0;
            for(int j=0;j<text.length();j++){
                ans2 += (int)text.charAt(j) - 'A' + 1;
                for(int k=j+1;k<text.length();k++){
                    if(text.charAt(j)!=text.charAt(k))count++;
                }

            }
            int value = ans2*count;
            ans+= value;

            
        }
        System.out.println(ans);
    }
}
