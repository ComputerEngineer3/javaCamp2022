package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();
		
		for (ProgrammingLanguage pl : programmingLanguages) {
			if(pl.getName().equals(programmingLanguage.getName())) {
				throw new Exception("İsimler tekrar edemez.");
			}
		}
		
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();
		
		for (ProgrammingLanguage pl : programmingLanguages) {
			if(pl.getName().equals(programmingLanguage.getName())) {
				throw new Exception("İsimler tekrar edemez.");
			}
		}
		
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.getById(id);
		return programmingLanguage;
	}

}
