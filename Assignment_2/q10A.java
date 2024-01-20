package Assignment_2;

class q10A {
        public static void main(String[] args) {
        int x = 20;
        System.out.println("Before call: x = " + x);
        increaseValue(x);
        System.out.println("After call: x = " + x);
        }
    
        public static void increaseValue(int value) {
            value = value * 3;
            System.out.println("Inside = " + value);
        }
    }
    
