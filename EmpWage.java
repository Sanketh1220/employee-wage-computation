import java.util.*;

public class EmpWage {

      //public static final int wagePerHour = 20;
      public static final int partTimeHour = 4;
      public static final int fullDayHour = 8;
      //public static final int totalWorkingDays = 20;

      public static int computeWage(String company, int wagePerHour, int totalWorkingDays, int maxWorkingHours ) {
      
			//int wagePerDay = 0;
      	//int wagePartTime = 0;
      	int workingHours = 0;
      	int workingDays = 0;

      	while ((workingDays < totalWorkingDays) && (workingHours < maxWorkingHours)){
         	Random n = new Random();
         	int ran = n.nextInt(3);
         	workingDays++;

         	switch(ran){
            	case 2:
               	//wagePerDay = wagePerHour * fullDayHour;
               	workingHours += fullDayHour;
               	//System.out.println("Employee is Present and wage per day is " + wagePerDay);
               	break;
            	case 1:
               	//wagePartTime = wagePerHour * partTimeHour;
               	workingHours += partTimeHour;
               	//System.out.println("Employee is Present for part time and wage is " + wagePartTime);
               	break;
            	case 0:
               	//System.out.println("Employee is Absent");
               	break;
            	default:
               	//System.out.println("Invalid");
         	}
			//System.out.println("This is: " + workingHours);
      }
      int totalEmpWage = workingHours * wagePerHour;
		//System.out.println(workingHours);
		System.out.println("Total employee wage for "+ company + " : " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		System.out.println("This is employee wage computation");	
		computeWage("Wellsfargo", 20, 18, 80);
		computeWage("Reliance", 10, 20, 100);
	}
}
