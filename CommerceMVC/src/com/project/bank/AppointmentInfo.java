package com.project.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class AppointmentInfo {

		private @Id @GeneratedValue Long ApptId;
	    private @Id @GeneratedValue Long UserId;
	    private @Id @GeneratedValue Long BranchId;
	    private int ApptTime; //subject to change
	    private int ApptDate; //subject to change
	    private String note;

	    AppointmentInfo() {}

	    AppointmentInfo(int ApptTime, int ApptDate, String note) {
        this.ApptTime = ApptTime;
	    this.ApptDate = ApptDate;
	    this.note = note;
    }
	}

