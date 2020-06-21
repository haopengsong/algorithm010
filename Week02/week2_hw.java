import javax.swing.tree.TreeNode;
import java.util.*;

public class week2_hw {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        /*
        1) get(Object key)：
           -首先利用key这个object中的的hashcode（）方法算出key的hash值；
           -在table数组（即哈希表）长度大于0时，首先检索table中hash值所对应桶中第一个node，若匹配key的hash，
            且key值或者内容一致，则返回该node的value；
           -否则（hash不同或key不同），持续检索该链表中其他node，直到链表末尾
                -若使用linkedhashmap则检索的node为treenode

        2）put(K key, V value)
            -利用key的hashcode
            -检索table，如果table为空，调用resize（）建立新table或者加大table
            -在table中查找hash所对应的桶
            -若对应桶为空，则用key，value建立新的node
            -若对应桶不为空，则检索桶内第一个元素，若能对应，则修改元素的value
                -若第一个元素无法对应，则看该元素是否为treenode，若是则调用treenode对应的putval
                -若不是treenode，则循环检索链表，直到找到该元素为止，若找不到，则在第一个null位置
                    建立node
                    -若找到了对应元素，跳出循环，修改元素value
            -完成添加后，若size超过threshold，扩充table
         */
    }
}

//binary tree inorder traversal
class Solution1 {
    public List < Integer > inorderTraversal(TreeNode root) {
        List< Integer > res = new ArrayList< >();
        Stack< TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}

//binary tree preorder traversal
class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }
}