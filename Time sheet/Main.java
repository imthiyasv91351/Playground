#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,d2,d3,d4,d5,d6,d7,h,s1,s2,s3,s4,s5,s6,s7,p,salary,s;
  cin>>d1>>d2>>d3>>d4>>d5>>d6>>d7;
  if(d1>=0){
    if(d1>8){
    	s1=(d1*100)+((d1-8)*15);
        s1=s1+(0.5*s1);
    }
    else{
  		s1=d1*100;
        s1=s1+(0.5*s1);
    }
  }
  if(d2>=0){
    if(d2>8){
    	s2=(d2*100)+((d2-8)*15);
    }
    else {
  		s2=d2*100;
    }
  }
  
  if(d3>=0){
    if(d3>8){
    	s3=(d3*100)+((d3-8)*15);
    }
    else {
  		s3=d3*100;
    }
  }
  if(d4>=0){
    if(d4>8){
    	s4=(d4*100)+((d4-8)*15);
    }
    else {
  		s4=d4*100;
    }
  }
  if(d5>=0){
    if(d5>8){
    	s5=(d5*100)+((d5-8)*15);
    }
    else {
  		s5=d5*100;
    }
  }
  if(d6>=0){
    if(d6>8){
    	s6=(d6*100)+((d6-8)*15);
    }
    else {
  		s6=d6*100;
    }
  }
  if(d7>=0){
    if(d7>8){
    	s7=(d7*100)+((d7-8)*15);
        s7=s7+(0.25*s7);
    }
    else {
  		s7=d7*100;
        s7=s7+(0.25*s7);
    }
  }
  
  h=d1+d2+d3+d4+d5+d6+d7;
  s=s1+s2+s3+s4+s5+s6+s7;
  cout<<s;
    
  
}  