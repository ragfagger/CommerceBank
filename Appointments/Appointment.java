package Appointments;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
class Appointment {

	    private @Id @GeneratedValue Long ApptId;
	    private @Id @GeneratedValue Long UserId;
	    private @Id @GeneratedValue Long BranchId;
	    private Timestamp datetime;
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

	    Appointment(Timestamp datetime, Boolean CheckingWanted, Boolean SavingsWanted,
	    			Boolean CDsMoneyMarketWanted, Boolean StudentBankingWanted, Boolean AutoLoansWanted,
	    			Boolean HomeEquityWanted, Boolean MortgageWanted, Boolean StudentLoansWanted,
	    			Boolean RetirementWanted, Boolean InvestmentWanted, Boolean CreditCardWanted,
	    			Boolean OtherWanted, String note) {
	        this.datetime = datetime;
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

