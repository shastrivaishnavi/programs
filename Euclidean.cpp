#include<iostream>
using namespace std;
int main(){
    int n1 , n2 , gcd;
    cin>>n1>>n2;
    for(int i=1;i<=n1 && i<=n2;i++){
        if(n1%i==0 &&n2%i==0){
            gcd=i;
        }
    }
    cout<<gcd<<endl;
    int x,y;
    int a[1000];
    int b[1000];
    for(int k=-1;k<=1000;k++){
        for(int l=-1;l<=1000;l++){
            if((n1*k+n2*l==gcd)&&k<l){
                 x =k;
                 y =l;
                 cout<<x<<" "<<y<<"\n";
            }
        }
    }
    //cout<<x<<" "<<y;


    return 0;
}
