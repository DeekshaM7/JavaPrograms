package assignment_5;

public class PaySlip {

    public static void main(String[] args) {


        NormalEmployee employee1 = new NormalEmployee();
        employee1.setName("John Doe");
        employee1.setEmployeeId(123);
        employee1.setDesignation("Sales Head");
        employee1.setDept("Sales");
        employee1.setDOJ("12/02/2023");
        employee1.setUAN(1232765678);
        employee1.setPFNo(56797545);
        employee1.setBankName("SBI");
        employee1.setAccountNo(1234567898);


        employee1.setGrossWage(21000.0);
        employee1.setTotalWorkingDays(30);
        employee1.setLop(1);

        double netSalary = employee1.theMonthly();
        System.out.println("------------Normal Employee------------");
        printPaySlip(employee1, netSalary);

        BonusEmployee employee2 = new BonusEmployee();
        employee2.setName("Amy Wilson");
        employee2.setEmployeeId(223);
        employee2.setDesignation("Sales Manager");
        employee2.setDept("Sales");
        employee2.setDOJ("14/09/2021");
        employee2.setUAN(274565678);
        employee2.setPFNo(67497545);
        employee2.setBankName("SBI");
        employee2.setAccountNo(456781298);


        employee2.setGrossWage(21000.0);
        employee2.setTotalWorkingDays(30);
        employee2.setLop(1);

        employee2.setBonus(0.105);


        double netSalary2 = employee2.theMonthly();
        System.out.println();
        System.out.println();
        System.out.println("------------Bonus Employee------------");
        printPaySlip(employee2, netSalary2);


    }

    private static void printPaySlip(Employee employee1, double netSalary) {

        System.out.println("Pay Slip for Employee:	" + employee1.getName());
        System.out.println("Employee ID:		" + employee1.getEmployeeId());
        System.out.println("Designation:		" + employee1.getDesignation());
        System.out.println("Department:		" + employee1.getDept());
        System.out.println("Date of Joining:		" + employee1.getDOJ());
        System.out.println("UAN:			" + employee1.getUAN());
        System.out.println("PF Number:		" + employee1.getPFNo());
        System.out.println("ESI Number:		" + employee1.getESINo());
        System.out.println();

        System.out.println("Bank Name:		" + employee1.getBankName());
        System.out.println("Account Number:		" + employee1.getAccountNo());

        System.out.println("Gross Wage:		" + employee1.getGrossWage());
        System.out.println("Total Working Days:	" + employee1.getTotalWorkingDays());

        System.out.println("Loss of Pay Days:	" + employee1.getLop());



        System.out.println();

        // Print salary-Earnings components
        System.out.println("*********Earnings*********");
        System.out.println("Basic Wage: 		  " + employee1.getBasicWage());
        System.out.println("HRA: 	    		  " + employee1.getHra());
        System.out.println("Conveyance Allowance:     " + employee1.getConveyanceAllowance());
        System.out.println("Medical Allowance: 	  " + employee1.getMedicalAllowance());
        System.out.println("Other Allowance: 	  " + employee1.getOtherAllowance());
        System.out.println("Total Earnings: 		  " + employee1.getTotalEarnings());
        System.out.println();

        // Print salary-Deductions components
        System.out.println("*********Deductions*********");
        System.out.println("EPF:			  " + employee1.getEPF());
        System.out.println("Health Insurance: 	  " + employee1.getHealthInsuranceAmt());
        System.out.println("Professional Tax: 	  " + employee1.getPT());
        System.out.println("Loan Recovery:		  " + employee1.getLoanRecovery());
        System.out.println("Total Deductions:	  " + employee1.getTotalDeductions());



        // Print total earnings, total deductions, and net salary


        System.out.println();
        System.out.println("*********Net_Salary*********");
        System.out.println("Net Salary: 		  " + netSalary);
    }

}