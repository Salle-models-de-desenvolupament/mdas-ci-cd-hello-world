package org.salle.hello_world;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloWorldIntTest {
	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();

	@Test
	public void helloEndpoint() {
		HttpEntity<String> entity = new HttpEntity<>(null, headers);

		String url = "http://localhost:" + port + "/hello";

		ResponseEntity<String> response = restTemplate.exchange(
				url,
				HttpMethod.GET, entity, String.class);

		String expected = "Hello World!";
		String actual = response.getBody();

		assertEquals(actual, expected);
	}

}