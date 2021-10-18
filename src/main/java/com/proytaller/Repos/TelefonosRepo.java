package com.proytaller.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proytaller.Model.Telefonos;
import com.proytaller.Model.TelefonosPK;

public interface TelefonosRepo extends JpaRepository<Telefonos, TelefonosPK> {

}
