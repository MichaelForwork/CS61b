/**
 * demo for selection sort.
 */
public class Sort{
    public static String[] selectionSort(String[] stringArray){
        // find the smallest one

        // swap the smallest one with the first one.

        // repeat agian

        return null;
    }

    private static String findsmallest(String[] stringArray){
        int smallestIndex = 0;
        int compare = 0;
        for(int i=0; i<stringArray.length; i++){
            compare = stringArray[i].compareTo(stringArray[smallestIndex]);
            if(compare < 0){
                smallestIndex = i;
            }
        }
        return  stringArray[smallestIndex];
    }

}