public class Main {
    public static void main(String[] args) {
        int[] nombres = {4, 8, 2, 9, 5, 1, 7, 3};

        System.out.println("func1 : " + func1(nombres));
        System.out.println("func2 : " + func2(nombres));
        System.out.println("func3 : " + func3(nombres, 5));
        System.out.println("func4 : " + func4(nombres, 5));
        System.out.println("func5 : " + func5(nombres, 5));
    }

    // Pattern A
    public static int func1(int[] t) {
        int res = 0;
        for (int i = 0; i < t.length; i++) {
            res = res + t[i];
        }
        return res;
    }

    // Pattern B
    public static int func2(int[] t) {
        int res = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < res) {
                res = t[i];
            }
        }
        return res;
    }

    // Pattern C
    public static int func3(int[] t, int val) {
        int res = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > val) {
                res++;
            }
        }
        return res;
    }

    // Pattern D
    public static int func4(int[] t, int val) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                return i;
            }
        }
        return -1;
    }

    // Pattern E
    public static boolean func5(int[] t, int val) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                return true;
            }
        }
        return false;
    }
}
