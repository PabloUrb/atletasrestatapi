package com.pablourbano.atletasrestatapi.service;

import com.pablourbano.atletasrestatapi.domain.Atleta;
import com.pablourbano.atletasrestatapi.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AtletaService {
    @Autowired
    private AtletaRepository atletaRepository;

    public void testAtleta(){
        Atleta Abaran = new Atleta("Abaran", "Albaran", "Griego", LocalDate.of(1998,12,12));
        atletaRepository.save(Abaran);
        Atleta Torres = new Atleta("Cristian", "Torres", "Español", LocalDate.of(1788,5,12));
        atletaRepository.save(Torres);
        Atleta Lorqui = new Atleta("Loqui","Loqui","Español",LocalDate.of(1988,5,31));
        atletaRepository.save(Lorqui);



    }
}
