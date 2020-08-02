// leetcode 52
class Solution {
  public boolean is_not_under_attack(int row, int col, int n,
                                     int [] rows,
                                     int [] hills,
                                     int [] dales) {
    int res = rows[col] + hills[row - col + 2 * n] + dales[row + col];
    return (res == 0) ? true : false;
  }

  public int backtrack(int row, int count, int n,
                       int [] rows,
                       int [] hills,
                       int [] dales) {
    for (int col = 0; col < n; col++) {
      if (is_not_under_attack(row, col, n, rows, hills, dales)) {
        // place_queen
        rows[col] = 1;
        hills[row - col + 2 * n] = 1;  // "hill" diagonals
        dales[row + col] = 1;   //"dale" diagonals    

        // if n queens are already placed
        if (row + 1 == n) count++;
        // if not proceed to place the rest
        else count = backtrack(row + 1, count, n,
                rows, hills, dales);

        // remove queen
        rows[col] = 0;
        hills[row - col + 2 * n] = 0;
        dales[row + col] = 0;
      }
    }
    return count;
  }

  public int totalNQueens(int n) {
    int rows[] = new int[n];
    // "hill" diagonals
    int hills[] = new int[4 * n - 1];
    // "dale" diagonals
    int dales[] = new int[2 * n - 1];

    return backtrack(0, 0, n, rows, hills, dales);
  }
}

// leetcode 146
public class LRUCache {
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int _key, int _value) {key = _key; value = _value;}
    }

    private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        // 使用伪头部和伪尾部节点
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到头部
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // 如果 key 不存在，创建一个新的节点
            DLinkedNode newNode = new DLinkedNode(key, value);
            // 添加进哈希表
            cache.put(key, newNode);
            // 添加至双向链表的头部
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                // 如果超出容量，删除双向链表的尾部节点
                DLinkedNode tail = removeTail();
                // 删除哈希表中对应的项
                cache.remove(tail.key);
                --size;
            }
        }
        else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.value = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}

