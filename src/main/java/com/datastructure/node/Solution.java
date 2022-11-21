package com.datastructure.node;

public class Solution {

    public static void main(String[] args) {

        Tree tree = new Tree();
        Node root = new Node( 25 );
        tree.insert( root, 15 );
        tree.insert( root, 10 );
        tree.insert( root, 4 );
        tree.insert( root, 12 );
        tree.insert( root, 22 );
        tree.insert( root, 18 );
        tree.insert( root, 24 );
        tree.insert( root, 50 );
        tree.insert( root, 35 );
        tree.insert( root, 31 );
        tree.insert( root, 44 );
        tree.insert( root, 70 );
        tree.insert( root, 66 );
        tree.insert( root, 90 );

        tree.traversalPrint( root );
        System.out.println();
        tree.preOrderPrint( root );
        System.out.println();
        tree.postOrderPrint( root );
        System.out.println();
        tree.inOrderPrint( root );
        /*                   25
        *         15                    50
        *     10       22          35       70
        *   4   12   18  24      31  44   66   90
        *
        */
        System.out.println();
        System.out.println( root.left.left.right.data  );

    }

}
