package Practice;
import java.util.*;

public class Calcimain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		
                //set the values in VO
		CalculatorVO calVO = new CalculatorVO();
		calVO.setFirstNumber(firstNumber); 
		calVO.setSecondNumber(secondNumber);
		
		CalciMethods cal = new CalciMethods();
		
		int addResult = cal.addition(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Addition Result ="+addResult);
		
		int subResult = cal.subtraction(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Subtraction Result ="+subResult);
		
		int mulResult = cal.multiplication(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Multiplication Result ="+mulResult);
		
		float divResult = cal.division(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Division Result ="+divResult);
        scan.close();
	}

}
