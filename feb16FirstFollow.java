import java.util.*;

public class feb16FirstFollow {
   public static void main(String[] args) {
    //    Scanner sc=new Scanner(System.in);

    /**
     * S - AB
     * A - aA | b
     * B - bB | e
     */

     String tokS1="AB";
     String tokA1="aA";
     String tokA2="b";
     String tokB1="bB";
     String tokB2="e";

    // char[] tempTokofToken;

    System.out.println("******************************FIRST******************************");


    System.out.println("First of B >> ");


    // for Token1 of B
    char[] tempTokofToken=new char[tokB1.length()];
     tempTokofToken=tokB1.toCharArray();
    int flag=1;


    // while(flag!=0){
        // int x=0;
        for(int i=0;i<tempTokofToken.length;i++){
         
        if((int)tempTokofToken[i]>=97 && (int)tempTokofToken[i]<=122){
                System.out.println(tempTokofToken[i]);
            }
        else if((int)tempTokofToken[i]>=65 && (int)tempTokofToken[i]<=90){
            continue;
            // System.out.println(tempTokofToken[i]+"is NON terminal");
        }
        // x=i;
        }
    //     if(x==tempTokofToken.length)
    //         flag=0;

    //     if(flag==0)
    //         break;
    // }
     
    

     //for tok 2 of B
    tempTokofToken=tokB2.toCharArray();
    flag=1;

   // while(flag!=0){
        // int x=0;
        for(int i=0;i<tempTokofToken.length;i++){
        if((int)tempTokofToken[i]<97){
            // System.out.println(tempTokofToken[i]+"is NON terminal");
            // break;
            continue;
        }
        else{
            System.out.println(tempTokofToken[i]);
        }
        // x=i;
        }
        // if(x==tempTokofToken.length)
        //     flag=0;
    // }

    System.out.println("First of A >> ");
  //for tok 1 of A
    tempTokofToken=tokA1.toCharArray();
    flag=1;


      // while(flag!=0){
        // int x=0;
        for(int i=0;i<tempTokofToken.length;i++){
         
        if((int)tempTokofToken[i]>=97 && (int)tempTokofToken[i]<=122){
                System.out.println(tempTokofToken[i]);
            }
        else if((int)tempTokofToken[i]>=65 && (int)tempTokofToken[i]<=90){
            continue;
            // System.out.println(tempTokofToken[i]+"is NON terminal");
        }
        // x=i;
        }
    //     if(x==tempTokofToken.length)
    //         flag=0;

    //     if(flag==0)
    //         break;
    // }
    

 //for tok 2 of A
    tempTokofToken=tokA2.toCharArray();
    flag=1;


      // while(flag!=0){
        // int x=0;
        for(int i=0;i<tempTokofToken.length;i++){
         
        if((int)tempTokofToken[i]>=97 && (int)tempTokofToken[i]<=122){
                System.out.println(tempTokofToken[i]);
            }
        else if((int)tempTokofToken[i]>=65 && (int)tempTokofToken[i]<=90){
            continue;
            // System.out.println(tempTokofToken[i]+"is NON terminal");
        }
        // x=i;
        }
    //     if(x==tempTokofToken.length)
    //         flag=0;

    //     if(flag==0)
    //         break;
    // }
 
        System.out.println("First of S >>"+ " a  b ");
   } 
}
