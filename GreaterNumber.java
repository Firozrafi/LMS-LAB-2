public class GreatestNumber {
    public static void main(String[] args) {
    
        int num1 = 126;
        int num2 = 142;
        int num3 = 007;
        int num4 = 026;
        int num5 = 139;

        System.out.println("The numbers are: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);

        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        if (num4 > greatest) {
            greatest = num4;
        }
        if (num5 > greatest) {
            greatest = num5;
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
