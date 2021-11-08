package testPackageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testPackage.App;

public class AppTests {
    @Test
    void helloWorldTest() {
        Assertions.assertEquals("Hello World!", App.helloWorld());
    }

    @Test
    void testHelloName() {
        String testName = "Johan";
        Assertions.assertEquals("Hello Johan", App.helloName(testName));
    }

    @Test
    void testDisplayingAge() {
        String testAge = "31";
        Assertions.assertEquals("You are 31 years old", App.yourAge(testAge));
    }

    @Test
    void testCI() {
        Assertions.assertEquals(true,true);
    }
}
