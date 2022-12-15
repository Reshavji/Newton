package Dsa1;

public class Quick_sort {
    static int quick(int a[],int l, int h){
        int pivot = a[l];
        int i =l+1;
        int j =h;
        do{
            while(i<=h & a[i]<=pivot){
                i++;
            }
            while(j>=l& a[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }while(i<j);
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;
        return j;
    }
    static void divide(int a[], int l, int h){
        if (l<h){
            int p = quick(a,l,h);
            divide(a,l,p-1);
            divide(a,p+1,h);
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,7,1,22,4};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

}
