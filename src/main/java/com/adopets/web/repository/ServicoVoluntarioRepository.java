/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.repository;

import com.adopets.web.model.ServicoVoluntario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author daniela
 */
@Repository
public interface ServicoVoluntarioRepository extends JpaRepository<ServicoVoluntario, Long> {
}
