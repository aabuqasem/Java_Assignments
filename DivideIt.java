// Ahmad Abuqasem
public class DivideIt {
    
    public static void main(String[] args) {
        Integer num1 = new Integer(Integer.parseInt(args[0]));
        Integer num2 = new Integer(Integer.parseInt(args[1]));
        
        double div = num1.doubleValue() / num2.doubleValue();
        
        System.out.println(div);
    }
}