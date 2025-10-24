/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itess.domain;

import tics.itess.domain.Alumno;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;




public class AlumnoTest {
    static Alumno alumno;
    
    
    @BeforeAll
    static void setupAll() {
        alumno = new Alumno ("JJ PP", "elnoviene", "secreta", "CE25101010");
    }
    
    @Test
    void testConstructorGetters() {
        assertAll("alumno", 
                () -> assertEquals("JJ PP", alumno.getNombre()),
                () -> assertEquals("elnoviene", alumno.getNdu()),
                () -> assertEquals("secreta", alumno.getClave()),
                () -> assertEquals("CE25101010", alumno.getNdc()) 
        );
    }
    
}
