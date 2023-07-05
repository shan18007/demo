package com.corona.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corona.entity.Corona;
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
	public Corona getCorona(Long id) {
		return coronaRepository.findById(id).get();
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
