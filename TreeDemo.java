public class TreeDemo {
	public static void main(String[] args){
		Node myNode = new Node(5);
		myNode.addNode(6);
		myNode.addNode(8);
		myNode.addNode(1);
		myNode.addNode(27);
		myNode.addNode(90);
		myNode.printInOrder();
		myNode.printPreOrder();
		myNode.printPostOrder();
	}

	public static class Node {
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public void addNode(int val) {
			if(val <= data){
				if(left == null){
					left = new Node(val);
				} else {
					left.addNode(val);
				}
			} else {
				if(right == null){
					right = new Node(val);
				} else {
					right.addNode(val);
				}
			}
		}

		public boolean contains(int val) {
			if(data == val) return true;

			if(val <= data){
				if(left == null) {
					return false;
				} else {
					left.contains(val);
				}
			} else {
				if(right == null) {
					return false;
				} else {
					right.contains(val);
				}
			}
			return false;
		}

		public void printInOrder() {
			if(left != null){
				left.printInOrder();
			}
			System.out.println(data);
			if(right != null) {
				right.printInOrder();
			}
		}

		public void printPreOrder() {
			System.out.println(data);
			if(left != null){
				left.printInOrder();
			}
			if(right != null) {
				right.printInOrder();
			}
		}

		public void printPostOrder() {
			if(left != null){
				left.printInOrder();
			}
			if(right != null) {
				right.printInOrder();
			}
			System.out.println(data);
		}
	}
}