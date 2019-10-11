package com.eltov.test.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.eltov.test.mapper.TestMapper;


@Service
public class TestService {

	@Inject
	TestMapper mapper;
	
	public String getTest() {
		List<String> result = mapper.getTest();
		
		return result.get(0);
	}
	
}
