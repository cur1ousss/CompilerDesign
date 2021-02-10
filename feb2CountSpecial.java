//count number of keywords , identifiers,operators, end of string (;) in given string
// using operators of C++/C
import java.util.*;

public class feb2CountSpecial {
    public static void main(String[] args) {

          System.out.println("Enter the Test String   ");
        
        Scanner sc=new Scanner(System.in);
        String test=sc.nextLine();

        System.out.println("Inputted String is >> "+test);

        String[] words=test.split("\\s");

        int Keywordcount=0;
        // int identifierCount=0;
        int operatorCount=0;
        int endofStringCount=0;

        String[] KeyArr = new String[]{"auto","const","double","float","int"};
        String[] OperArr= new String[]{"+","-","/","*","^","&","|","="};

        for(String w:words){     
            for(int i=0;i<KeyArr.length;i++){
                if(w.equalsIgnoreCase(KeyArr[i])){
                    System.out.println("Keyword found >>  "+w);
                    Keywordcount++;
                }
            }            
            for(int j=0;j<OperArr.length;j++){
                if(w.equalsIgnoreCase(OperArr[j])){
                    System.out.println("Operator found >> "+w);
                    operatorCount++;
                }
            }    
                    if(w.equalsIgnoreCase(";"))
                    endofStringCount++;    
        }

        System.out.println("Total Number of keywords "+Keywordcount);
        System.out.println("Total Number of Identifiers "+(words.length-Keywordcount-operatorCount-endofStringCount));
        System.out.println("Total Number of Operators  "+operatorCount);
        System.out.println("Total Number of EndofString(;) "+endofStringCount);
    }

    }   
