package com.corona.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corona.entity.Corona;
import com.corona.exceptions.CoronaNotFoundException;
import com.corona.repo.CoronaRepository;

@Service
public class CoronaServiceImpl implements CoronaService {

	@Autowired
	private CoronaRepository coronaRepository;
	
	@Override
	public List<Corona> geAllCorona() {
		return coronaRepository.findAll();
	}

	@Override
	public Corona getCorona(Long id) throws CoronaNotFoundException {
		Optional<Corona> c = coronaRepository.findById(id);
		System.out.println("Corona: "+c.isEmpty());
		if(c.isEmpty()) throw new CoronaNotFoundException("Corona not found for id: "+id);
		return c.get();
//		return coronaRepository.findById(id).get();
	}

	@Override
	public Corona addCorona(Corona corona) {
		System.out.println(corona);
		return coronaRepository.save(corona);
	}

	@Transactional
	@Override
	public Corona updateCorona(Corona corona) {
		Corona existingCorona=coronaRepository.findById(corona.getId()).get();
		if(existingCorona!=null) {
			existingCorona.setCity(corona.getCity());
			existingCorona.setPatitents(corona.getPatitents());
			coronaRepository.save(existingCorona);
		}
		return corona;
	}

	@Override
	public String deleteCorona(long id) {
		coronaRepository.deleteById(id);
		return "deleted successfully.";
	}


}
