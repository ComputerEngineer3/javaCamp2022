package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.requests.technologyRequests.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.responses.technologyResponses.GetAllTechnologiesResponse;
import kodlama.io.kodlama.io.Devs.business.responses.technologyResponses.GetByIdTechnologyResponse;

public interface TechnologyService {
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
	void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception;
	List<GetAllTechnologiesResponse> getAll();
	GetByIdTechnologyResponse getById(int id);
}
