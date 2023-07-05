package com.corona.service;

import java.util.List;

import com.corona.entity.Corona;

public interface CoronaService {

	public List<Corona> geAllCorona();

	public Corona getCorona(Long id);

	public Corona addCorona(Corona corona);

	public Corona updateCorona(Corona corona);

	public String deleteCorona(long id);
}
