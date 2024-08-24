/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt1;

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;

public class chuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double rong = scanner.nextDouble();

       
        System.out.print("Nhap canh hinh vuong: ");
        double canh = scanner.nextDouble();

      
        ChuNhat cn = new ChuNhat(dai, rong);
        ChuNhat vu = new Vuong(canh);

       
        cn.xuat();
        vu.xuat();
    }
}
