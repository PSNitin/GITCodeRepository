package com.nitin.binarytreeprac;

import java.io.*;
import java.util.*;


/*
Definition of TreeNode
class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

Use new TreeNode(data) to create new Node
*/
public class DeleteLeaveNode {

    public TreeNode binaryTreeDeletion(TreeNode root) {

        if(root.right==null && root.left==null){
            return root;
        }

        deleteLeave(root);

        return root;
    }

    public static void deleteLeave(TreeNode root){

        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null){
                root.left=null;
            }else{
                deleteLeave(root.left);
            }
        }

        if(root.right!=null)
        {
            if(root.right.left==null && root.right.right==null)
            {
                root.right=null;
            }else
            {
                deleteLeave(root.right);
            }
        }
    }

    class TreeNode {
        public long val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode (long x) {
            val = x;
            left = null;
            right = null;
        }
    }
}