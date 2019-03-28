package Appointments;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AppointmentController {
	
	private final AppointmentRepository repository;

	AppointmentController(AppointmentRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/Appointments")
	List<Appointment> all() {
		return repository.findAll();
	}

	@PostMapping("/Appointments")
	Appointment newAppointment(@RequestBody Appointment newAppointment) {
		return repository.save(newAppointment);
	}

	// Single item

	@GetMapping("/Appointments/{id}")
	Appointment one(@PathVariable Long id) {

		return repository.findById(id)
				.orElseThrow(() -> new AppointmentNotFoundException(id));
	}

	@PutMapping("/Appointments/{id}")
	Appointment replaceAppointment(@RequestBody Appointment newAppointment, @PathVariable Long id) {

		return repository.findById(id)
				.map(Appointment -> {
					Appointment.setApptTime(newAppointment.getApptTime());
				    Appointment.setApptDate(newAppointment.getApptDate());
				    Appointment.setCheckingWanted(newAppointment.getCheckingWanted());
				    Appointment.setSavingsWanted(newAppointment.getSavingsWanted());
				    Appointment.setCDsMoneyMarketWanted(newAppointment.getCDsMoneyMarketWanted());
				    Appointment.setStudentBankingWanted(newAppointment.getStudentBankingWanted());
				    Appointment.setAutoLoansWanted(newAppointment.getAutoLoansWanted());
				    Appointment.setHomeEquityWanted(newAppointment.getHomeEquityWanted());
				    Appointment.setMortgageWanted(newAppointment.getMortgageWanted());
				    Appointment.setStudentLoansWanted(newAppointment.getStudentLoansWanted());
				    Appointment.setRetirementWanted(newAppointment.getRetirementWanted());
				    Appointment.setInvestmentWanted(newAppointment.getInvestmentWanted());
				    Appointment.setCreditCardWanted(newAppointment.getCreditCardWanted());
				    Appointment.setOtherWanted(newAppointment.getOtherWanted());
				    Appointment.setNote(newAppointment.getNote());
					return repository.save(Appointment);
				})
				.orElseGet(() -> {
					newAppointment.setId(id);
					return repository.save(newAppointment);
				});
	}

	@DeleteMapping("/Appointments/{id}")
	void deleteAppointment(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
