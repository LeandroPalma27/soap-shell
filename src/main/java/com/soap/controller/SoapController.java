package com.soap.controller;

import com.soap.client.SoapClient;
import com.soap.wsdl.ConsultarDniMayorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class SoapController {

    @Autowired
    SoapClient soapClient;
    
    @GetMapping("/ws_reniec/{dni}")
    public ResponseEntity<ConsultarDniMayorResponse> Reniec(@PathVariable(name = "dni") String dni) {
        ConsultarDniMayorResponse response = soapClient.getConsultaDniMayorResponse(new HashMap<String, String>() {{
            put("clienteUsuario", "DIRSAPOL");
            put("clienteClave", "WUK9XPhx");
            put("servicioCodigo", "WS_RENIEC_MAY_MEN");
            put("clienteSistema", "SOAP_DESARROLLO");
            put("clienteIp", "172.31.2.249");
            put("clienteMac", "AA:BB:CC:DD:EE:FF");
            put("dniAutorizado", "46142906");
            put("tipoDocUserClieFin", "1");
            put("nroDocUserClieFin", "391402");
            put("inDni", dni);
            put("inPioridad", "priority");
        }});
        return ResponseEntity.ok().body(response);
    }
}
