import java.util.*;

public class EmpWage {

      public static final int wagePerHour = 20;
      public static final int partTimeHour = 4;
      public static final int fullDayHour = 8;
      public static final int totalWorkingDays = 20;

      public static int computeWage() {
      
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
		System.out.println("Total employee wage: " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {
		System.out.println("This is employee wage computation");	
		computeWage();
	}
}
