public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int j = 0; // position for non-zero

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.print("Output: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}