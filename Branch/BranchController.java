package Branch;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BranchController {
	
	private final BranchRepository repository;

	BranchController(BranchRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/Branchs")
	List<Branch> all() {
		return repository.findAll();
	}

	@PostMapping("/Branchs")
	Branch newBranch(@RequestBody Branch newBranch) {
		return repository.save(newBranch);
	}

	// Single item

	@GetMapping("/Branchs/{id}")
	Branch one(@PathVariable Long id) {

		return repository.findById(id)
				.orElseThrow(() -> new BranchNotFoundException(id));
	}

	@PutMapping("/Branchs/{id}")
	Branch replaceBranch(@RequestBody Branch newBranch, @PathVariable Long id) {

		return repository.findById(id)
				.map(Branch -> {
					Branch.setApptTime(newBranch.getApptTime());
				    Branch.setApptDate(newBranch.getApptDate());
				    Branch.setCheckingWanted(newBranch.getCheckingWanted());
				    Branch.setSavingsWanted(newBranch.getSavingsWanted());
				    Branch.setCDsMoneyMarketWanted(newBranch.getCDsMoneyMarketWanted());
				    Branch.setStudentBankingWanted(newBranch.getStudentBankingWanted());
				    Branch.setAutoLoansWanted(newBranch.getAutoLoansWanted());
				    Branch.setHomeEquityWanted(newBranch.getHomeEquityWanted());
				    Branch.setMortgageWanted(newBranch.getMortgageWanted());
				    Branch.setStudentLoansWanted(newBranch.getStudentLoansWanted());
				    Branch.setRetirementWanted(newBranch.getRetirementWanted());
				    Branch.setInvestmentWanted(newBranch.getInvestmentWanted());
				    Branch.setCreditCardWanted(newBranch.getCreditCardWanted());
				    Branch.setOtherWanted(newBranch.getOtherWanted());
				    Branch.setNote(newBranch.getNote());
					return repository.save(Branch);
				})
				.orElseGet(() -> {
					newBranch.setId(id);
					return repository.save(newBranch);
				});
	}

	@DeleteMapping("/Branchs/{id}")
	void deleteBranch(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
