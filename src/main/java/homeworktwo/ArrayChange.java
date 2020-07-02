package homeworktwo;

public class ArrayChange {
    public void change() {
        int[] nums = {0, 1, 0, 1, 1, 1, 0, 0, 1};
        //System.out.println(nums[8]);
        int a = 0, b = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                System.out.println(nums[i]);
            } else {
                nums[i] = 0;
                System.out.println(nums[i]);
            }
        }
    }
}
