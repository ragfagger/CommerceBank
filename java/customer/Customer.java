package customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Customer {

    private @Id @GeneratedValue Long id;
    private String ;
    private String
}