package BinarySearchTree;
import node.TreeNode;
public class myBinarySearchTree {
    TreeNode root;
    public TreeNode getRoot() {
        return root;
    }
    //insert
    public void insert(int data) {
        //statements
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent=temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
                if (node.getData() <= parent.getData()) {
                    parent.setLeft(node);
                }
                else {
                    parent.setRight(node);
                }
            }
        }
    }
    //search
    public boolean search(int data) {
        //statements
        TreeNode temp = root;
        boolean response = false;
        while(temp!=null) {
            if(temp.getData()==data) {
                response=true;
                break;
            }
            else {
                if(data<temp.getData()) {
                    temp=temp.getLeft();
                }
                else{
                    temp=temp.getRight();
                }
            }
        }
        return response;
        }
    /* traverse */
    public void traversePreOrder(TreeNode node){
      //statements
    }



    }

