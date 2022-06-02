/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Doan Cuong
 */
public class SinhVien {
    private int idSV;
    private String codeSV;
    private String hoTen;
    private String nien_Khoa;
    private String pass;
    private int id_Khoa;

    public SinhVien(int idSV, String codeSV, String hoTen, String nien_Khoa, String pass, int id_Khoa) {
        this.idSV = idSV;
        this.codeSV = codeSV;
        this.hoTen = hoTen;
        this.nien_Khoa = nien_Khoa;
        this.pass = pass;
        this.id_Khoa = id_Khoa;
    }

    public SinhVien() {
    }

    public int getIdSV() {
        return idSV;
    }

    public void setIdSV(int idSV) {
        this.idSV = idSV;
    }

    public String getCodeSV() {
        return codeSV;
    }

    public void setCodeSV(String codeSV) {
        this.codeSV = codeSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNien_Khoa() {
        return nien_Khoa;
    }

    public void setNien_Khoa(String nien_Khoa) {
        this.nien_Khoa = nien_Khoa;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId_Khoa() {
        return id_Khoa;
    }

    public void setId_Khoa(int id_Khoa) {
        this.id_Khoa = id_Khoa;
    }
    
}
