#include <string>
#include <vector>
#include <map>
#include <iostream>
#include <algorithm>
#define pp pair<int,float>
using namespace std;

map< int, float > member;

bool cmp(const pair<int,float>& a, const pair<int,float>& b) {
	if (a.second == b.second) return a.first < b.first;
	return a.second < b.second;
}

vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    //vector<pair<int,float>> vec( member.begin(), member.end() );
    
    int count = 0;
    int length = 0;
    for(int i = 0; i < stages.size(); i++){
        if(stages[i] <= N){
            for(int j = 0; j < stages.size(); j++){
                if(stages[i] == stages[j]){
                    count++;    
                } 
                if(stages[i] <= stages[j]){
                    length++;
                }
            }
            member[stages[i]] = (float)count/length;       
            count = 0;
            length = 0;
        }
    }
        int plus = 0;
        for(int i = 1; i <= N; i++){
                auto item = member.find(i);
                
                if (item != member.end()) {
                    //cout << "Key exists!  -  {" << item->first << ";" << item->second << "}\n";
                } else {
                    for(int j = 1; j <= N; j++){
                        if(i <= j){
                            plus++;
                        }
                    }
                    member[i] = (float)0/plus;
                    plus = 0;
                }
            }

    
    vector<pp> vec( member.begin(), member.end() );
	sort(vec.rbegin(), vec.rend(), cmp);

    int temp = 0;
	for (int i = 0; i < vec.size(); i++) {
        	for (int j = i+1; j < vec.size(); j++) {
                if(vec[i].second == vec[j].second){
                    swap(vec[i].first, vec[j].first);
                } 
        	}
        answer.insert(answer.end(),vec[i].first);
	}
            
    return answer;
}