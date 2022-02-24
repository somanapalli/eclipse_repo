package com.capg.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFoo {

	private Foo foo;
	 
	@BeforeEach
	void setupMock() {
		
		foo = mock(Foo.class);
		
		when(foo.greet()).thenReturn("HelloWorld");
		
	}
	
	@Test
	public void fooGreets()
	{
		assertEquals("HelloWorld",foo.greet());
	}
	
	@Test
	public void barGreets()
	{
		Bar bar = new Bar();
		assertEquals("HelloWorld",bar.greet(foo));
	}

}
