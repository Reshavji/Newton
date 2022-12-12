package Dsa1;

public class Binary_search { public static void main(String args[]){
    int arr[] = {5,9,11,24,28,39,57};
    int n = arr.length;
    int x = 28;
    int i = 0;
    int j = n-1;
    while (i<=j){
        int m = (j+i)/2;
        if(arr[m]==x){
            System.out.print(m);
            break;
        }
        else if (x>arr[m]){
            i=m+1;
        }
        else {j=m-1;
        }}
    if(i>j){
        System.out.print("Not found");
    }

}
}
