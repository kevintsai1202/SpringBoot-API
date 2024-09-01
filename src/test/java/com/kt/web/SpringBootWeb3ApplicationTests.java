package com.kt.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.kt.web.entity.Alert;
import com.kt.web.repository.AlertRepository;

@SpringBootTest
class SpringBootWeb3ApplicationTests {

	@Autowired
	AlertRepository alertRepository;
	
	@Test
	void contextLoads1() {
		
		Alert test = Alert.builder()
				.AlertMessage("錯誤訊息")
				.AlertName("Alert Name")
				.Service("Service1")
				.Site("TW")
				.AlertSentTime(Instant.now())
				.build();
		alertRepository.save(test);
	}


	@Test
	void contextLoads2() {
		assertEquals(alertRepository.count(), 1);
		System.out.println(alertRepository.findAll());
	}
}
