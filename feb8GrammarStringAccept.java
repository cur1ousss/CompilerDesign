import java.util.Scanner;

public class feb8GrammarStringAccept{
    public static void main(String[] args) {

            String inputString;
            Scanner sc=new Scanner(System.in);

            inputString=sc.nextLine();            
            System.out.println("inputted String is "+inputString);

            // Checking if string fits the grammar

            char[] inputArr=inputString.toCharArray();
        
            

        // if starts with a then A gram
        // if starts with b then B gram

        // if ends with b then A gram
        // if ends with a then B gram

       
        // make A gram B gram func for repeating code
            /*
            Grammar
            S - AB
            A - aA | b
            B- bB | a
            */

            // Recursion need make funcation >> for failure string >> aa
            
         //   char is rewritable
            char currentChar='x';

            int flagProceede=1;
           // for not matching put flag = -1  
           
           for(int i=0;i<inputArr.length;i++){

                if(flagProceede>=0){
                currentChar=inputArr[i];

                //starting | median letter case
                    if(currentChar=='a'){
                        if(i!=(inputArr.length-1)){
                          flagProceede=1;
                        }
                        if(i==(inputArr.length-1)){
                            flagProceede=1;
                        }
                    }
                    else if(currentChar=='b' && i!=(inputArr.length-1)){
                       if(i!=(inputArr.length-1)){
                          flagProceede=1;
                        }
                        if(i==(inputArr.length-1)){
                            flagProceede=1;
                        }
                    }
                    else{
                        flagProceede=-1;
                    }

                }
            }

            if(flagProceede==-1){
                System.out.println("FAIL");
            }
            else if(flagProceede==1){
                System.out.println("String Accepted"+inputString);
            }
            
        }
        
}

/*
************************************************************************************


<<<<<<<<<<<<<<<<<<<<<   Gangrade WORKING CODE       >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 

#include<iostream>
#include<cstdio>
#include<string>

using namespace std;

int i=0;

void A(string);
void B(string);

void S(string str)
{
 
 A(str);
 cout<<"A got executed: "<<endl;
 if(i<str.length())
  {
  	B(str);	
  }
 return;
}

void A(string str)
{
	try{
		
		if(i==str.length())
		{
			throw 1;
		}
		else if(str.at(i)=='a')
		{
		cout<<"Executing a of A():- "<<endl;	
			i++;
			A(str);
		}	
		else if(str.at(i)=='b')
		{
			cout<<"Executing b of A():- "<<endl;		
			i++;
			return;
		}
		
	}	
	catch(int x)
	{
		i++;
		return;
	}
	return;
}

void B(string str)
{
	try{
		if(i>=str.length())
		{
			throw 1;
		}
		else if(str.at(i)=='b')
		{
			cout<<"Executing b of B():- "<<endl;
			i++;
			B(str);
		}
		else if(str.at(i)=='a')
		{
		cout<<"Executing a of B():- "<<endl;	
			i++;
			return;
		}
		
	}	
	catch(int x)
	{
		i++;
		return;
	}
	return;
}



int main()
{
	
		string str;
		cout<<"Grammer:- "<<endl;
		cout<<"S-> AB "<<endl;
		cout<<"A-> aA/b"<<endl;
		cout<<"B-> bB/a"<<endl;
		cout<<"Enter string to check:- ";
		cin>>str;	
		S(str);
		if(i==(str.length()))
		{
			cout<<endl<<"String is Accepted:- "<<endl;
		}
		else
		{
			cout<<endl<<"String is Not Acceptable:- "<<endl;
		}
	return 0;
}

****************************************************************************************************

<<<<<<<<<<<<<<<<<<<<<   Aishwaray WORKING CODE       >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 

#include<stdio.h>
#include<string.h>
void main() {
	char str[100];
	int flag, i=0;

	printf("Grammar:\n S->AB \n A->aA|b \n B->bB|a\n");
	printf("Enter the string which is to be checked:\n");
	gets(str);
	if(str[0]=='a') {
		flag=0;
		for (i=1;str[i-1]!='\0';i++) {
			if(str[i]=='b') {
				flag=1;
				continue;
			} else if(flag==0 && (str[i]=='a')) {
			continue;
			} 
			else if(str[i]=='b')
			continue; else if((flag==1)&&(str[i+1]=='\0')) {
				printf("String accepted…..!!!!");
				break;
			} else {
				printf("String not accepted");
				break;
			}
		}
	}
    else if(str[0]=='b') {
		flag=1;
		for (i=1;str[i-1]!='\0';i++) {
			if(str[i]=='b') {
			    flag=1;
				continue;
			} else if(str[i]=='a'&& (flag==1)&&(str[i+1]=='\0')) {
			  printf("String accepted…..!!!!");
				break;
			} 
		else {
				printf("String not accepted");
				break;
			}
		}
	}	
}
*/
