package com.example.fulltest;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
class Appointment implements Serializable {

	    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long ApptId;
		private Long UserId;
	    /*private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long UserId;
	    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long BranchId;*/
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
		private Long branch_Id;


	Appointment() {}

	    Appointment(Long userId, Long branch_Id,Timestamp datetime, Boolean CheckingWanted, Boolean SavingsWanted,
	    			Boolean CDsMoneyMarketWanted, Boolean StudentBankingWanted, Boolean AutoLoansWanted,
	    			Boolean HomeEquityWanted, Boolean MortgageWanted, Boolean StudentLoansWanted,
	    			Boolean RetirementWanted, Boolean InvestmentWanted, Boolean CreditCardWanted,
	    			Boolean OtherWanted, String note) {
	        this.UserId = userId;
	        this.branch_Id = branch_Id;
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

	    Customer customer = new Customer();
	    Branch branch = new Branch();

	public Long getApptId() {
		return ApptId;
	}

	public void setApptId(Long apptId) {
		ApptId = apptId;
	}

	public Long getUserId() {
		return UserId= customer.getUserId();
	}

	public void setUserId(Long userId) {
		UserId = customer.getUserId();
	}

	public Long getbranch_Id() {
		return branch_Id = branch.getBranch_Id();
	}

	public void setbranch_Id(Long branch_Id) {
		branch_Id= branch.getBranch_Id();
	}

	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
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

