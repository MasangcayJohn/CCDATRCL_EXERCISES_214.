
public class tree {
	    public static void main(String[] args) {

	        // Create root node A
	        Node A = new Node("Aries");
	        // Create node B
	        Node B = new Node("Taurus");
	        // Create node C
	        Node C = new Node("Gemini");
	        // Create node D
	        Node D = new Node("Cancer");
	        // Create node E
	        Node E = new Node("Leo");
	        // Create node F
	        Node F = new Node("Virgo");
	        // Create node G
	        Node G = new Node("Sagittarius");

	        // Set left and right child of root node A
	        A.left = B;
	        A.right = C;

	        // Set left and right child of node B
	        B.left = D;
	        B.right = E;

	        // Set left and right child of node C
	        C.left = F;
	        C.right = G;

	        System.out.print("\n In order Traversal:\n ");
	        traverseInOrder(A);

	        System.out.print("\n Pre order Traversal:\n ");
	        traversePreOrder(A);

	        System.out.print("\nPost order Traversal:\n ");
	        traversePostOrder(A);
	    }

	    // Traverse In order Method
	    static void traverseInOrder(Node node) {
	        if (node != null) {
	            traverseInOrder(node.left);
	            System.out.print(" " + node.data);
	            traverseInOrder(node.right);
	        }
	    }

	    // Traverse Post order method
	    static void traversePostOrder(Node node) {
	        if (node != null) {
	            traversePostOrder(node.left);
	            traversePostOrder(node.right);
	            System.out.print(" " + node.data);
	        }
	    }

	    // Traverse Pre order method
	    static void traversePreOrder(Node node) {
	        if (node != null) {
	            System.out.print(" " + node.data);
	            traversePreOrder(node.left);
	            traversePreOrder(node.right);
	        }
	    }
	}

