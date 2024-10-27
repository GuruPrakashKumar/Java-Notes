#include<bits/stdc++.h>
using namespace std;
 int main(){
    /*when the input is space separated integers*/
    // int x;
    vector<int> vec;
    // while(cin>>x){
    //     vec.push_back(x);
    // }

    /*when the input is space separated string*/
    string input;
    getline(cin,input);
    stringstream ss(input);
    int num;
    while(ss>>num){
        vec.push_back(num);
    }
    int sum=0, avg =0;
    for(int i=0;i<vec.size();i++){
        sum+=vec[i];
    }
    cout<< sum <<" "<<setprecision(2)<<(double)sum/vec.size()<<endl;
    return 0;
 }