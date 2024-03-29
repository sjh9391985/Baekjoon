### DFS (깊이 우선 탐색)

- 그래프 완전 탐색 기법 중 하나
- 그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대 깊이까지 탐색을 마친 후 다른 쪽 분기로 이동하여 탐색을 수행하는 알고리즘
- 특징
  - 재귀 함수 구현 또는 스택(FILO) 자료구조 이용
  - 재귀 함수 이용 시 스택 오버플로에 유의해야 함.
 

### DFS 핵심 이론

- 한 번 방문한 노드를 다시 방문하면 안 되므로 노드 방문 여부를 체크할 배열이 필요하며, 그래프는 인접 리스트로 표현.
- DFS 탐새 방식은 후입선출의 특성을 가짐.

1. DFS 시작할 노드를 정한 후 사용할 자료구조 초기화
2. 스택에서 노드를 꺼낸 후 노드의 인접 노드를 다시 스택에 삽입
3. 스택 자료구조에 값이 없을 때까지 반복 (이미 방문한 노드는 생략)
