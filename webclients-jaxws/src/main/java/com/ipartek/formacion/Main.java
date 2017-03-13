package com.ipartek.formacion;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.pelicula.Pelicula;
import com.ipartek.pelicula.PeliculaMensaje;
import com.ipartek.pelicula.PeliculaServiceWSImp;
import com.ipartek.pelicula.Peliculasservice;

public class Main {

	public static void main(String[] args) {
		Peliculasservice cliente = new Peliculasservice();
		PeliculaServiceWSImp clientesoap = cliente.getPeliculaServiceWSImpPort();
		
		Map<String, Object> requestContext = ((BindingProvider)clientesoap).getRequestContext();
		
		Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();
		requestHeaders.put("sessionId", Collections.singletonList("ipsession"));
		
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
		
		PeliculaMensaje respuesta = clientesoap.obtenerporid(1);
		Pelicula pelicula = respuesta.getPelicula();
		System.out.println(pelicula.getTitulo());
		
	}

}
