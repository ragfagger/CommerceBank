package Branch;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class BranchInfo {

		private @Id @GeneratedValue Long BranchId;
	    private String Street; //subject to change
	    private String City; //subject to change
		private String State;
		private int Zip;


	    BranchInfo() {}

	    BranchInfo(String Street, String City, String State, int Zip) {
        this.Street = Street;
	    this.City = City;
	    this.State = State;
		this.Zip = Zip;
    }
	}

