package ru.siebel.spring.springwork;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.siebel.spring.springwork.service.CommonService;
import ru.siebel.spring.springwork.service.ConditionalService;
import ru.siebel.spring.springwork.service.FirstWorkService;

@SpringBootTest(
		/*classes = {
				FirstWorkService.class,
				CommonService.class,
				ConditionalService.class
		}*/)
@ActiveProfiles("test")
class SpringWorkApplicationTests {

	@Autowired
	private FirstWorkService firstWorkService;

	@Test
	void contextLoads() {
		String execute = firstWorkService.execute();
		System.out.println(execute);
	}

}
