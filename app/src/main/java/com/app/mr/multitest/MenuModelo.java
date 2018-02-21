package com.app.mr.multitest;

import android.widget.ImageView;

/**
 * Created by r.contreras on 21/02/2018.
 */

public class MenuModelo {
    private String encuesta, registro, reporte;
    private int imgMenu;

    public MenuModelo() {
    }

    public MenuModelo(String encuesta, int imgMenu) {
        this.encuesta = encuesta;
    //    this.registro = registro;
      //  this.reporte = reporte;
        this.imgMenu = imgMenu;
    }

    public String getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(String encuesta) {
        this.encuesta = encuesta;
    }

/*    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    } */

    public int getImgMenu() {
        return imgMenu;
    }

    public void setImgMenu(int imgMenu) {
        this.imgMenu = imgMenu;
    }
}
