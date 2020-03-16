public class Runner {
    public static void main (String[] args) {
        int num1 = 4;
        int num2 = 2;

        Calculator calculator = new Calculator(num1, num2);
        System.out.println("sum of " + num1 + " and " + num2 +" is " + calculator.add(num1, num2));

        System.out.println(num1 +" - "+ num2 + " = "+ calculator.subtract(num1, num2));

        System.out.println(num1 +" * "+ num2 +" = "+ calculator.multiply(num1, num2));
//        System.out.println(planet.getName() + " is "+ planet.getSize());
//        System.out.println(planet.explode());
    }

}
