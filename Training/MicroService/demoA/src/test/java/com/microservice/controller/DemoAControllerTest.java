package com.microservice.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.microservice.entity.HogeATest;

class DemoAControllerTest {

	@Test
	void testGetSentence1() {
		DemoAController con = new DemoAController();
		HogeATest result = con.getSentence();
		assertEquals("テスト2",result.getInfo());
	}

}
