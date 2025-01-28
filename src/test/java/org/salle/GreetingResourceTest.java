package org.salle;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void testHelloEndpoint() {
        GreetingResource greetingResource = new GreetingResource();
        String response = greetingResource.hello();
        Assertions.assertThat(response).isEqualTo("Hello MDAS Class!");
    }

}