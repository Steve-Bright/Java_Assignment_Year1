/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swamhtet_assignment2;

import java.util.ArrayList;

/**
 *
 * @author Ken
 */
public class BinarySearch {
    BubbleSort b = new BubbleSort();
    
    int binarySearch(int[] numList, int num){
        b.bubbleSort(numList);
        int low = 0, high = numList.length -1;
        
        if(high >= low){
            int middle = (high + low) / 2;
            if(num == numList[middle]){
                return middle;
            }
            else if(num > numList[middle]){
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
        }
        return -1;
    }
    
    int binarySearch(String[] stringList, String stringVal){
        b.bubbleSort(stringList);
        
        int low = 0, high = stringList.length -1;
        
        while(high >= low){
            int middle = (high + low) / 2;
            if(stringVal.compareTo(stringList[middle]) == 0){
                return middle;
            }
            else if(stringVal.compareTo(stringList[middle]) > 0){
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
        }
        return -1;
    }
    
    int binarySearch(ArrayList<String> stringList, String stringVal){
        b.bubbleSort(stringList);
        
        int low = 0, high = stringList.size() -1;
        
        while(high >= low){
            int middle = (high + low) / 2;
            if(stringVal.compareTo(stringList.get(middle)) == 0){
                return middle;
            }
            else if(stringVal.compareTo(stringList.get(middle)) > 0){
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
