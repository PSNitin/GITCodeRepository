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
class LevelOrderTraverseBinaryTree {

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



    public List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list = levelOrder(root,0,list);
        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root, int level, List<List<Integer>> list){

        int temp = (int) root.val;

        if(list.size()<level+1){
            List<Integer> tempList = new ArrayList<>();
            list.add(tempList);
        }

        list.get(level).add(temp);

        if(root.left!=null){
            list=levelOrder(root.left,level+1,list);
        }
        if(root.right!=null){
            list=levelOrder(root.right,level+1,list);
        }

        return list;
    }
}
