package solved.array;

public class PlusOne {
//    hint: loop reverse, if digits[i] < 0, then digits[i]++ and return digits (ex: 123 -> 124)
//                            else, digits[i]=0, in next loop, consider if clause again, (ex: 19 -> 20)
//    out of the loop, if the solved.array only has one element, then size of solved.array increase by 1, set the first element of solved.array to 1 (ex: 9 -> 10)
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] ans = plusOne(new int[]{1, 9});
        for (Object num : ans){
            System.out.print(num + ", ");
        }
    }
}
