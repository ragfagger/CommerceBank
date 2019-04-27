package com.example.fulltest;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Branch{

	    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long Branch_Id;
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

	    Branch() {
	    	
		}

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

	public Long getBranch_Id() {
		return Branch_Id;
	}

	public void setBranch_Id(Long branch_Id) {
		Branch_Id = branch_Id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

	public Boolean getStudentLoansCovered() {
		return StudentLoansCovered;
	}

	public void setStudentLoansCovered(Boolean studentLoansCovered) {
		StudentLoansCovered = studentLoansCovered;
	}

	public Boolean getCheckingCovered() {
		return CheckingCovered;
	}

	public void setCheckingCovered(Boolean checkingCovered) {
		CheckingCovered = checkingCovered;
	}

	public Boolean getSavingsCovered() {
		return SavingsCovered;
	}

	public void setSavingsCovered(Boolean savingsCovered) {
		SavingsCovered = savingsCovered;
	}

	public Boolean getCDsMoneyMarketCovered() {
		return CDsMoneyMarketCovered;
	}

	public void setCDsMoneyMarketCovered(Boolean CDsMoneyMarketCovered) {
		this.CDsMoneyMarketCovered = CDsMoneyMarketCovered;
	}

	public Boolean getStudentBankingCovered() {
		return StudentBankingCovered;
	}

	public void setStudentBankingCovered(Boolean studentBankingCovered) {
		StudentBankingCovered = studentBankingCovered;
	}

	public Boolean getAutoLoansCovered() {
		return AutoLoansCovered;
	}

	public void setAutoLoansCovered(Boolean autoLoansCovered) {
		AutoLoansCovered = autoLoansCovered;
	}

	public Boolean getHomeEquityCovered() {
		return HomeEquityCovered;
	}

	public void setHomeEquityCovered(Boolean homeEquityCovered) {
		HomeEquityCovered = homeEquityCovered;
	}

	public Boolean getMortgageCovered() {
		return MortgageCovered;
	}

	public void setMortgageCovered(Boolean mortgageCovered) {
		MortgageCovered = mortgageCovered;
	}

	public Boolean getRetirementCovered() {
		return RetirementCovered;
	}

	public void setRetirementCovered(Boolean retirementCovered) {
		RetirementCovered = retirementCovered;
	}

	public Boolean getInvestmentCovered() {
		return InvestmentCovered;
	}

	public void setInvestmentCovered(Boolean investmentCovered) {
		InvestmentCovered = investmentCovered;
	}

	public Boolean getCreditCardCovered() {
		return CreditCardCovered;
	}

	public void setCreditCardCovered(Boolean creditCardCovered) {
		CreditCardCovered = creditCardCovered;
	}

	public Boolean getOtherCovered() {
		return OtherCovered;
	}

	public void setOtherCovered(Boolean otherCovered) {
		OtherCovered = otherCovered;
	}
}

