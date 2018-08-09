import java.util.Scanner;

public class array {

    public static void main(String [] args){

        int a[] = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);

        }

        int b[] = {33, 4, 5, 6, 8};
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }

        //2-d arrays
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();

        }
        int arr1[][]={{1,2,3},{8,7,5}};
        int brr[][] = {{4, 4,5},{7,8,9}};
        int c[][] =new int[2][3];


        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0,7);
        System.out.println(new String(copyTo));


        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3; j++) {
                c[i][j]=arr1[i][j]+brr[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }

    }



}
