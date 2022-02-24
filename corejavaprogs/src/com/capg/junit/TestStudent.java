package com.capg.junit;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

class TestStudent {

	
	 @InjectMocks
	 Test1 test1;
	 
	 
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	void test() {
		test1.getStudents();
	}

}
