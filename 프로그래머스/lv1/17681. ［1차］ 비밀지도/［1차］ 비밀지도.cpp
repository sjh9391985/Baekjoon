#include <string>
#include <vector>
#include <cmath>
#include <iostream>
using namespace std;
string toBinary(int n)
{
    string r;
    while (n != 0){
        r += ( n % 2 == 0 ? " " : "#" );
        n /= 2;
    }
    string temp;
    for(int i = r.size(); i >= 0; i--){
        temp += r[i];
    }
    
    return temp;
}
vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector <string> answer;
    vector <int> store;
    if( n >=1 && n <= 16){
        for(int i = 0; i < n; i++){
            store.insert(store.end(), arr1[i] | arr2[i]);
        }
    
        for(int i = 0; i < store.size(); i++){
            string temp = toBinary(store[i]).erase(0,1);
            if(temp.size() != n){
                int space_n = n - temp.size();
                string space;
                for(int i = 0; i < space_n; i++){
                    space += " ";
                }    
                answer.insert(answer.end(), space+temp);
            } else {
                answer.insert(answer.end(), temp);    
            }
            
        }    
        return answer;
    }
}