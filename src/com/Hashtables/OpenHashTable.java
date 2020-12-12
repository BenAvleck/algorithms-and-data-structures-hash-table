package com.Hashtables;
import com.Hashtables.LinkedList.LinkedList;

import static java.lang.StrictMath.pow;

public class OpenHashTable {
    LinkedList[] theArray;
    int arraySize;
    int itemsInArray = 0;


    public void addByKey(String value) {

            int arrayIndex = 0;
            int p = 31;
            for (int i = 0; i < value.length(); ++i) {
                arrayIndex += (Integer.parseInt("" + value.charAt(i)) * pow(p, i));
            }
            arrayIndex = arrayIndex % arraySize;
            System.out.println("Modules Index= " + arrayIndex + " for value " + value);
            this.theArray[arrayIndex].add(value);
            itemsInArray++;

    }
    public LinkedList findKey(String key){
        int arrayIndexHash = Integer.parseInt(key) % arraySize;

                // Found the key so return it
                System.out.println(key + " was found in index " + arrayIndexHash);
                theArray[arrayIndexHash].printList();
                return theArray[arrayIndexHash];
    }
    public void deleteKey(String value){
        int arrayIndexHash = Integer.parseInt(value) % arraySize;

        // Found the key so return it
        System.out.println(value + " was found in index " + arrayIndexHash);
        theArray[arrayIndexHash].delEl(value);
        System.out.println(theArray[arrayIndexHash]);
        itemsInArray--;
    }
    public void displayTheStack(){
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Key "+ i + ": ");
            theArray[i].printList();
            System.out.println();
        }
        }

    public OpenHashTable(int size) {
        arraySize = size;
        theArray = new LinkedList[size];
        for (int i = 0; i < arraySize; i++ )
            theArray[i] = new LinkedList();
    }
}
