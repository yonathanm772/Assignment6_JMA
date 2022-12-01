/**
 * A class to realize a Depth First Search on a tree
 * 
 * @author Jonathan Moreira Alsina
 * @version 12/1/2022
 */
public class DFS{
	int nodesTraversed =0;
	Node root;
	
	/**
	 * DFS default constructor 
	 */
	public DFS () {
		System.out.println("Call DFS with root node to do a Depth First Search");
	}
	
	/**
	 * It checks if a node is a leaf. If it not, it recursively calls itself
	 * to get its left and right children.
	 * It also counts the number of nodes traversed.
	 * @param node of Node Type 
	 */
	public void DepthFirstSearch(Node node) {
		System.out.println(node.getData());
		nodesTraversed++;
		System.out.println("Nodes traversed: " + nodesTraversed);
		if( (node.getrChild()==null)&& (node.getlChild())== null ) {
			System.out.println("LEAF");
			
		}
		else {
			DepthFirstSearch(node.getrChild());
			DepthFirstSearch(node.getlChild());
			
		
		}
		
	}
}
