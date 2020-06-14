import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class week1_hw_2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        Queue<String> q = new LinkedList<>();

        /*
        queue分析：
            1）java中queue是一个接口，包含的方法有：
                                    add，offer
                                    remove，poll
                                    element，peek
            2）让元素以先进先出的顺序排列

         priorityqueue分析：
            1）jdk8中用balanced binary heap实现
            2）使用array存储元素
            3）对一个元素queue【n】，它的子节点分别位于2*n+1和2*（n+1）处
            4）队列中的元素顺序取决于传入的comparator，若没有传入则用元素的natural ordering
            5）插入元素为offer/add，使用siftUpComparable（）/siftUpUsingComparator（）实现
                -siftUpComparable是将元素插入到heap末端，再将其向上推，直到合适位置
            6）在siftUpComparable中默认顺序为parent节点小于各子节点，所以对每一个要插入的元素如果小于其parent节点元素，
            则替换parent元素到当前要插入节点位置，一直向上重复该操作，直到能够找到一个位置使得当要插入元素为parent时，其
            大小小于其各子节点元素
            7）siftUpUsingComparator（）与6）类似，只是要使用传入的比较器

            8）peek（）即查看array【0】位置的元素
            9）poll（）基于siftDownComparable/siftDownUsingComparator实现，删除了heap首部元素
            10）siftDownComparable（）是将heap末尾元素插入到首部，再将其不断向下推，直到到达一个位置使它小于或等于它的子节点
            或者自己成为一个leaf node


         */


    }
}
