package com.proytaller.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proytaller.Model.Escriben;
import com.proytaller.Model.EscribenPK;

public interface EscribenRepo extends JpaRepository<Escriben, EscribenPK> {

}
