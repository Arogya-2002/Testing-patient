package com.testing;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import Entity.PatientRecord;
import Exception.NotFoundException;
import controller.PatientRecordController;
import repository.PatientRecordRepository;

@RunWith(MockitoJUnitRunner.class)
public class PatientRecordControllerTest{
	
	private MockMvc mockMvc;
	
	ObjectMapper objectMapper = new ObjectMapper();
	ObjectWriter objectwriter = objectMapper.writer();
	
	
	@Mock
	private PatientRecordRepository patientRecordRepository;
	
	@InjectMocks
	private PatientRecordController patientRecordController;
	
	PatientRecord RECORD_1 = new PatientRecord(1L, "Rayven Yor", 23, "Cebu Philippines");
    PatientRecord RECORD_2 = new PatientRecord(2L, "David Landup", 27, "New York USA");
    PatientRecord RECORD_3 = new PatientRecord(3L, "Jane Doe", 31, "New York USA");
	
    @SuppressWarnings("deprecation")
	@Before
    public void setUp() {
    	MockitoAnnotations.initMocks(this);
    	this.mockMvc = MockMvcBuilders.standaloneSetup(patientRecordController).build();
    }
    
    @Test
    public void getAllRecords_success() throws Exception{
    	List<PatientRecord> records =  new ArrayList<PatientRecord>(Arrays.asList(RECORD_1,RECORD_2,RECORD_3));
    Mockito.when(patientRecordRepository.findAll()).thenReturn(records);
   
    
    
    mockMvc.perform(MockMvcRequestBuilders)
    .get("/patient")
    .contentType(MediaType.APPLICATION_JSON)
	.andExpect(status.isOk))
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}