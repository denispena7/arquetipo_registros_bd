package es.miinstituto.gestion.controller;

import es.miinstituto.gestion.repository.AlumnoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController 
{
	
	private final AlumnoRepository alumnoRepository;
	
	public AlumnoController(AlumnoRepository alumnoRepository) 
	{
		this.alumnoRepository = alumnoRepository;
	}
	
//	@GetMapping("/")
//	public String mostrarPrototipo(Model model) 
//	{
//		model.addAttribute("totalAlumno", alumnoRepository.count());
//		return "prototipo";
//	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) 
	{
		return "home";
	}
	
	@GetMapping("/alumnos")
	public String mostrarAlumnos(Model model)
	{
	    model.addAttribute("alumnos", alumnoRepository.findAll());
	    return "alumnos";
	}
}
