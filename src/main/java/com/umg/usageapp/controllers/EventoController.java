package com.umg.usageapp.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umg.usageapp.models.Accion;
import com.umg.usageapp.models.Aplicacion;
import com.umg.usageapp.models.CatalogoPuestos;
import com.umg.usageapp.models.Empresa;
import com.umg.usageapp.models.Evento;
import com.umg.usageapp.models.User;
import com.umg.usageapp.repositories.AccionRepository;
import com.umg.usageapp.repositories.AplicacionRepository;
import com.umg.usageapp.repositories.EmpresaRepository;
import com.umg.usageapp.repositories.EventoRepository;
import com.umg.usageapp.services.EmpresaService;

@RestController
@RequestMapping(value = "/evento")
public class EventoController {
	
	@Autowired
	EventoRepository eventoRepository;
	@Autowired
	EmpresaService empresaService;
	@Autowired
	AplicacionRepository aplicacionRepository;
	@Autowired
	AccionRepository accionRepository;
	@Autowired
	EmpresaRepository  empresaRepository;
	
	
	
	
    @PostMapping(value = "/registro")
    public ResponseEntity<?> perfil(@RequestBody EventoCreator eventoCreator){

    	String result = null;
    	
    	
    	try {
    		
    		Evento evento = new Evento();
        	Empresa empresa = empresaService.getEmpresaById(eventoCreator.idEmpresa);
            int diferencia=(int) ((eventoCreator.fechaInicio.getTime()-eventoCreator.fechaFin.getTime())/1000);
            int horas=(int)Math.floor(diferencia/3600);
            evento.setDuracion(horas+"");
            evento.setEmpresa(empresa);
            evento.setFechaFin(eventoCreator.fechaInicio);
            evento.setFechaInicio(eventoCreator.fechaFin);
            evento.setNombre(eventoCreator.nombre);
            eventoRepository.save(evento);
            
            
            
            for ( Integer accion :eventoCreator.acciones) {
            	
            }
            
            for ( Integer aplicacion :eventoCreator.aplicaciones) {
            	
            }
            
            for ( Integer usuario :eventoCreator.usuarios) {
            	
            	
            	
            }
            
            
            
            
            
            result = "SUCCESS";
			
		} catch (Exception e) {
			System.out.println("error en ala creacion del evento"+e);
            result = "ERROR";
		}

		return ResponseEntity.accepted().body(result);

    }

    
    
    @PostMapping(value = "/getAplicaciones")
    public List<Aplicacion> getAplicaciones (){
		return aplicacionRepository.findAll();

    }
    
    
    @PostMapping(value = "/getAcciones")
    public List<Accion> getAcciones (){
		return accionRepository.findAll();

    }
    
    
    
    @PostMapping(value = "/createAccion")
    @PreAuthorize("permitAll")
    public String createAccion(@RequestBody Accion accion){
    	String response = null;
    	
    	try {
			accionRepository.save(accion);
			response = "SUCCESS";
		} catch (Exception e) {
			response = "FAIL";
		}
		return response ;    	
    }
    
    @PostMapping(value = "/createAplicacion")
    @PreAuthorize("permitAll")
    public String createAplicacion(@RequestBody Aplicacion aplicacion){
    	String response = null;
    	
    	try {
    		aplicacionRepository.save(aplicacion);
    		response = "SUCCESS";
		} catch (Exception e) {
			response = "FAIL";
		}
		return response ;    	
    }
    
    
    @PostMapping(value = "/getEmpleadosByEMpresa")
    @PreAuthorize("permitAll")
    public List<User> getEmpleadosByEMpresa(@RequestParam Integer idEmpresa){
		return empresaRepository.getUserByIdEmpresa(idEmpresa) ;    	
    }

    
    static class EventoCreator {
        public String nombre ;
        public Date fechaInicio;
        public Date fechaFin;
        public Integer idEmpresa;
        public List<Integer> usuarios;
        public List<Integer> aplicaciones;
        public List<Integer> acciones;     
    }
    
    
    static class AplicacionCreate {
        public String nombre ;
        public Date fechaInAcio;
        public Date fechaFin;
        public Integer idEmpresa;
    }
    
    static class AccionCreate {
        public String nombre ;
        public Date fechaInAcio;
        public Date fechaFin;
        public Integer idEmpresa;
    }
    
    
}
