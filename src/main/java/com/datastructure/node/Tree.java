package com.datastructure.node;

public class Tree {

    public Tree() {

    }

    public void insert( Node node, int data ){
        if ( data < node.data ){
            if ( node.left==null ){
                node.left = new Node( data );
            }else{
                insert( node.left, data );
            }
        }else{
            if ( node.right==null ){
                node.right = new Node( data );
            }else{
                insert( node.right, data );
            }
        }
    }

    public void traversalPrint( Node node ){
        if ( node!=null ){
            traversalPrint( node.left );
            System.out.print( node.data + " " );
            traversalPrint( node.right );
        }
    }

    public void inOrderPrint(Node node){
        System.out.println("xxx");
        if (node.left != null) {
            inOrderPrint(node.left);
        }
        System.out.println("yyy");
        System.out.print(node.data + " ");

        if (node.right != null) {
            inOrderPrint(node.right);
        }
    }
    /*                   25
     *         15                    50
     *     10       22          35       70
     *   4   12   18  24      31  44   66   90
     *
     */

    public void preOrderPrint( Node node ){
        if ( node!=null ){
            System.out.print( node.data + " " );
            preOrderPrint( node.left );
            preOrderPrint( node.right );
        }
    }

    public void postOrderPrint( Node node ){
        if ( node!=null ){
            postOrderPrint( node.left );
            postOrderPrint( node.right );
            System.out.print( node.data + " " );

        }
    }


}
