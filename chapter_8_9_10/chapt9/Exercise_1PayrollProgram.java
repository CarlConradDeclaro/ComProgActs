public class Exercise_1PayrollProgram {

    public static void main(String[] args) {
        long hoursWorked;
        double payRate; // if we remove this an error comes then tells us that the symbol cannot find
        double taxRate;

        hoursWorked = 40;
        payRate = 10.0; // if remove this, we will get an error becoz the variable payRate might not have been initialized
        taxRate = 0.10;

        System.out.println("Hours Worked: " + hoursWorked );
        System.out.println("pay Amount : " + (hoursWorked * payRate) );
        System.out.println("tax Amount : " + (hoursWorked * payRate * taxRate) );
    }
}
