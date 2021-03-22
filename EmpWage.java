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
		int wagePerDay = wagePerHour * fullDayHour;
		int wagePartTime = wagePerHour * partTimeHour;
		
		for(int i=0; i<totalWorkingDays; i++){
			Random n = new Random();
			int ran = n.nextInt(3);
		
			switch(ran){
				case 2:
					System.out.println("Employee is Present and wage per day is " + wagePerDay);
					break;	
				case 1:
					System.out.println("Employee is Present for part time and wage is " + wagePartTime);
					break;
				case 0:
					System.out.println("Employee is Absent");
			}
		}
	}
}
