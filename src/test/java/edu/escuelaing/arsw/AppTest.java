package edu.escuelaing.arsw;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.escuelaing.arsw.controller.HomeController;

@SpringBootTest
public class AppTest {

    @Autowired
	private HomeController controller;
    
    @Test
    public void contextLoads(){
        assertThat(controller).isNotNull();
    }
}
