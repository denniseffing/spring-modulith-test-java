package com.example.modulithtest.habits;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@ApplicationModuleTest
@AutoConfigureWebTestClient
public class HabitControllerIntegrationTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void shouldReturnHabits() {
        webTestClient.get().uri("/habits")
                     .exchange()
                     .expectStatus().isOk()
                     .expectBody(List.class)
                     .value((it) -> assertThat(it).hasSize(1));
    }
}
