package com.datastructure.SingleLinked;

import java.io.IOException;

public class Result {


    public static SinglyLinkedListNode condensexxx(SinglyLinkedListNode head) {
        // Write your code here

        while ( head != null && head.next!=null ) {

            while( head.next != null ){
                System.out.println( head.data + "==" + head.next.data );
                if ( head.data == head.next.data ){
                    head.next = head.next.next;
                }else {
                    head = head.next;
                }
            }
            head = head.next;

        }
        return head;
    }

    public static SinglyLinkedListNode condense(SinglyLinkedListNode head) throws IOException {
        // Write your code here
        SinglyLinkedListNode val1 = null, val2 = null;
        val1 = head;

        while (val1 != null && val1.next != null) {

            /*
            System.out.print( "bef-val1:"  );
            SinglyLinkedListPrintHelper.printData( val1, " ");
            System.out.println();
            System.out.print( "bef-val2:"  );
            SinglyLinkedListPrintHelper.printData( val2, " ");
            System.out.println();*/
            val2 = val1;
            /*
            System.out.print( "aft-val1:"  );
            SinglyLinkedListPrintHelper.printData( val1, " ");
            System.out.println();
            System.out.print( "aft-val2:"  );
            SinglyLinkedListPrintHelper.printData( val2, " ");
            System.out.println();*/

            while (val2.next != null) {
                System.out.println( "val1.data:" + val1.data + " == val2.next.data:" + val2.next.data );
                if ( val1.data == val2.next.data ) { //jika sama
                    val2.next = val2.next.next;  //data yg sama tadi ditimpa sama val next.next (yg selanjutnya)
                }
                else {
                    val2 = val2.next; //jika tidak sama lanjut lagi
                }
            }
            /*
            System.out.print( "->val1:"  );
            SinglyLinkedListPrintHelper.printData( val1, " ");
            System.out.println();
            System.out.print( "->val2:"  );
            SinglyLinkedListPrintHelper.printData( val2, " ");
            System.out.println();*/
            val1 = val1.next;
        }
        return head;
    }

}
