package com.example.bank.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

	public Long getApptId() {
		return ApptId;
	}

	public void setApptId(Long apptId) {
		ApptId = apptId;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public Long getBranchId() {
		return BranchId;
	}

	public void setBranchId(Long branchId) {
		BranchId = branchId;
	}

	public int getApptTime() {
		return ApptTime;
	}

	public void setApptTime(int apptTime) {
		ApptTime = apptTime;
	}

	public int getApptDate() {
		return ApptDate;
	}

	public void setApptDate(int apptDate) {
		ApptDate = apptDate;
	}

	public Boolean getCheckingWanted() {
		return CheckingWanted;
	}

	public void setCheckingWanted(Boolean checkingWanted) {
		CheckingWanted = checkingWanted;
	}

	public Boolean getSavingsWanted() {
		return SavingsWanted;
	}

	public void setSavingsWanted(Boolean savingsWanted) {
		SavingsWanted = savingsWanted;
	}

	public Boolean getCDsMoneyMarketWanted() {
		return CDsMoneyMarketWanted;
	}

	public void setCDsMoneyMarketWanted(Boolean CDsMoneyMarketWanted) {
		this.CDsMoneyMarketWanted = CDsMoneyMarketWanted;
	}

	public Boolean getStudentBankingWanted() {
		return StudentBankingWanted;
	}

	public void setStudentBankingWanted(Boolean studentBankingWanted) {
		StudentBankingWanted = studentBankingWanted;
	}

	public Boolean getAutoLoansWanted() {
		return AutoLoansWanted;
	}

	public void setAutoLoansWanted(Boolean autoLoansWanted) {
		AutoLoansWanted = autoLoansWanted;
	}

	public Boolean getHomeEquityWanted() {
		return HomeEquityWanted;
	}

	public void setHomeEquityWanted(Boolean homeEquityWanted) {
		HomeEquityWanted = homeEquityWanted;
	}

	public Boolean getMortgageWanted() {
		return MortgageWanted;
	}

	public void setMortgageWanted(Boolean mortgageWanted) {
		MortgageWanted = mortgageWanted;
	}

	public Boolean getStudentLoansWanted() {
		return StudentLoansWanted;
	}

	public void setStudentLoansWanted(Boolean studentLoansWanted) {
		StudentLoansWanted = studentLoansWanted;
	}

	public Boolean getRetirementWanted() {
		return RetirementWanted;
	}

	public void setRetirementWanted(Boolean retirementWanted) {
		RetirementWanted = retirementWanted;
	}

	public Boolean getInvestmentWanted() {
		return InvestmentWanted;
	}

	public void setInvestmentWanted(Boolean investmentWanted) {
		InvestmentWanted = investmentWanted;
	}

	public Boolean getCreditCardWanted() {
		return CreditCardWanted;
	}

	public void setCreditCardWanted(Boolean creditCardWanted) {
		CreditCardWanted = creditCardWanted;
	}

	public Boolean getOtherWanted() {
		return OtherWanted;
	}

	public void setOtherWanted(Boolean otherWanted) {
		OtherWanted = otherWanted;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}

