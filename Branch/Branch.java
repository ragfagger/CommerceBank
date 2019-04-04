package Branch;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Branch {

	    private @Id @GeneratedValue Long BranchId;
	    private String Street; //subject to change
	    private String City; //subject to change
		private String State;
		private int Zip;
	    private Boolean CheckingCovered;
	    private Boolean SavingsCovered;
	    private Boolean CDsMoneyMarketCovered;
	    private Boolean StudentBankingCovered;
	    private Boolean AutoLoansCovered;
	    private Boolean HomeEquityCovered;
	    private Boolean MortgageCovered;
	    private Boolean StudentLoansCovered;
	    private Boolean RetirementCovered;
	    private Boolean InvestmentCovered;
	    private Boolean CreditCardCovered;
	    private Boolean OtherCovered;

	    Branch() {}

	    Branch(String Street, String City, String State, int Zip, Boolean CheckingCovered, Boolean SavingsCovered,
	    			Boolean CDsMoneyMarketCovered, Boolean StudentBankingCovered, Boolean AutoLoansCovered,
	    			Boolean HomeEquityCovered, Boolean MortgageCovered, Boolean StudentLoansCovered,
	    			Boolean RetirementCovered, Boolean InvestmentCovered, Boolean CreditCardCovered,
	    			Boolean OtherCovered) {
	        this.Street = Street;
		    this.City = City;
			this.State = State;
			this.Zip = Zip;
		    this.CheckingCovered = CheckingCovered;
		    this.SavingsCovered = SavingsCovered;
		    this.CDsMoneyMarketCovered = CDsMoneyMarketCovered;
		    this.StudentBankingCovered = StudentBankingCovered;
		    this.AutoLoansCovered = AutoLoansCovered;
		    this.HomeEquityCovered = HomeEquityCovered;
		    this.MortgageCovered = MortgageCovered;
		    this.StudentLoansCovered = StudentLoansCovered;
		    this.RetirementCovered = RetirementCovered;
		    this.InvestmentCovered = InvestmentCovered;
		    this.CreditCardCovered = CreditCardCovered;
		    this.OtherCovered = OtherCovered;
	    }
	}

