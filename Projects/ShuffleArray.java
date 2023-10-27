package test4;

public class ShuffleArray {
    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int swapIndex = (i + 1) % n;
            int temp = arr[i];
            arr[i] = arr[swapIndex];
            arr[swapIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        for (int i = 0; i < 5; i++) { // Adjust the number of times you want to shuffle
            shuffleArray(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
