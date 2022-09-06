package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class ExampleTest {

	Example example = null;
	Demo demo = Mockito.mock(Demo.class);

	@BeforeEach
	public void create() {
		example = new Example(demo);
	}

	@Test
	public void testAdd() {
		when(demo.add(10, 20)).thenReturn(30);
		assertEquals(30, example.adding(10, 20));
	}
}
