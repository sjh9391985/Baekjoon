#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int func (int arg) {
    if(arg == 6){
        return 1;
    } else if (arg == 5){
        return 2;
    } else if (arg == 4){
        return 3;
    } else if (arg == 3){
        return 4;
    } else if (arg == 2){
        return 5;
    } else {
        return 6;
    }
}

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    int high = 0;
    int low = 0;
    for(int i = 0; i < lottos.size(); i++){
        if(lottos[i] == 0){
            high++;
        } else {
            if(find(win_nums.begin(), win_nums.end(), lottos[i]) != win_nums.end()){
                high++;
                low++;
            }    
        }
    }
    vector<int> nums;
    nums.push_back(func(high));
    nums.push_back(func(low));
    return nums;
}