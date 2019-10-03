package com.karumien.client.adochazka.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

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
    
}
