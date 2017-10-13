package com.pablourbano.atletasrestatapi.service;

import com.pablourbano.atletasrestatapi.domain.Medalla;
import com.pablourbano.atletasrestatapi.repository.AtletaRepository;
import com.pablourbano.atletasrestatapi.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedallaService {
    @Autowired
            private MedallaRepository medallaRepository;
    @Autowired
            private AtletaRepository atletaRepository;


    public void testMedalla(){

    Medalla MedallaOroBalonmano = new Medalla("Oro","Balonmano","Mundial");
    medallaRepository.save(MedallaOroBalonmano);
    Medalla MedallaPlataBalonmano = new Medalla("Plata","Balonmano", "Mundial");
    medallaRepository.save(MedallaPlataBalonmano);
    Medalla MedallaBronceBalonmano = new Medalla("Bronce", "Balonmano", "Mundial");
    medallaRepository.save(MedallaBronceBalonmano);

    Medalla MedallaOroFutbol = new Medalla("Oro", "Futbol", "Mundial");
    medallaRepository.save(MedallaOroFutbol);
    Medalla MedallaPlataFutbol = new Medalla("Plata","Futbol", "Mundial");
    medallaRepository.save(MedallaPlataFutbol);
    Medalla MedallaBronceFutbol = new Medalla("Bronce", "Futbol", "Mundial");
    medallaRepository.save(MedallaBronceFutbol);

    Medalla MedallaOroBasket = new Medalla("Oro", "Basket", "Mundial");
    medallaRepository.save(MedallaOroBasket);
    Medalla MedallaPlataBasket = new Medalla("Plata","Basket", "Mundial");
    medallaRepository.save(MedallaPlataBasket);
    Medalla MedallaBronceBasket = new Medalla("Bronce", "Basket", "Mundial");
    medallaRepository.save(MedallaBronceBasket);
    }
}
