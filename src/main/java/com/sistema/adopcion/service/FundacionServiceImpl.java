package com.sistema.adopcion.service;

import com.sistema.adopcion.models.Fundacion;
import com.sistema.adopcion.repository.FundacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class FundacionServiceImpl extends GenericServiceImpl<Fundacion, Integer> implements FundacionService {

    @Autowired
    FundacionRepository fundacionRepository;

    @Override
    public CrudRepository<Fundacion, Integer> getDao() {
        return fundacionRepository;
    }
}