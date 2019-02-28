package customer;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Customer {

	    private @Id @GeneratedValue Long id;
	    private String FirstName;
	    private String LastName;
	    private String Email;
	    private String PhoneNumber;
	    private Boolean OnMailingList;

	    Customer() {}

	    Customer(String FirstName, String LastName, String Email, String PhoneNumber, boolean OnMailingList) {
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	        this.Email = Email;
	        this.PhoneNumber = PhoneNumber;
	        this.OnMailingList = OnMailingList;
	    }
	}

