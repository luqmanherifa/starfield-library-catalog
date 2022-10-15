package com.luqman.uas.katalogstarfieldbuku;

public class BukuData {

    private String Judul;
    private String Kategori;
    private String Deskripsi;
    private int Cover, QRCode;

    public BukuData(String judul, String kategori, String deskripsi, int cover, int qrcode) {
        Judul = judul;
        Kategori = kategori;
        Deskripsi = deskripsi;
        Cover = cover;
        QRCode = qrcode;
    }

    //getter
    public String getJudul() {
        return Judul;
    }

    public String getKategori() {
        return Kategori;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public int getCover() {
        return Cover;
    }

    public int getQRCode() {
        return QRCode;
    }

    //setter
    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setCover(int cover) {
        Cover = cover;
    }

    public void setQRCode(int qrcode) {
        QRCode = qrcode;
    }
}