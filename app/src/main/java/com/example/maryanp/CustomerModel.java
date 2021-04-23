package com.example.maryanp;

public class CustomerModel {
    //_________________________________________________________________________________________

    private int id;
    private int nik;
    private String name;
    private String jabatan;
    private String departemen;
    private String jk;
    private int tgl_lahir;
    private String t_lahir;
    private String alamat;


    //_______________________end________________________________________________________________
    //konstruksi pada program,dibuat untuk memangil setiap objek atau variabel yang telah
    //dibuat sedemikian rupa
    //__________________________________________________________________________________________
    public CustomerModel(int id, int nik, String name, String jabatan, String departemen, String jk, int tgl_lahir, String t_lahir, String alamat) {
        this.id = id;
        this.nik = nik;
        this.name = name;
        this.jabatan = jabatan;
        this.departemen = departemen;
        this.jk = jk;
        this.tgl_lahir = tgl_lahir;
        this.t_lahir = t_lahir;
        this.alamat = alamat;

    }
    //__________________________________________________________________________________________
    //digunakan sebagai mencetak variabel objek untuk kelas yang akan digunakan
    //__________________________________________________________________________________________

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id='" + id + '\'' +
                ", nik=" + nik +
                ", name=" + name +
                ", jabatan=" + id +
                ", departemen=" + departemen +
                ", jk=" + jk +
                ", tgl_lahir=" + tgl_lahir +
                ", t_lahir=" + t_lahir +
                ", alamat=" + alamat +
                '}';
    }

    //__________________________________________________________________________________________

}
