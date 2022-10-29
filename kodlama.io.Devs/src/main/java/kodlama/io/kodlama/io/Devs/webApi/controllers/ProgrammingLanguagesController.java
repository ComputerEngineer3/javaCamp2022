package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("/add")
	public List<ProgrammingLanguage> add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception{
		programmingLanguageService.add(programmingLanguage);
		return programmingLanguageService.getAll();
	}
	
	@PostMapping("/delete")
	public List<ProgrammingLanguage> delete(@RequestBody ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.delete(programmingLanguage);
		return programmingLanguageService.getAll();
	}
	
	@PostMapping("/update")
	public List<ProgrammingLanguage> update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception{
		programmingLanguageService.update(programmingLanguage);
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestParam("id") int id){
		return programmingLanguageService.getById(id);
	}
}
