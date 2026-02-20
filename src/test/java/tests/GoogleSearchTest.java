package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    void devePesquisarNoGoogle() {
        driver.get("https://www.google.com");
    }
}
