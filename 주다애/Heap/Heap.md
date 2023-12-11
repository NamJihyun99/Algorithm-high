### 🎈 Heap

<aside>
💡 완전이진트리(Complete Binary Tree) 형태의 자료구조. 일차원 배열로 구현하며 데이터의 삽입과 삭제가 빠르다.

</aside>

일반적으로 그룹을 **정렬하거나** 입력된 **데이터 안에서 최대/최소 값을 찾을 때** 사용

부모/자식 노드끼리만 비교한다.(배열로 표현 시 오름/내림 차순이 아니다.)

트리 내의 가장 큰/작은 키 값은 항상 **루트 노드**이다.

인덱스 0은 사용하지 않는다.(인덱스 0 자리에 아주 큰 값이나 아주 작은 값 임의로 삽입)

👉 최대힙 : 부모 노드의 키 값이 자식 노드의 키 값보다 항상 큼

👉 최소힙 : 부모 노드의 키 값이 자식 노드의 키 값보다 항상 작음

삽입 : 트리의 **가장 마지막 위치에 노드 삽입** → 추가된 노드와 그 부모 노드가 힙 조건을 만족하지 않으면 서로 키 값 바꿈

삭제 : **항상 루트 노드를 삭제** → 트리의 가장 마지막 노드를 루트 자리로 삽입 → 바뀐 위치의 노드가 힙 조건을 만족하지 않는다면 왼쪽 자식과 오른쪽 자식 중 적합한 노드와 키 값 바꿈

### 사용법(우선순위 큐)

- 코드

    ```java
    import java.util.PriorityQueue;
    
    // 우선순위가 낮은 숫자 순 --> Min Heap
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    
    // 우선순위가 높은 숫자 순 --> Max Heap
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    
    // 1. 삽입 --> add(), offer()
    priorityQueue.offer(3);
    priorityQueue.offer(5); // 큐 용량이 초과되면 false 리턴
    priorityQueue.add(4);
    priorityQueue.add(1); // 큐 용량이 초과되면 예외 발생
    
    // 2. 삭제 --> poll(), clear()
    q.poll(); // 1 반환
    q.clear(); // 초기화
    
    // 3. 반환 --> peek() 우선순위가 가장 높은 원소 출력
    q.peek() // 1 반환(제거는 하지 않는다.)
    ```

- 비어있는지 확인, 크기, 원소 포함 여부

    ```java
    // 4. 비어있는 여부 확인 --> isEmpty() stack이 비었으면 true, 아니면 false를 반환한다.
    q.isEmpty();
    
    ****// 5. 크기 --> size()
    int size = q.size();
    System.out.println(size); // 4 출력
    
    // 6. 원소 포함 여부 --> contains(), containsAll()
    q.contains(20); // 5을 포함하므로 true 반환
    q.containsAll([collections 타입]); // collections 안의 값들이 모두 stack 안에 있으면 true, 아니면 false 반환
    ```


### 시간 복잡도

1️⃣ 삽입 : O(logN)

2️⃣ 삭제: O(logN)

3️⃣ 힙정렬 : O(NlogN) + O(n) = O(NlogN)

- 힙 정렬

    1) 정렬할 데이터 n개 하나씩 힙에 삽입 -> `O(n) * O(logn)`

    2) 최댓값 차례로 하나씩 삭제하여 보관 -> `O(n)`

- 시간복잡도: O(nlogn) + O(n) = O(nlogn)