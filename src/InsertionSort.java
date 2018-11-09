public class InsertionSort {

    static void insertionSort(int arr[], int n){
        int i,j,t=0;
        for (i = 0; i <n; i++) {
            j =i;
            while ((j>0) && (arr[i] < arr[j-1])){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j=j-1;
            }


        }
    }

    public static void main(String [] args){
        System.out.println("hello");
        int a[]={2,9,3,6,4,1};
        insertionSort(a,5);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }

    }
}
