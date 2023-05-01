#include <string>
#include <vector>

using namespace std;

string solution(string new_id) {
    string answer = "";
    
    //1. 대문자 -> 소문자
    for(int i = 0; i < new_id.size(); i++){
        new_id[i] = tolower(new_id[i]);
    }

    //2. 문자제거 방법
    for(int i = 0; i < new_id.size(); i++){
        (new_id[i] == '-' || new_id[i] == '_' || new_id[i] == '.' || new_id[i] >= 97 && new_id[i] <= 122 || new_id[i] >= 48 && new_id[i] <= 57) ? answer += new_id[i] : "";   
    }
    
    //3. 연속된 '.' 문자 제거
    for(int i = 0; i < answer.size(); i++){
        if(answer[i] == '.' && answer[i] == answer[i+1]){
            answer.erase(answer.begin() + i);
            i--;
        }
    }
    
    //4. 처음, 끝 '.' 제거
    if(answer[0] == '.'){
        answer.erase(answer.begin() + 0);
    }  
    
    if(answer[answer.size()-1] == '.'){
        answer.erase(answer.begin() + answer.size()-1);
    }
    
    //5. 빈문자열의 경우 'a' 대입
    (answer  == "") ? answer += 'a': "";
    
    //6,7. 문자열 길이 체크
    if(answer.size() >=16 ){
        answer.erase(15);
        if(answer[answer.size()-1] == '.'){
            answer.erase(answer.size()-1);
        }
    } 
    
    if(answer.size() <= 2){
        for(int i = 0; i < answer.size(); i++){
            answer += answer[answer.size()-1];
            if(answer.size() == 3){
                break;
            }
        }
    }
    
    return answer;
}