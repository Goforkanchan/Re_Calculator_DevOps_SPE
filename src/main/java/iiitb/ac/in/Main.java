package iiitb.ac.in;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        Main obj = new Main();
        System.out.println("Calculator!");
        System.out.println("Please select one of the operations:");
        System.out.println("1. Press 1 for Square root");
        System.out.println("2. Press 2 for Factorial");
        System.out.println("3. Press 3 for Natural Logarithm");
        System.out.println("4. Press 4 for Power ");
        System.out.println("Press 5 to exit!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            int choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 1: {
                    System.out.println("Enter the number:");
                    double num = Double.parseDouble(br.readLine());
                    double result = obj.squareRoot(num);
                    System.out.println("Square root of the entered number is: " + result);
                    break;
                }
                case 2: {
                    System.out.println("Enter the number:");
                    double fact = Double.parseDouble(br.readLine());
                    double result = obj.factorial(fact);
                    System.out.println("Factorial of the entered number is: "+ result);
                    break;
                }
                case 3:{
                    System.out.println("Enter the number:");
                    double log = Double.parseDouble(br.readLine());
                    double result = obj.naturalLog(log);
                    System.out.println("Natural Log of the entered number is: "+ result);
                    break;
                }
                case 4: {
                    System.out.println("Enter the base number:");
                    double pow1 = Double.parseDouble(br.readLine());
                    System.out.println("Enter the exponent:");
                    double pow2 = Double.parseDouble(br.readLine());
                    double result = obj.power(pow1, pow2);
                    System.out.println("Power of the"+ pow1 +"raised to "+pow2+" is: "+ result);
                    break;
                }
                default: {
                    System.out.println("Exiting....");
                    return;
                }
            }

        }

    }

    private double power(double pow1, double pow2) {
        double result = 0;
        try{
            logger.info("Base and exponent are :"+ pow1+" ,"+pow2);

            if(pow1 <= 0 )
                throw new ArithmeticException("Base can't be 0 or negative.");
            else if(pow2 == 0)
                result = 1;
            else{
                result = Math.pow(pow1, pow2);
            }
        } catch(Exception e){
            logger.error("Base should be positive integer. ");
        }
        return result;
    }

    private double factorial(double fact) {
        Double result = 1.0;
        try {
            if (fact < 0)
                throw new ArithmeticException("Factorial of negative numbers is not possible!");

            while(fact > 0){
                result *= fact;
                fact--;
            }


        } catch(Exception e){
            logger.error("Factorial of negative numbers is not possible!"+e.getLocalizedMessage());
            return result.NaN;
        }
        return result;
    }

    private double naturalLog(double log) {
        double result = 0;
        try{
            logger.info("Base and exponent are :"+ 10+" ,"+log);

            if(log < 0 )
                throw new ArithmeticException("Log of negatives is not defined.");
            else{
                result = Math.log(log);
            }
        } catch(Exception e){
            logger.error("Log of negatives is not defined.");
        }
        return result;
    }

    private double squareRoot(double num) {
        double result = 0;
        try {
            logger.info("Number for square root:" + num);
            if (num <= 0) {
                throw new ArithmeticException("Number is either 0 or less than 0");
            }
            result = Math.sqrt(num);

        } catch (ArithmeticException e) {
            logger.error("Square root can't be negative or 0 " + e.getLocalizedMessage());
        }
        return result;
    }
}