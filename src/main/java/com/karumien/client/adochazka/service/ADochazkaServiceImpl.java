/*
 * Copyright (c) 2019-2029 Karumien s.r.o.
 *
 * Karumien s.r.o. is not responsible for defects arising from 
 * unauthorized changes to the source code.
 */
package com.karumien.client.adochazka.service;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.karumien.client.adochazka.SOAPConnector;
import com.karumien.client.adochazka.schemas.Dochazka;
import com.karumien.client.adochazka.schemas.ObjectFactory;
import com.karumien.client.adochazka.schemas.Pristup;
import com.karumien.client.adochazka.schemas.Pritomnost;
import com.karumien.client.adochazka.schemas.Uzivatel;
import com.karumien.client.adochazka.schemas.VratDochazku;
import com.karumien.client.adochazka.schemas.VratDochazkuResponse;
import com.karumien.client.adochazka.schemas.VratPristupy;
import com.karumien.client.adochazka.schemas.VratPristupyResponse;
import com.karumien.client.adochazka.schemas.VratPritomnost;
import com.karumien.client.adochazka.schemas.VratPritomnostResponse;
import com.karumien.client.adochazka.schemas.VratUzivatele;
import com.karumien.client.adochazka.schemas.VratUzivateleResponse;
import com.karumien.client.adochazka.schemas.Vygeneruj;
import com.karumien.client.adochazka.schemas.VygenerujResponse;

/**
 *
 * @author <a href="miroslav.svoboda@karumien.com">Miroslav Svoboda</a>
 * @since 1.0, 2. 10. 2019 14:44:16 
 */
@Service
public class ADochazkaServiceImpl implements ADochazkaService {

    @Autowired
    private SOAPConnector connector;
    
    @Value("${auth.id}")
    private String id;

    @Value("${auth.pwd}")
    private String pwd;
        
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Pritomnost> getActualWorkers() {

        VratPritomnost request = new VratPritomnost();

        ObjectFactory factory = new ObjectFactory();
        request.setID(factory.createVratPritomnostID(id));
        request.setHeslo(factory.createVratPritomnostHeslo(pwd));
        
        VratPritomnostResponse response = (VratPritomnostResponse) connector.getWebServiceTemplate().marshalSendAndReceive(request,
          new SoapActionCallback("http://schemas.holypos.com/holyattendance/ICustomerService/VratPritomnost"));

        return response.getVratPritomnostResult().isNil() || response.getVratPritomnostResult().getValue().getPritomnost().isNil() 
           || response.getVratPritomnostResult().getValue().getPritomnost().getValue().getPritomnost().isEmpty() ? 
               Collections.emptyList() : response.getVratPritomnostResult().getValue().getPritomnost().getValue().getPritomnost();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Uzivatel> getWorkers() {
        
        VratUzivatele request = new VratUzivatele();
        
        ObjectFactory factory = new ObjectFactory();
        request.setID(factory.createVratUzivateleID(id));
        request.setHeslo(factory.createVratUzivateleHeslo(pwd));
        
        VratUzivateleResponse response = (VratUzivateleResponse) connector.getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback("http://schemas.holypos.com/holyattendance/ICustomerService/VratUzivatele"));
        
        return response.getVratUzivateleResult().isNil() || response.getVratUzivateleResult().getValue().getUzivatele().isNil() 
                || response.getVratUzivateleResult().getValue().getUzivatele().getValue().getUzivatel().isEmpty() ? 
                    Collections.emptyList() : response.getVratUzivateleResult().getValue().getUzivatele().getValue().getUzivatel();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public List<Pristup> getAccesses(OffsetDateTime from) {
    
        VratPristupy request = new VratPristupy();
        
        ObjectFactory factory = new ObjectFactory();
        request.setID(factory.createVratPristupyID(id));
        request.setHeslo(factory.createVratPristupyHeslo(pwd));
        request.setDatumOd(toXMLGregorianCalendar(from));
        
        VratPristupyResponse response = (VratPristupyResponse) connector.getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback("http://schemas.holypos.com/holyattendance/ICustomerService/VratPristupy"));
        
        return response.getVratPristupyResult().isNil() || response.getVratPristupyResult().getValue().getPristupy().isNil() 
                || response.getVratPristupyResult().getValue().getPristupy().getValue().getPristup().isEmpty() ? 
                    Collections.emptyList() : response.getVratPristupyResult().getValue().getPristupy().getValue().getPristup();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean generate() {

        Vygeneruj request = new Vygeneruj();
        
        ObjectFactory factory = new ObjectFactory();
        request.setID(factory.createVygenerujID(id));
        request.setHeslo(factory.createVygenerujHeslo(pwd));
        
        VygenerujResponse response = (VygenerujResponse) connector.getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback("http://schemas.holypos.com/holyattendance/ICustomerService/Vygeneruj"));
        
        return response.isVygenerujResult().booleanValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Dochazka> getWorks(OffsetDateTime from) {
        
        VratDochazku request = new VratDochazku();
        
        ObjectFactory factory = new ObjectFactory();
        request.setID(factory.createVratDochazkuID(id));
        request.setHeslo(factory.createVratDochazkuHeslo(pwd));
        request.setDatumOd(toXMLGregorianCalendar(from));
        
        VratDochazkuResponse response = (VratDochazkuResponse) connector.getWebServiceTemplate().marshalSendAndReceive(request,
                new SoapActionCallback("http://schemas.holypos.com/holyattendance/ICustomerService/VratDochazku"));
        
        return response.getVratDochazkuResult().isNil() || response.getVratDochazkuResult().getValue().getDochazka().isNil() 
                || response.getVratDochazkuResult().getValue().getDochazka().getValue().getDochazka().isEmpty() ? 
                    Collections.emptyList() : response.getVratDochazkuResult().getValue().getDochazka().getValue().getDochazka();
    }

    private static XMLGregorianCalendar toXMLGregorianCalendar(OffsetDateTime from) {
        
        GregorianCalendar gcal = GregorianCalendar.from(from.toLocalDate().atStartOfDay(ZoneId.systemDefault()));
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    @Override
    @Cacheable(value = "users")
    public Map<String, Uzivatel> getWorkersMap() {
        return getWorkers().stream()
                .collect(
                    HashMap<String, Uzivatel>::new, 
                    (m, c) -> m.put(c.getCislo().getValue(), c),
                    (m, u) -> {});
    }

}