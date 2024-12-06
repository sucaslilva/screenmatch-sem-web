package br.com.sucaslilva.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public <T> T obterDados(String json, Class<T> classe) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		return mapper.readValue(json, classe);
	}
	
}


