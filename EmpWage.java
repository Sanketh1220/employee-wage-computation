import java.util.Random;

public class EmpWage 
{
	public static void main(String args[])
	{
		System.out.println("This is employee wage computation");
		int wagePerHour = 20;
		int partTimeHour = 4;
		int fullDayHour = 8;
		int totalWorkingDays = 20;
		int wagePerDay = 0;
		int wagePartTime = 0;
		int workingHours = 0;
		int workingDays = 0;		

		while ((workingDays < 20) && (workingHours < 100)){
			Random n = new Random();
			int ran = n.nextInt(3);
			workingDays++;			

			switch(ran){
				case 2:
					wagePerDay = wagePerHour * fullDayHour;
					workingHours += fullDayHour; 
					System.out.println("Employee is Present and wage per day is " + wagePerDay);
					break;	
				case 1:
					wagePartTime = wagePerHour * partTimeHour;
					workingHours += partTimeHour;
					System.out.println("Employee is Present for part time and wage is " + wagePartTime);
					break;
				case 0:
					System.out.println("Employee is Absent");
					break;
				default:
             	System.out.println("Invalid");
			}
		}
		System.out.println(workingHours);
	}
}
