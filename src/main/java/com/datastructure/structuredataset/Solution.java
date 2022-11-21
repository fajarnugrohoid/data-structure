package com.datastructure.structuredataset;

public class Solution {

    public static void main(String[] args) {


        StructureSet structureSet = new StructureSet();
        structureSet.addData( "fajar" );
        structureSet.addData( "agung" );
        structureSet.showData();
        structureSet.editData( 1, "nugroho" );
        structureSet.showData();

    }

}
