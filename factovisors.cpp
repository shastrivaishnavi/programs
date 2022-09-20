#include<iostream>
using namespace std;
int main(){
    //valid till 20 fact
    long  n, num, fact = 1;
    cin>>n >> num;

    for(long  i = 1;i<=n;i++){
        fact = fact * i;
    }
    if(fact%num==0){
        cout<<num<<" "<<"divides"<<" "<<n<<"!";
    }else{
        cout<<num<<" "<<"does not divide"<<" "<<n<<"!";
    }

    //cout<<fact;
}
