import java.util.Random;

public class EmpWage 
{
	public static void main(String args[])
	{
		System.out.println("This is employee wage computation");
		int wagePerHour = 20;
		int fullDayHour = 8;
		int wagePerDay = wagePerHour * fullDayHour;
		Random n = new Random();
		int ran = n.nextInt(2);
		if(ran == 1){
			System.out.println("Employee is Present and wage per day is " + wagePerDay);
		}else {
			System.out.println("Employee is Absent");
		}
	}
}
