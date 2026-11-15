package Tutorial2;

public class Exceptions {
    public static void main(String[] args){
        int numbers[] = null;
        int numbers2[] ={1,2,3};
        try {
            System.out.println(numbers[0]); // This will throw a NullPointerException
            System.out.println(numbers2[3]); // This will throw an ArrayIndexOutOfBoundsException
            int result = devide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static int devide(int a, int b) throws ArithmeticException {
        return a / b; 
        // This will throw an ArithmeticException if b is 0
    }
}
