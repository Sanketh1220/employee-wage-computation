import java.util.Random;

public class EmpWage 
{
	public static void main(String args[])
	{
		System.out.println("This is employee wage computation");
		int wagePerHour = 20;
		int partTimeHour = 4;
		int fullDayHour = 8;
		int wagePerDay = wagePerHour * fullDayHour;
		int wagePartTime = wagePerHour * partTimeHour;
		Random n = new Random();
		int ran = n.nextInt(3);
		if(ran == 2){
			System.out.println("Employee is Present and wage per day is " + wagePerDay);
		}else if(ran == 1) {
			System.out.println("Employee is Present for part time and wage is " + wagePartTime);
		}else{
			System.out.println("Employee is Absent");
		}
	}
}
