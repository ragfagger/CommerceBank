package customer;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CustomerController {
	
	private final CustomerRepository repository;

	CustomerController(CustomerRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/Customers")
	List<Customer> all() {
		return repository.findAll();
	}

	@PostMapping("/Customers")
	Customer newCustomer(@RequestBody Customer newCustomer) {
		return repository.save(newCustomer);
	}

	// Single item

	@GetMapping("/Customers/{id}")
	Customer one(@PathVariable Long id) {

		return repository.findById(id)
				.orElseThrow(() -> new CustomerNotFoundException(id));
	}

	@PutMapping("/Customers/{id}")
	Customer replaceCustomer(@RequestBody Customer newCustomer, @PathVariable Long id) {

		return repository.findById(id)
				.map(Customer -> {
					Customer.setFirstName(newCustomer.getFirstName());
					Customer.setLastName(newCustomer.getLastName());
					Customer.setEmail(newCustomer.getEmail());
					Customer.setPhoneNumber(newCustomer.getPhoneNumber());
					Customer.setOnMailingList(newCustomer.getOnMailingList());
					return repository.save(Customer);
				})
				.orElseGet(() -> {
					newCustomer.setId(id);
					return repository.save(newCustomer);
				});
	}

	@DeleteMapping("/Customers/{id}")
	void deleteCustomer(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
