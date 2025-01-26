package org.salle.hello_world.api.api.hello;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.salle.hello_world.api.hello.HelloWorld;

class HelloWorldTest {

    @Test
    void shouldReturnHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertThat(helloWorld.hello().getBody()).isEqualTo("Hello World!");
    }

}
