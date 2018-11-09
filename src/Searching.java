import java.util.Scanner;

public class Searching {
    public static void main(String [] args){
    new Searching();
    }

    Searching(){
        int arr[] =new int[]{2,5,1,9,6,7,5,3,10};
        //linear_search(arr, 1);
        int arr1[] = {2, 3, 4, 10, 40};
        System.out.println(binary_search(arr1,10));

    }

    public void linear_search(int arr[],int item){
        int flag=0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==item)
            {
                flag = i+1;
                break;
            }
            else
                flag = 0;
        }
        if(flag != 0)
        {
            System.out.println("Item found at location" + flag);
        }
        else
            System.out.println("Item not found");



    }

    public int binary_search(int arr[], int item){
        int l=0,r=arr.length-1;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (arr[mid]==item){
                return mid;
            }
            else if (arr[mid]>item){
                return r=mid-1;
            }
            else {
                return l=mid+1;
            }
        }
        return -1;
    }


    //--------LOC ::-:>> ----------//
    //--------LOC ::-:>> ----------//

}
