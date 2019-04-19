package Appointments;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
class AppointmentInfo {

		private @Id @GeneratedValue Long ApptId;
	    private @Id @GeneratedValue Long UserId;
	    private @Id @GeneratedValue Long BranchId;
	    private Timestamp datetime;
	    private String note;

	    AppointmentInfo() {}

	    AppointmentInfo(Timestamp datetime, String note) {
        this.datetime = datetime;
	    this.note = note;
    }
	}

