public class Searching {
    public static void main(String [] args){
    new Searching();
    }

    Searching(){
        int arr[] =new int[]{2,5,1,9,6,7,5,3,10};
        binary_search(arr, 5);

    }

    public void binary_search(int arr[], int key){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == key){
                System.out.println("Index is : "+i);
            }
        }
    }

    //--------LOC ::-:>> ----------//
    //--------LOC ::-:>> ----------//

}
