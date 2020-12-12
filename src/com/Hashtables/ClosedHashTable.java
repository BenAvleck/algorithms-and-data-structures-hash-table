package com.Hashtables;
import java.util.Arrays;

public class ClosedHashTable {
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    private static Object resizeArray (String[] oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class elementType = oldArray.getClass().getComponentType();
        String[] newArray = new String[newSize];
        java.util.Arrays.fill(newArray, "-1");
        int preserveLength = Math.min(oldSize, newSize);
        for (int i = 0; i < oldSize; i++)
        {
            int arrayIndex = Integer.parseInt(oldArray[i])% (newSize);
            System.out.println("Modules Index= "+ arrayIndex + " for value "+ oldArray[i]);
            while (!newArray[arrayIndex].equals("-1")) {
                ++arrayIndex;
                System.out.println("Collision Try " + arrayIndex + " Instead");
                arrayIndex %= oldSize;
            }
            newArray[arrayIndex] = oldArray[i];
        }
        return newArray;
    }

    public String findKey(String key) {

        // Find the keys original hash key
        int arrayIndexHash = Integer.parseInt(key) % (arraySize);

        if (!theArray[arrayIndexHash].equals("-1")) {



                // Found the key so return it
                System.out.println(theArray[arrayIndexHash] + " was found in index "
                        + arrayIndexHash);

                return theArray[arrayIndexHash];
        }
        return null;
    }

    public String deleteKey(String key) {
        int arrayIndexHash = Integer.parseInt(key) % (arraySize);
            if (!theArray[arrayIndexHash].equals("-1")) {
                    System.out.println(key + " was found in index "
                            + arrayIndexHash);
                    theArray[arrayIndexHash] = "-1";
                    System.out.println(arrayIndexHash + " was deleted");
            }
            else
                System.out.println("Key "+key+ " has no value!");

        return null;
    }

    public void displayTheStack() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Key " + i + ": ");
                System.out.printf(theArray[i]);
                if (i == arraySize -1 && theArray[i-1] != " ")
                    System.out.printf(".");
                else
                    System.out.printf(";");
            System.out.println();
        }
    }

    public void addBy(String key,String value) {

        int arrayIndex = Integer.parseInt(key)% (arraySize);
        System.out.println("Modules Index= "+ arrayIndex + " for value "+ value);
        while (!this.theArray[arrayIndex].equals("-1")) {
            ++arrayIndex;
            System.out.println("Collision Try " + arrayIndex + " Instead");
            arrayIndex %= arraySize;
        }
        theArray[arrayIndex] = value;
        itemsInArray++;
        if ((itemsInArray ) >= arraySize*0.85 ) {
            theArray = (String[]) resizeArray(theArray, arraySize * 2);
            arraySize *= 2;
        }
    }



    public ClosedHashTable(int size) {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

}
