package files;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            int addResult = calc.add(43, 79);
            System.out.println("Add Result: " + addResult);

            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: " + divResult);
        } catch (Exception e){
            System.out.println("Error message: " + e);
        }


    }
}
