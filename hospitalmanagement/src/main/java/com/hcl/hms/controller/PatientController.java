package com.hcl.hms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/*import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.hms.model.DiagnosisDetails;
import com.hcl.hms.model.Patient;
import com.hcl.hms.model.Physician;
import com.hcl.hms.service.DiagnosisService;
import com.hcl.hms.service.PatientService;
import com.hcl.hms.service.PhysicianService;

@Controller
public class PatientController {
	/*
	 * private static final Logger logger =
	 * LogManager.getLogger(PatientDaoImpl.class);
	 */
	@Autowired
	private PatientService patientService;

	@Autowired
	private PhysicianService physicianService;

	@Autowired
	private DiagnosisService diagnosisService;

	@GetMapping(value = "enroll")
	public String entrollPatient(Model model) {

		/*
		 * Patient patient= new Patient(); patient.setFname("Beena");
		 * patient.setLname("Kandpal"); patient.setDob("06/02/1998");
		 * patient.setEmail("demoemail@gmail.com"); patient.setNumber(1234567890);
		 * patient.setPassword("124356"); patient.setState("Delhi");
		 * patient.setInsurance_plan("#-plan");
		 */

		model.addAttribute("patient", new Patient());
		// patient= patientService.enrollPatient(patient);
		return "enroll";

	}

	@PostMapping(value = "after_enroll")
	public String afterEnrollPatient(@Valid @ModelAttribute("patient") Patient patient, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "enroll";
		}
		patient = patientService.enrollPatient(patient);

		if (patient != null) {
			model.addAttribute("patient", patient);
			model.addAttribute("succcessMessage", "Patient succcessfully added!!");
			return "enroll";
		} else {
			String errMessage = "Patient Not Enrolled";
			// model.addAttribute("error", errMessage);
			model.addAttribute("error", errMessage);
			return "enroll";
		}

	}

	@GetMapping(value = "beforeDiagnosis")
	public String beforeDia(Model model) {
		model.addAttribute("diagnosisDetails", new DiagnosisDetails());
		Patient patient = new Patient();
		Physician physician = new Physician();
		List<Physician> physicians = physicianService.listPhysician(physician);
		List<Patient> patients = patientService.listPatient(patient);
		model.addAttribute("patients", patients);
		model.addAttribute("physicians", physicians);

		return "addDiagnosisDetails";
	}

	@PostMapping(value = "detailsadded")
	public String addedDetails(@Valid @ModelAttribute("diagnosisDetails") DiagnosisDetails details,BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			Patient patient = new Patient();
			Physician physician = new Physician();
			List<Physician> physicians = physicianService.listPhysician(physician);
			List<Patient> patients = patientService.listPatient(patient);
			model.addAttribute("patients", patients);
			model.addAttribute("physicians", physicians);
			return "addDiagnosisDetails";
		}
		details = diagnosisService.addDetails(details);
		model.addAttribute("details", details);
		return "afterDiagnosis";
	}
	
	@GetMapping(value="/diagnosisDetails")
	public String enterPatientId() {
		return "diagnosisDetails";
	}
	@RequestMapping(value="/viewHistory")
	public String viewHistory( @RequestParam("patientId") int patientId,  Model model,HttpServletRequest request, HttpServletResponse response ) {
		
		Patient patient=patientService.getPatientById(patientId);
		List<DiagnosisDetails> details= patientService.viewHistory(patientId);
		System.out.println(details);
		
		model.addAttribute("patient", patient);
		model.addAttribute("details", details);
		return "patientDetail";
	}
	@GetMapping(value="patientLogin")
	public String Login() {
		return "patientLogin";
	}
	
	@PostMapping(value="afterPatientLogin")
	public String patientLogin(@RequestParam("email") String email, @RequestParam("password") String 
			password, Model model) {
		
		Patient patient=patientService.getPatient(email, password);
		
		
		if (patient != null) {
			model.addAttribute("patient", patient);
			model.addAttribute("succcessMessage", "Patient succcessfully Login!!");
			return "home2";
		} else {
			String errMessage = "Invalid Credentials";
			
			model.addAttribute("error", errMessage);
			return "patientLogin";
		}
				
	}
	
	
}
