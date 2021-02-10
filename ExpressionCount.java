import java.util.*;


public class ExpressionCount{
    public static void main(String[] args) {

        System.out.println("Enter the Test String   ");
        
        Scanner sc=new Scanner(System.in);
        String test=sc.nextLine();

        System.out.println("Inputted String is >> "+test);

        String[] words=test.split("\\s");

        int count=0;

        String[] KeyArr = new String[]{"auto","const","double","float","int"};

        for(String w:words){     
            for(int i=0;i<5;i++){
                if(w.equalsIgnoreCase(KeyArr[i])){
                    System.out.println("the Keyword Found is "+w);
                    count++;
                }
            }            
        }
        System.out.println("Total Number of keywords "+count);
    }
}