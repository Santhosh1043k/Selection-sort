public class Main {
    public static void main(String[] args) {
        int nums[] = {4, 6, 3, 1, 8, 2};
        int temp = 0;
        int mini = 0;
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < nums.length-1; i++) {
            mini = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[mini]>nums[j]){
                    mini =j;

                }
                temp = nums[mini];
                nums[mini]=nums[i];
                nums[i]=temp;;
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
}
