/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gs.Repository;

import com.portfolio.gs.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RProyecto extends JpaRepository<Proyecto, Integer> {
    public Optional<Proyecto> findByNombreP(String nombreE);
    public boolean existsByNombreP(String nombreE);
}