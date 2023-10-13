package files;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        double result;
        try {
            result = x / y;
            return result;
        } catch (Exception a){
            throw new ArithmeticException("Arithmethic Excpetion error: " + a);
        }

    }
}
