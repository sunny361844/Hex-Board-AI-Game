
import java.util.ArrayList;

/**
 * A node in a tree of possible moves
 * 	(which ends up being a doubly-linked list).
 */
public class TreeNode {
	public ArrayList<TreeNode> children;
	public TreeNode parent;
	public double score;
	public int[][] board;
	public Location playLocation;
}