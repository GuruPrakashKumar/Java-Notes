#include<bits/stdc++.h>
using namespace std;
string isPos(vector<int> vec){
    int sum =0, remainSum =0,totalSum=0;
    for(int i=0;i<vec.size();i++){
        totalSum+=vec[i];
    }
    for(int i=0;i<vec.size();i++){
        sum+=vec[i];
        remainSum = totalSum - sum;
        if(sum/(i+1) == remainSum/(vec.size()-i-1));
        return "true";
    }
    return "false";
}
int main(){

    /*When input is comma separated string*/
    string input;//1,2,3,2
    getline(cin,input);
    stringstream ss(input);
    string num;
    vector<int> vec;
    while(getline(ss,num,',')){
        vec.push_back(stoi(num));
    }
    cout<<isPos(vec)<<endl;
    return 0;
}