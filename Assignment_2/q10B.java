public class q10B {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            System.out.println("Before: array[0] = " + arr[0]);
    
            modarr(arr);
    
            System.out.println("After array[0] = " + arr[0]);
        }
    
        public static void modarr(int[] arr) {
            arr[0] = arr[0] * 17;
            System.out.println("Inside: arr[0] = " + arr[0]);
        }
    }
