#include<bits/stdc++.h>
using namespace std;
bool isPalindrome(int num){
    int x = num;
    int rev =0;
    if(num==0) return true;
    while(x>0){
        int rem = x%10;
        rev = rev*10 + rem;
        x/=10;
    }
    return rev==num;
}

int main(){

    /*if input is space separated integers*/
    int n,m;
    // cin>>n>>m;// 4 5

    /*if input is in two lines*/
    // cin>>n;
    // cin.ignore();
    // cin>>m;

    /*if input is comma separated*/
    string input;// 4,5
    getline(cin,input);
    stringstream ss(input);
    string num;
    vector<int> vec;
    while(getline(ss,num,',')){
        vec.push_back(stoi(num));
    }
    n=vec[0];
    m=vec[1];
    int cnt=0;
    for(int i=n;i<=m;i++){
        if(isPalindrome(i)){
            cnt++;
        }
    }
    cout<<cnt;
    return 0;
}