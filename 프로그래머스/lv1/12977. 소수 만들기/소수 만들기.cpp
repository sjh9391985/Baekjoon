#include <vector>
#include <iostream>
#include <cmath>
using namespace std;

bool sosu(int num) {
	if (num < 2) return false;
	int a = (int) sqrt(num);
	for (int i = 2; i <= a; i++) if (num % i == 0) return false;
	return true;
}

int solution(vector<int> nums) {
    
    vector<int> store;
    int count = 0;
    for(int i = 0; i < nums.size()-2; i++){
        for(int j = i+1; j < nums.size()-1; j++){
            for(int k = j+1; k < nums.size(); k++){
                int sosu_value = nums[i] + nums[j] + nums[k];
                if(sosu(sosu_value)){
                    count++;
                } 
            }
        }
    }
    return count;
}