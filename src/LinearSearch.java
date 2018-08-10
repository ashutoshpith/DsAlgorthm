import java.util.Scanner;

public class LinearSearch {


  static int linearSearch(int arr[], int n){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== n){
                return i;
            }


        }
        return -1;
    }

    public static void main(String [] args){
        int a[]=new int[5];
        System.out.println("Please Provide The 5 array from you find");
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i]= scanner.nextInt();

        }
        System.out.println("Please Enter the number you need to find");

        int k=scanner.nextInt();
        int p=linearSearch(a,k);
        
        System.out.println("Here is the index of the number via Linear Search");
        System.out.println(p);


    }
}
