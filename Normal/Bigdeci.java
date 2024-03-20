import java.math.*;

public class Bigdeci {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10999999999.511212212");
        BigDecimal num2 = new BigDecimal("512122121221.21212121121222122122");
        BigInteger num3 = new BigInteger("1111111122111121211221212111212212122112211212112");

        num1 = num1.add((num2));
        num2 = num2.multiply(num2);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
    
}
