package com.tutorial.personnumberservice.service;

import com.tutorial.personnumberservice.entity.NumberPersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NumberPersonService {

    public double getDiscountForNumber(Integer nPersonas) {
        double descuentoGrupo = 0.0;

        if (nPersonas >= 3 && nPersonas <= 5) descuentoGrupo = 0.10;
        else if (nPersonas >= 6 && nPersonas <= 10) descuentoGrupo = 0.20;
        else if (nPersonas >= 11 && nPersonas <= 15) descuentoGrupo = 0.30;

        return descuentoGrupo;

    }
}
