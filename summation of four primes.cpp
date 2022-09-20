#include<iostream>
using namespace std;
 int isPrime(int x){
        for(int i = 2;i<=x/2;i++){
            if(x%i==0){
                return 0;
            }
        }
        return 1;
    }

int main(){
    int n,i, z=0;
    cin>>n;
    if(n<8){
        exit;
    }
    if(n%2==0){
        cout<<2<<" "<<2;
        n=n-4;
    }else{
        cout<<2<<" "<<3;
        n=n-5;
    }

   for(int i = 2;i<n;i++){


    if(isPrime(i)&&isPrime(n-i)){
            cout<<"\t"<<i<<" "<<n-i;
            break;
          z=1;
    }
    if(z=0){
    cout<<"impossible";
   }
   }
}
