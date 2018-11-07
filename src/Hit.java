import java.util.Scanner;

public class Hit {
    public static void main(String [] args){
        new Hit();
    }

    Hit(){
     int a[] = new int[6];
        int i=0, t=0;

        Scanner scanner=new Scanner(System.in);

        for ( i = 0; i <a.length ; i++) {
            a[i] = scanner.nextInt();


        }

       Bubble_Arrays_sort(a);


        for (int j = 0; j <a.length ; j++) {
            System.out.println(a[j]);

        }


    }
    public  void Bubble_Arrays_sort(int arr[]){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                
        }
    }
}}
