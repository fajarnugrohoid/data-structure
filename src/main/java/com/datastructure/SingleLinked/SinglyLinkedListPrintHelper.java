package com.datastructure.SingleLinked;

import java.io.BufferedWriter;
import java.io.IOException;

public class SinglyLinkedListPrintHelper {

    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    public static void printData(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print( node.data );

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}
