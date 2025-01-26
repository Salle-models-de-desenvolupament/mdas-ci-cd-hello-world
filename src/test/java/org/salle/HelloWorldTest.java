package org.salle;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author: Iván Jimeno <ivan.jimeno@seniordomo.es>
 * Date: 26/01/2025
 * Time: 12:33
 */
public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String hello = helloWorld.hello();

        Assertions.assertThat(hello).isEqualTo("Hello World");
    }
}
