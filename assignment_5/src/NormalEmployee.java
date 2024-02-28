package assignment_5;

public class NormalEmployee extends Employee {

    @Override
    public double theMonthly() {


        //Earnings

        //BasicWage
        setBasicWage(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))*0.45);

        //HRA
        setHra(getBasicWage()*0.4);

        //ConveyanceAllowance
        setConveyanceAllowance((1600/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));

        //MedicalAllowance
        setMedicalAllowance((1250/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));

        //OtherAllowance
        setOtherAllowance(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))-getBasicWage()-getHra()-getConveyanceAllowance()-getMedicalAllowance());

        //TotalEarnings
        setTotalEarnings(getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance() + getOtherAllowance());


        //Deductions

        //EPF
        if(getBasicWage()>=15000)
        {
            setEPF(15000*0.12);
        }
        else {
            setEPF(getBasicWage()*0.15);
        }

        //ESI
        if(getGrossWage()<=21000)
        {
            setHealthInsuranceAmt(getTotalEarnings()*0.0075);
        }
        else
        {
            setHealthInsuranceAmt(0);
        }

        //ProfessionalTax
        setPT(0);

        //LoanRecovery
        setLoanRecovery(0);

        //Total Deductions
        setTotalDeductions(getEPF() + getHealthInsuranceAmt() + getPT() + getLoanRecovery());

        //Net_Salary
        setNet_salary(getTotalEarnings() - getTotalDeductions());

        return getNet_salary();

    }
}