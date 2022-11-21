package com.datastructure.SingleLinked;

import org.springframework.util.SerializationUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {


    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList head = new SinglyLinkedList();

        //int headCount = Integer.parseInt(bufferedReader.readLine().trim());
        int headCount = 8;
        List<Integer> x = Arrays.asList(3, 4, 3, 2, 6, 1, 2, 6);
        IntStream.range(0, headCount).forEach(i -> {
            int headItem = x.get( i );

            head.insertNode( headItem );
        });

        SinglyLinkedListNode result = Result.condense( head.head );

        SinglyLinkedListPrintHelper.printData( result, "\n");


        SinglyLinkedList val1 = new SinglyLinkedList();
        val1.insertNode( 5 );
        val1.insertNode( 4 );
        val1.insertNode( 3 );
        val1.insertNode( 2 );
        val1.insertNode( 1 );
        SinglyLinkedList val2 = new SinglyLinkedList();
        SinglyLinkedList val3 = new SinglyLinkedList();
        val2 = val1;
        val3 = (SinglyLinkedList)val1.clone();


        System.out.println("\n\n");
        SinglyLinkedListPrintHelper.printData( val1.head, " ");
        System.out.println();
        SinglyLinkedListPrintHelper.printData( val2.head, " ");
        System.out.println();
        SinglyLinkedListPrintHelper.printData( val3.head, " ");
        System.out.println("\n");
        val2.head.next.data = 9;
        System.out.println();
        SinglyLinkedListPrintHelper.printData( val1.head, " ");
        System.out.println();
        SinglyLinkedListPrintHelper.printData( val2.head, " ");
        System.out.println();
        SinglyLinkedListPrintHelper.printData( val3.head, " ");

        //bufferedWriter.newLine();



        bufferedReader.close();
        //bufferedWriter.close();
    }

}
