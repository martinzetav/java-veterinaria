package com.mycompany.veterinaria.logica;

import com.mycompany.veterinaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombre, String raza, String color, String observaciones, String alergico, String atEspecial, String nomDuenio, String celDuenio) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelular(celDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atEspecial);
        masco.setDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
        
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int idEliminar) {
        controlPersis.borrarMascota(idEliminar);
    }

    public Mascota traerMascota(int idEditar) {
        return controlPersis.traerMascota(idEditar);
    }

    public void editarMascota(Mascota masco, String nombre, String raza, String color, String observaciones, String alergico, String atEspecial, String nomDuenio, String celDuenio) {
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atEspecial);
        
        //Modifico la mascota
        controlPersis.modificarMascota(masco);
        
        //Seteo los nuevos valores del dueño
        Duenio duenio = this.traerDuenio(masco.getDuenio().getId_duenio());
        duenio.setNombre(nomDuenio);
        duenio.setCelular(celDuenio);
        controlPersis.modificarDuenio(duenio);
    }
    
    public Duenio traerDuenio(int id_duenio){
        return controlPersis.traerDuenio(id_duenio);
    }


}
