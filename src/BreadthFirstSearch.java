import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node (int value) {
        data = value;
        left = right = null;
    }
}

public class BreadthFirstSearch {

    public static List<List<Integer>> bfsRecusrive(Node root, int level, List<List<Integer>> result) {
        // break condition
        if (root == null) return new ArrayList<>();

        // add a new level to result if needed
        if (result.size() <= level) result.add(new ArrayList<>());

        // for the corresponding level add node's data to the result
        result.get(level).add(root.data);

        // call recursive function for left and right
        bfsRecusrive(root.left, level + 1, result);
        bfsRecusrive(root.right, level + 1, result);

        return result;
    }

    public static List<List<Integer>> bfsIterative(Node root) {
        // break condition
        if  (root == null) return new ArrayList<>();

        // create a queue for level order traversal
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        // enqueue root
        queue.offer(root);
        int currentLevel = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            result.add(new ArrayList<>());

            for (int i = 0; i < length; i++) {
                // add front of queue and remove it from queue
                Node node = queue.poll();
                result.get(currentLevel).add(node.data);

                // enqueue left child
                if (node.left != null) queue.offer(node.left);
                // enqueue right child
                if (node.right != null) queue.offer(node.right);
            }

            currentLevel += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new  Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        //List<List<Integer>> result = bfsRecusrive(root, 0, new ArrayList<>());
        List<List<Integer>> result = bfsIterative(root);

        System.out.println(result);
    }
}
