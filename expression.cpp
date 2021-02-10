#include<string>
#include<iostream>
using namespace std;


// 18446744073709551615 is -1 
            //https://stackoverflow.com/questions/40608111/why-is-18446744073709551615-1-true

int main(){


string tokens[5]={"int","float","double","if","else"};

string test;
cout<<"Enter expression to check ";
getline(cin,test);

for(int i=0;i<5;i++){
    if(test.find(tokens[i])==18446744073709551615)
    continue;
   cout<<"\n found at postion"<<test.find(tokens[i]);
//    break;
}


// cout<<test;
    return 0;
}