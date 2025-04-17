public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata yakalandi: " + e.getMessage());
        } finally {
            System.out.println("Program bitti.");
        }
    }
}
