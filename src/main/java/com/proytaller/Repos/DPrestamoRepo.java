package com.proytaller.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proytaller.Model.DPrestamo;
import com.proytaller.Model.DPrestamoPK;

public interface DPrestamoRepo extends JpaRepository<DPrestamo, DPrestamoPK> {

}
