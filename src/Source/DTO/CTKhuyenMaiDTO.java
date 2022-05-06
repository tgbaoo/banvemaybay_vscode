package Source.DTO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package javaproject;

/**
 *
 * @author hp
 */
public class CTKhuyenMaiDTO {
    private String maKM;
    private String maLoaiVe;
    private double phanTramKM;

    public CTKhuyenMaiDTO() {

    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKH(String maKM) {
        this.maKM = maKM;
    }

    public String getMaLoaiVe() {
        return maLoaiVe;
    }

    public void setMaLoaiVe(String maLoaiVe) {
        this.maLoaiVe = maLoaiVe;
    }

    public double getPhanTramKM() {
        return phanTramKM;
    }

    public void setPhanTramKM(double phanTramKM) {
        this.phanTramKM = phanTramKM;
    }

}
