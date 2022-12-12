package Dsa1;

public class Linear_search {
public static void main(String args[]){
    int arr[]= {8,2,5,9,3,1,7};
    int n =arr.length;
    int i =0;int x =1;int count=0;
    while(i<n){
        if(arr[i]==x)
        {
            System.out.print(i);
            count++;
        }
        i++;
    }
    if(count==0){
        System.out.print("Not Found!!");
    }
}

}
