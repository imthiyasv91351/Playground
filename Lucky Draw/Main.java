#include<iostream>
using namespace std;
int main(){
int n;
cin>>n;
int i=0;
bool flag=false;
for(i=2;i<n;i++){
	if(n%i==0){
    	flag=true;
      	break;
    }
}
if(n==1){
	cout<<"Not eligible";
}
else if(flag==true && n>1){
	cout<<"Not eligible";
}
else{
	cout<<"Eligible";
}

}