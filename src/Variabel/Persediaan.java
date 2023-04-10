/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Variabel;

/**
 *
 * @author Bagus_Anggriawan
 */
public class Persediaan {

    //buat variabel persediaan yang nantinya menjadi nilai masukan
    public static double persediaan;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=100;
    private static double titik3=600;
    
    //buat method untuk mengakses nilai pada variabel persediaan
    public static double getPersediaan() 
    {
        return persediaan;
    }
    //buat method untuk memberikan nilai pada variabel persediaan
    public static void setPersediaan(double persediaan) 
    {
        Persediaan.persediaan = persediaan;
    }
    
    //method fungsi sedikit
    public static double sedikit()
    {
        if (persediaan>=titik1 && persediaan<=titik2) 
            return 1;
        else if (persediaan>titik2 && persediaan<titik3) 
            return (titik3-persediaan)/(titik3-titik2);
        else 
            return 0;
    }
    
    //method fungsi banyak
    public static double banyak()
    {
        if (persediaan>titik2 && persediaan<titik3) 
            return (persediaan-titik2)/(titik3-titik2);
        else if (persediaan>=titik3) 
            return 1;
        else 
            return 0;
    }
}
