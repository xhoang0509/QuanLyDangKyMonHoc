/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author XuanHoang
 */
public class NhomMon {

    private int id;
    private String name;

    public NhomMon(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "NhomHoc{" + "id=" + id + ", name=" + name + '}';
    }

    
}
