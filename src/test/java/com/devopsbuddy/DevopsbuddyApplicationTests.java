package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners
public class DevopsbuddyApplicationTests {
	TestContextManager testContextManager;

	public DevopsbuddyApplicationTests() {
		try {
			this.testContextManager = new TestContextManager(getClass());
			this.testContextManager.prepareTestInstance(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Autowired
	I18NService i18NService;

	@Test
	public void testMessageByLocaleSrevice() throws Exception{

		String expectedRes = "RXBootstrap starter templateX";
		String messageID="index.main.callout";
		//String actual = i18NService==null?"NULL":"NOTNULL";  ///.getMessage(messageID);
		//Assert.assertEquals("NO MATCH FOUND",expectedRes,actual);

	}

}
