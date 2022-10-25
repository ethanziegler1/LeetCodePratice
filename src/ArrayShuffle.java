public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] array2 = {8,3,7,9,4,2,4};
        shuffle(array, 3);

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newArray[i] = nums[(int)(Math.random()*10)];
        }
        return newArray;
    }
}
