package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Getter
@Setter
@Slf4j
public class RegistroRecargaController {

    public String API_MESSAGE="BIENVENIDO A LA INTERFACE DE ${EMPRESAR}";

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<String>(API_MESSAGE, HttpStatus.OK);
    }

    @PostMapping(value = { "/" },produces = {MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> registrarEvento(@RequestBody Map<String, Object> request) {
        ResponseEntity<String> respuesta = new ResponseEntity<>("", null, HttpStatus.OK);
        log.info("RegistrarEvento");
        try{
            for ( Map.Entry entry:  request.entrySet()){
                log.info(entry.getKey() + "=> " +entry.getValue());
            }
            //Registrar el evento
            if(request.containsKey("idTransaccion")){
                log.info("Se ha localizado la transacción: " + request.get("idTransaccion"));
            }

            respuesta = new ResponseEntity<>("", null, HttpStatus.OK);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return respuesta;
    }

}
