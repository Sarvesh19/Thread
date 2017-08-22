
public class MyLinkedList {
	public void addFirst(int num) {
		Node node = new Node();
		if (node.getHead() == null) {
			node.setHead(node);
		}
		
	}
}
