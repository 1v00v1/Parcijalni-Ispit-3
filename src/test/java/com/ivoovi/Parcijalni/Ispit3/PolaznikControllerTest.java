package com.ivoovi.Parcijalni.Ispit3;

import com.ivoovi.Parcijalni.Ispit3.DTO.PolaznikDTO;
import com.ivoovi.Parcijalni.Ispit3.controller.PolaznikController;
import com.ivoovi.Parcijalni.Ispit3.service.PolaznikSevices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class PolaznikControllerTest {

    @Mock
    private PolaznikSevices polaznikSevices;

    @InjectMocks
    private PolaznikController polaznikController;

    private List<PolaznikDTO> polaznici;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(polaznikController).build();
        PolaznikDTO p1 = new PolaznikDTO("John", "Doe");
        PolaznikDTO p2 = new PolaznikDTO("Jane", "Smith");
        polaznici = List.of(p1, p2);
    }

    @Test
    void testGetAllPolaznici() throws Exception {
        when(polaznikSevices.getAllPolaznici()).thenReturn(polaznici);

        // Perform GET request and verify the response
        mockMvc.perform(get("/polaznik")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].ime", is("John")))
                .andExpect(jsonPath("$[1].ime", is("Jane")))
                .andExpect(jsonPath("$[0].prezime", is("Doe")))
                .andExpect(jsonPath("$[1].prezime", is("Smith")));

        // Verify that the service method was called once
        verify(polaznikSevices, times(1)).getAllPolaznici();
    }
    @Test
    void testGetPolaznikByID() throws Exception {
        PolaznikDTO polaznik = new PolaznikDTO("John", "Doe");
        when(polaznikSevices.getPolaznikByID(1L)).thenReturn(polaznik);

        mockMvc.perform(get("/polaznik/1")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.ime", is("John")))
            .andExpect(jsonPath("$.prezime", is("Doe")));

        verify(polaznikSevices, times(1)).getPolaznikByID(1L);
    }
}