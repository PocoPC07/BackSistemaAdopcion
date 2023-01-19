package com.sistema.adopcion.service;

import com.sistema.adopcion.models.Mascota;
import com.sistema.adopcion.repository.MascotasRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImpl extends GenericServiceImpl<Mascota, Integer> implements MascotaService {

    @Autowired
    MascotasRespository mascotasRespository;

    @Override
    public CrudRepository<Mascota, Integer> getDao() {
        return mascotasRespository;
    }

}