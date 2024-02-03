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
public class BubbleSort {
    void bubbleSort(ArrayList<String> stringList){
        for(int i = 0; i < stringList.size()-1; i++){
            for(int j = 0; j < stringList.size()-i-1; j++){
                if(stringList.get(j).compareTo(stringList.get(j+1)) > 0){
                    String extra = stringList.get(j);
                    stringList.set(j, stringList.get(j+1));
                    stringList.set(j+1, extra);
                    }
                }
            }
        }
    
    void bubbleSort(int[] intList){
        for(int i = 0; i < intList.length - 1; i++){
            for(int j = 0; j < intList.length - i - 1; j++){
                if(intList[j] > intList[j+1]){
                   int extra = intList[j];
                   intList[j] = intList[j+1];
                   intList[j+1] = extra;
                        }
                    }
                }
            }

    void bubbleSort(String[] stringList){
        for(int i = 0; i < stringList.length-1; i++){
            for(int j = 0; j < stringList.length-i-1; j++){
                if(stringList[j].compareTo(stringList[j+1]) > 0){
                    String extra = stringList[j];
                    stringList[j] = stringList[j+1];
                    stringList[j+1] = extra;
                    }
                }
            }
        }
    
    
}
