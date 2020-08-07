#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char line[200];
  int vow,cons,white,dig,symb,i;
  vow=cons=white=dig=symb=0;
  cin.getline(line,200);
  for(i=0;line[i]!='\0';i++){
  	if(line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U'){
    	++vow;
    }
    else if((line[i]>='a' && line[i]<='z') || (line[i]>='A' && line[i]<='Z')){
    	++cons;
    }
    else if((line[i]>='0') && (line[i]<='9')){
    	++dig;
    }
    else if(line[i]==' '){
    	++white;
    }
    else{
    	++symb;
    }
  }
  cout<<"Vowels:"<<vow<<"\nConsonants:"<<cons<<"\nWhite Spaces:"<<white<<"\nDigits:"<<dig<<"\nSymbols:"<<symb;
}