package xcs.config.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XcsConfigServiceApplication.class)
@ActiveProfiles({"dev"})
public class XcsConfigServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

}
