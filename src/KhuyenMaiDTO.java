/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package javaproject;

/**
 *
 * @author hp
 */
public class KhuyenMaiDTO {
    private String maKM;
    private String tenCTrinhKM;
    private String ngayBD;
    private String ngayKT;
    
    public KhuyenMaiDTO(){
        
    }
    
    public String getMaKM(){
        return maKM;
    }
    
    public void setMaKH(String maKM){
        this.maKM = maKM;
    }
    
    public String getTenCTrinhKM(){
        return tenCTrinhKM;
    }
    
    public void setTenCTrinhKM(String tenCTrinhKM){
        this.tenCTrinhKM = tenCTrinhKM;
    }
    
    public String getNgayBD(){
        return ngayBD;
    }
    
    public void setNgayBD(String ngayBD){
        this.ngayBD = ngayBD;
    }
    
    public String getNgayKT(){
        return ngayKT;
    }
    
    public void setNgayKT(String ngayKT){
        this.ngayKT = ngayKT;
    }
    
}
