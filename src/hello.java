public class hello {

        public static int[] twoSum(int[] nums, int target) {
            for (int i=0; i<nums.length; i++){
                for (int j=i+1; j<nums.length; j++){
                    if (nums[j]==target-nums[i]){
                        return new int[] {i,j};
                    }
                }
            }

throw  new IllegalArgumentException("no two sum");
        }


    public static int fd(int[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] == a[j]) {
                    return a[i];
                }
            }

        }
       return -1;
           }

    public static void main(String [] args){
            int a[]= {2, 7, 11, 15};
            int p[]={2, 1, 3, 5, 3, 2};
            int t = 9;
       // System.out.println(twoSum(a,t));
        System.out.println(fd(p));
    }
}
