import java.util.Scanner;

public class BinarySearch {

static int binarySearch(int arr[], int n){
    int left=0;
    int right=arr.length-1;
    while(left <= right){
        int middle = left + (right-1)/2;
        if (arr[middle]==n)
            return middle;
        if (arr[middle]<n)
            left = middle+1;
        else
            right = middle-1;
    }
    return -1;
}


    public static void main(String [] args){
     Print p=new Print();
    p.prints("Enter The Sorted number you implement BinarySearch");
    int arr[]=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            arr[i]=scanner.nextInt();

        }
        p.prints("Enter The number you want to need the index postion");
        int k=scanner.nextInt();
        p.prints("Here is your ans");
        p.printi(binarySearch(arr,k));


    }
}
