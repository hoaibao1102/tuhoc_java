/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap37;

/**
 *
 * @author MSI PC
 */
public class Lop {
    private String tenLop , tenKhoa;

    public Lop() {
    }

    public Lop(String tenLop, String tenKhoa) {
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    
    
}
