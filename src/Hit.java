class Hit{
    public static void main(String [] args){
        new Hit();
    }

    Hit(){
        int a[] = {2,8,2,6,7,6,5,7,2,6,8,9};
       // dublicate_arrays(a);
        largerst_smallest_array(a);



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
}