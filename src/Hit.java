import java.util.Arrays;

class Hit{
    public static void main(String [] args){
        new Hit();
    }

    Hit(){

        int a[] = {2,8,2,6,7,6,5,7,2,6,8,9};
        int input1[] = {1, 5, 10, 20, 40, 80};
        int input2[] = {6, 7, 20, 80, 100};
        int input3[] = {3, 4, 15, 20, 30, 70, 80, 120};


        //dublicate_arrays(a);
       // largerst_smallest_array(a);
         // kth_largest_element_array(a,2);
        //common_elements_in_3_array(input1,input2,input3);
        //System.out.println(first_element_repeat(a));
        remove_element(a,3);


    }

    public void dublicate_arrays(int a[]){
        int c=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i] + "-" + a[j]);
                    c++;
                    System.out.println(i);
                }
            }
        }
        System.out.println("-----");
        System.out.println(c);

    }

    public void largerst_smallest_array(int a[]){
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int arr:a) {
            if (arr > max){
                max = arr;
            }
            else if (arr<min){
                min = arr;
            }

        }
        System.out.println("largest ::-:>> "+max);
        System.out.println("smallest ::-:>> "+ min);

    }

    public void kth_largest_element_array(int arr[],int key){
        int c=0;
        for (int a:arr) {
            if (a==key) {
                System.out.println("number" + "::-:>> " + a);
             c++;            }

        }
        System.out.println("Number of times appear ::-:>> "+c);
    }

    public void common_elements_in_3_array(int arr1[],int arr2[],int arr3[]){

        for (int a1:arr1) {
            for (int a2:arr2) {
                for (int a3:arr3) {
                    if (a1==a2 && a2==a3){
                        System.out.println(a1);
                    }
                }
            }
        }
    }

  public int first_element_repeat(int arr[]){
      for (int a:arr) {
          for (int b:arr) {
              if (a==b)
                  return a;
              else
                  return Integer.valueOf("Not found");

          }
      }
         return -1;

  }

    public void add_with_iteself(int arr[]){
        for (int a:arr) {
            for (int b:arr) {
                if (a==b){
                    System.out.println(a+b);
                    break;

                }

            }
        }


    }

    public void remove_element(int arr[],int del_key){
        for (int i = del_key; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        for (int a:arr
             ) {
            System.out.println(a);

        }

    }

    //------------LOC-::-:>>---------------//
    //------------LOC-::-:>>---------------//


}