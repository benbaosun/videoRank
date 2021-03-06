package com.touhou.video.rank.service;

import com.touhou.video.rank.StartApplication;
import com.touhou.video.rank.entity.Type;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class TypeServiceTest {

	@Autowired
	private TypeService typeService;

	@Test
	public void listByFatherType() {
		Type all = typeService.ALL();
		List<Type> list = typeService.listByFatherType(all);
		Assert.assertTrue(!list.isEmpty());
		log.info(list.toString());
	}

	@Test
	public void getFirstType() {
		Type firstType = typeService.ALL();
		System.out.println(firstType);
	}

}