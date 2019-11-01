package com.karumien.client.adochazka.service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.karumien.client.adochazka.schemas.CustomerDataDen;
import com.karumien.client.adochazka.schemas.Dochazka;
import com.karumien.client.adochazka.schemas.Pristup;
import com.karumien.client.adochazka.schemas.Pritomnost;
import com.karumien.client.adochazka.schemas.Uzivatel;

public interface ADochazkaService {

    List<Pritomnost> getActualWorkers();

    List<Uzivatel> getWorkers();

    List<Pristup> getAccesses(OffsetDateTime from);
    
    List<Dochazka> getWorks(OffsetDateTime from);
    
    boolean generate();

    Map<String, Uzivatel> getWorkersMap();

    List<CustomerDataDen> getWorkMonth(Integer year, Integer month, Integer userId);
    
    default XMLGregorianCalendar toXMLGregorianCalendar(OffsetDateTime from) {
        
        GregorianCalendar gcal = GregorianCalendar.from(from.toLocalDate().atStartOfDay(ZoneId.systemDefault()));
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    default OffsetDateTime toOffsetDateTime(XMLGregorianCalendar xmlCalendar) {
        if (xmlCalendar == null) {
            return null;
        }
        
        LocalDateTime local = xmlCalendar.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
        return local.atOffset(OffsetDateTime.now().getOffset());
    }

    Map<Integer, CustomerDataDen> getWorkMonthMap(Integer year, Integer month, Integer userId);
    
}
