import java.util.ArrayList;

public class DataStructure {
    public static void main(String[] args) {
        // Stack stack = new Stack();
        // stack.printStatus();
        // stack.push(22);
        // stack.push(33);
        // System.out.println(stack.peek());
        // stack.printStatus();
        // stack.pop();
        // stack.printStatus();

        // Queue queue = new Queue();
        // queue.printStatus();
        // queue.add(11);
        // queue.add(22);
        // queue.printStatus();
        // queue.poll();
        // queue.printStatus();
        // queue.peek();
    }
}

class Stack {
    int[] intArray = new int[10];
    int top = 0;

    void push(int data) {
        this.intArray[this.top] = data;
        this.top++;
    }

    void pop() {
        this.top--;
        this.intArray[this.top] = 0;
    }

    int peek() {
        return this.intArray[this.top - 1];
    }
}

class Queue {
    int[] intArray = new int[10];
    int front = 0;
    int rear = 0;

    void add(int data) {
        this.intArray[this.rear] = data;
        rear++;
    }

    int poll() {
        int polled = this.intArray[this.front];
        this.intArray[this.front] = 0;
        front++;
        return polled;
    }

    int peek() {
        return this.intArray[this.rear - 1];
    }
}

class Graph {
    // edge list로 cost가 없는 그래프 구현
    // 각 행이 edge를 표현하며 첫번째 열이 startNode, 두번쩨 열이 endNode
    int[][] edgeList = new int[2][6];

    // edge list로 cost가 있는 그래프 구현
    // 각 행이 edge를 표현하며 첫번째 열이 startNode, 두번쩨 열이 endNode, 마지막 열이 cost
    int[][] edgeListWithCost = new int[3][6];

    // adjaceency matrix로 그래프 표현
    // 행과 열의 크기는 노드의 수와 동일 -> 정방형
    // 행(세로 인덱스)이 출발노드, 열(가로 인덱스)이 도착노드에 해당(노드가 1부터 시작한다면 인덱스에 1 더해주기)
    // 인덱스에 대응시키지 않고 가로 세로가 각각 0번인 원소에 노드의 정보를 저장하기도 함(이 경우 인덱스에 1더할 필요 없음)
    // 행렬의 원소는 cost를 나타내며 cost가 없는 그래프의 경우 모든 원소를 1로 설정하여 연결 여부를 표현
    int[][] adjaceencyMatrix = new int[6][6];

    // adjaceency list를 이용하여 가중치가 없는 그래프 표현
    // 배열의 크기는 노드의 수와 동일
    // 각 노드와 연결된 endNode의 수는 가변적이므로 ArrayList로 관리
    // 배열의 인덱스가 startNode와 대응되며 각 배열의 원소인 ArrayList의 원소들은 endNode에 대응
    ArrayList<Integer>[] adjaceencyList = new ArrayList[5];

    // adjaceency list를 이용하여 가중치가 있는 그래프 표현
    // GraphNode로 선언된 endNode의 cost로 edge의 가중치를 표현
    ArrayList<GraphNode>[] adjaceencyListWithCost = new ArrayList[5];
}

class GraphNode {
    String address;
    int cost;
}

class BinaryTree {
    // 1차원 배열로 이진트리를 표현
    // 0번은 사용하지 않는 것이 더 편하다
    // 부모 노드에 접근 -> (자식노드 인덱스 / 2)
    // 자식 노드에 접근 -> 왼족 자식 노드 : (부모노드 * 2), 왼족 자식 노드 : (부모노드 * 2 + 1)
    int[] binaryTree = new int[7];

}

class TreeNode {
    String data;

    // 부모 노드
    TreeNode parent;

    // 왼쪽 자식 노드
    TreeNode lNode;

    // 오른쪽 자식 노드
    TreeNode rNode;
}