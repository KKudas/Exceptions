package files;

public class ExceptionEx1 {

    public static void main(String args[]) {

        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }

    public static void badUse(int[] vals) {
        int total = 0;
        
        try {
            for (int i = 0; i < vals.length; i++) {
                int index = vals[i];
                total += vals[index];
            }            
        } catch (Exception e){
                System.out.println("Error index:  " + e);
        }
        System.out.println(total);
    }
}
