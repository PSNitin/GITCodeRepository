package com.nitin.binarytreeprac;

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
class CreatePerfectBinaryTree {
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
    // TODO: Implement this method
    public TreeNode perfectBinaryTree(int depth) {

        return createNode(0,depth);
    }

    public TreeNode createNode(int level,int depth){

        TreeNode head = new TreeNode(level);
        if(level<depth){
            head.left=createNode(level+1,depth);
            head.right=createNode(level+1,depth);
        }else{
            head.left=null;
            head.right=null;
        }


        return head;
    }
}