package com.corona.service;

import java.util.List;

import com.corona.entity.Corona;
import com.corona.exceptions.CoronaNotFoundException;

public interface CoronaService {

	public List<Corona> geAllCorona();

	public Corona getCorona(Long id) throws CoronaNotFoundException;

	public Corona addCorona(Corona corona);

	public Corona updateCorona(Corona corona);

	public String deleteCorona(long id);
}
