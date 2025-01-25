package org.salle.hello_world.api.api.hello;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.salle.hello_world.api.hello.HelloWorld;

public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertThat(helloWorld.hello()).isEqualTo("Hello World!");
    }

}
