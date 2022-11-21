package com.datastructure.structuredataset;

public class StructureSet {


    private String[] data = new String[10];

    public StructureSet() {
    }

    public StructureSet(String[] data) {
        this.data = data;
    }

    public void addData( String value ){
        for (int i = 0; i < this.data.length; i++) {
            if ( this.data[i] == null ){
                this.data[i] = value;
                break;
            }
        }
    }

    public void editData( int idx, String value ){


            this.data[idx] = value;


    }

    public void showData(){
        for (int i = 0; i < this.data.length; i++) {
            if ( this.data[i]!=null ){
                System.out.println( this.data[i] );
            }
        }
    }

}
