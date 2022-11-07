package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.TechnologyService;
import kodlama.io.kodlama.io.Devs.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.technologyResponses.GetAllTechnologiesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.technologyResponses.GetByIdTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}

	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception{
		technologyService.add(createTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest){
		technologyService.delete(deleteTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception{
		technologyService.update(updateTechnologyRequest);
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll(){
		return technologyService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdTechnologyResponse getById(int id){
		return technologyService.getById(id);
	}

}
