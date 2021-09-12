package com.ashu.practice.it;

import com.ashu.practice.AbstractContainerBaseTest;
import org.junit.jupiter.api.Test;


class SpringTestContainerApplicationTests extends AbstractContainerBaseTest {

    @Test
    void contextLoads() {
        String url = postgreDBContainer.getJdbcUrl();
        System.out.println("JDBC URL=" + url);
        System.out.println("JDBC PORT=" + postgreDBContainer.getFirstMappedPort());
    }

}
