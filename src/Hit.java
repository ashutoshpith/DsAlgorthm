import java.util.Scanner;

public class Hit {
    public static void main(String [] args){
        new Hit();
    }

    Hit(){
     int a[] = {2,9,5,7,3,6,25};


      // bubble_arrays_sort_asc(a);
      //bubble_arrays_sort_desc(a);
        insertion_sort(a);

        for (int j = 0; j <a.length ; j++) {
            System.out.println(a[j]);

        }


    }
    public  void bubble_arrays_sort_asc(int arr[]){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(arr[j] > arr[i]){
                    //swap elements
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        }
    }
}
    public  void bubble_arrays_sort_desc(int a[]){
        int n = a.length;
        int t = 0;
        for(int i=0; i < n; i++){
            for(int j=i+1; j < n; j++){
                if(a[j] > a[i]){
                    //swap elements
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

            }
        }
    }

    public void insertion_sort(int arr[]) {
        int i,j,t=0;
        for (i = 0; i <arr.length; i++) {
            j =i;
            while ((j>0) && (arr[i] < arr[j-1])){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j=j-1;
            }


        }
    }

}
