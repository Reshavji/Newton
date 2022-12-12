package Dsa1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hashing_fre {
    public static void main(String args[]){
        int arr [] = {6,7,1,5,2,6,9,1,1};
        int n = arr.length;
        LinkedHashMap<Integer, Integer> myval = new LinkedHashMap<>();
        for(int i =0;i<n;i++){
            int num = arr[i];
            if(myval.containsKey(num) ==false){
                myval.put(num,1);
            }
            else{
                int count = myval.get(num);
                myval.put(num,count+1);
            }
        }
        for(Map.Entry<Integer,Integer> ans : myval.entrySet()){
            if(ans.getValue() >1){
                System.out.print(ans.getKey()+ " ");
                break;
            }
        }


    }
}
