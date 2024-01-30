package com.soap.client;

import com.soap.wsdl.*;

import java.util.Map;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    public ConsultarDniMayorResponse getConsultaDniMayorResponse(Map<String, String> parameters) {
        ConsultarDniMayor consultarDniMayor = new ConsultarDniMayor();
        consultarDniMayor.setClienteClave(parameters.get("clienteClave"));
        consultarDniMayor.setClienteIp(parameters.get("clienteIp"));
        consultarDniMayor.setClienteMac(parameters.get("clienteMac"));
        consultarDniMayor.setClienteSistema(parameters.get("clienteSistema"));
        consultarDniMayor.setClienteUsuario(parameters.get("clienteUsuario"));
        consultarDniMayor.setDniAutorizado(parameters.get("dniAutorizado"));
        consultarDniMayor.setInDni(parameters.get("inDni"));
        consultarDniMayor.setInPioridad(parameters.get("inPioridad"));
        consultarDniMayor.setNroDocUserClieFin(parameters.get("nroDocUserClieFin"));
        consultarDniMayor.setServicioCodigo(parameters.get("servicioCodigo"));
        consultarDniMayor.setTipoDocUserClieFin(parameters.get("tipoDocUserClieFin"));

        SoapActionCallback sac = new SoapActionCallback("http://servicio.reniec.sgws.pnp.gob.pe/consultarDniMayor");
        ConsultarDniMayorResponse consultarDniMayorResponse = (ConsultarDniMayorResponse) getWebServiceTemplate().marshalSendAndReceive("http://192.168.10.44:7001/ServicioReniecImpl/ServicioReniecImplService", consultarDniMayor, sac);
        return consultarDniMayorResponse;
    }
}
