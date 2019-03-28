package Appointments;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Appointment {

	    private @Id @GeneratedValue Long ApptId;
	    private @Id @GeneratedValue Long UserId;
	    private @Id @GeneratedValue Long BranchId;
	    private int ApptTime; //subject to change
	    private int ApptDate; //subject to change
	    private Boolean CheckingWanted;
	    private Boolean SavingsWanted;
	    private Boolean CDsMoneyMarketWanted;
	    private Boolean StudentBankingWanted;
	    private Boolean AutoLoansWanted;
	    private Boolean HomeEquityWanted;
	    private Boolean MortgageWanted;
	    private Boolean StudentLoansWanted;
	    private Boolean RetirementWanted;
	    private Boolean InvestmentWanted;
	    private Boolean CreditCardWanted;
	    private Boolean OtherWanted;
	    private String note;

	    Appointment() {}

	    Appointment(int ApptTime, int ApptDate, Boolean CheckingWanted, Boolean SavingsWanted,
	    			Boolean CDsMoneyMarketWanted, Boolean StudentBankingWanted, Boolean AutoLoansWanted,
	    			Boolean HomeEquityWanted, Boolean MortgageWanted, Boolean StudentLoansWanted,
	    			Boolean RetirementWanted, Boolean InvestmentWanted, Boolean CreditCardWanted,
	    			Boolean OtherWanted, String note) {
	        this.ApptTime = ApptTime;
		    this.ApptDate = ApptDate;
		    this.CheckingWanted = CheckingWanted;
		    this.SavingsWanted = SavingsWanted;
		    this.CDsMoneyMarketWanted = CDsMoneyMarketWanted;
		    this.StudentBankingWanted = StudentBankingWanted;
		    this.AutoLoansWanted = AutoLoansWanted;
		    this.HomeEquityWanted = HomeEquityWanted;
		    this.MortgageWanted = MortgageWanted;
		    this.StudentLoansWanted = StudentLoansWanted;
		    this.RetirementWanted = RetirementWanted;
		    this.InvestmentWanted = InvestmentWanted;
		    this.CreditCardWanted = CreditCardWanted;
		    this.OtherWanted = OtherWanted;
		    this.note = note;
	    }
	}

