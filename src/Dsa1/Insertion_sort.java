package Dsa1;

public class Insertion_sort {
    public static void main(String args[]){
        int arr[]= {4,6,5,9,11,1};
        int n = arr.length;
        for(int j =1;j<n;j++){
        int key = arr[j];
        int i =j-1;
        for (;i>=0;i--){
            if(arr[i]>=key){
                arr[i+1]=arr[i];
            }
            else {
                arr[i+1]=key;
                break;
            }
        }
        if(i<0){
            arr[i+1]=key;
        }}
        for (int j =0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
