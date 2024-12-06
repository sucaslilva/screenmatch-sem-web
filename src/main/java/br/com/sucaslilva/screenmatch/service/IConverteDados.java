package br.com.sucaslilva.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface IConverteDados {
	<T> T obterDados(String json, Class<T> classe) throws JsonMappingException, JsonProcessingException;
}
