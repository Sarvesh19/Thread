import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println(addOperationValue("0.00 h", 2));

	}

	/** Sums up operation value */
	private static float addOperationValue(String value, float sum) {
		int num1;
		float num2;
		if (value.contains("AW")) {
			num1 = Integer.parseInt(value.substring(0, value.length() - 3));
			sum += num1;
			return sum;
		} else if (value.contains("h")) {
			num2 = Float.parseFloat(value.substring(0, value.length()-1));
			sum += num2;
			String n = new java.text.DecimalFormat("#").format(sum);
			System.out.println(n);
			return sum;
		}
		return 0;
	}

}
