package egovframework.pat.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientSearchController {
	
	
	
	@RequestMapping(value = "/pat/PatientSearch.do")
	private String patientSearch(Model model) throws Exception {
		return ".main/pat/patientSearch";
	}
	

	
}