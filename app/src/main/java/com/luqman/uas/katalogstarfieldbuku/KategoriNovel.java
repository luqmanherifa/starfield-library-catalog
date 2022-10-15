package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KategoriNovel extends AppCompatActivity {

    List<BukuData> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_novel);

        lstBook = new ArrayList<>();
        lstBook.add(new BukuData("Cantik Itu Luka","Eka Kurniawan | Gramedia Pustaka Utama","Di satu sore, seorang perempuan bangkit dari kuburannya setelah dua puluh satu tahun kematian." +
                "Kebangkitannya menguak kutukan dan tragedi keluarga, yang terentang sejak akhir masa kolonial. Perpaduan antara epik keluarga yang dibalut roman, kisah hantu, kekejaman politik, mitologi, dan petualangan." +
                "Dari kekasih yang lenyap ditelan kabut hingga seorang ibu yang menginginkan bayi buruk rupa.",R.drawable.buku_novel_cil,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Hidup Ini Brengsek, dan Aku Dipaksa Menikmatinya","Puthut EA | Shira Media","Kita semua pengecut. Pengecut dan membungkus kepengecutan dengan segala kata yang memualkan seperti demokrasi, aspirasi, musyawarah, kebijaksanaan, " +
                "dan lain-lain.\n\nAku juga pengecut. Sama seperti Kalian semua. Maka mari Kita sama-sama menikmati penderitaan ini. \n *** \n \n Ini karya kolaborasi antara penulis Puthut EA dan seniman jalanan Gindring Wasted yang kasar, bahkan cenderung brutal, dan gelap. Tokoh utamanya " +
                "menguliti realitas dengan cara pandangnya yang sepintas naif dan tolol. Tapi mungkin dia, si tokoh utama, adalah sisi gelap kita. Sisi yang diam-diam ingin kita tutupi, tapi tak pernah sungguh-sungguh bisa kita sembunyikan. Tanpa dinyana, kadang meletup di salah satu bilik paling " +
                "sunyi di kehidupan kita.",R.drawable.buku_novel_hib,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Merasa Pintar, Bodoh Saja Tak Punya","Rusdi Mathari | Buku Mojok","Serial Cak Dlahom mulanya dimuat di situs mojok.co selama ramadan 2015 dan 2016. Telah dibaca lebih dari enam ratus ribu kali, kini sufi ala Madura ini hadir lewat buku untuk " +
                "mengajak kita merenungkan kesombongan kita yang acap merasa lebih pintar.\n\nBuku ini menceritakan tentang kehidupan di suatu kampung bersama dengan penduduknya yang memiliki karakter yang beraneka ragam. Ada Mat Piti yang suka membantu tetangganya, Ada juga Cak Dlahom yang dianggap " +
                "kurang waras sama orang dikampungnya, Ada juga Romlah putrinya Mat Piti yang menjadi kembang di desanya, Ada juga Pak Lurah dan lainnya.\n\n+++\n\nMeskipun bukan seorang ustaz, ulama, atau pendakwah, melalui buku ini Rusdi menunjukkan kualitas dan kecerdasannya dalam mengajarkan agama. " +
                "Sebagai seorang jurnalis, Rusdi lebih mampu menunjukan kemampuan menyiarkan agama daripada beberapa orang yang mengaku sebagai pendakwah. Melalui karya ini kita bisa mengenal Rusdi nan berwawasan agama luas ketimbang pendakwah-pendakwah yang sering berkutat dengan kontroversi.\n\nMembandingkan " +
                "karya Rusdi ini dengan pendakwah-pendakwah memang bukan sesuatu yang seimbang. Karena yang dilakukan Rusdi adalah menulis cerita dan kemudian dibukukan. Sedangkan yang dilakukan oleh para pendakwah adalah menyiarkan agama di depan orang banyak. Tapi kiranya dari kisah-kisah di buku ini bisa " +
                "diambil pelajaran untuk kita semua.\n\n-Dandy Try Yacoby, LPM Kemerdekaan",R.drawable.buku_novel_mpb,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Nanti Kita Cerita Tentang Hari Ini","Marchella FP | POP","-",R.drawable.buku_novel_nkc,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Nanti Kita Sambat Tentang Hari Ini","Mas Aik | Buku Mojok","Kalau aku sambat, memangnya kenapa?",R.drawable.buku_novel_nks,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Perempuan Di Titik Nol","Nawal El Saadawi | Yayasan Obor","Dari balik sel penjara, Firdaus -- yang divonis gantung karena telah membunuh seorang * -- mengisahkan liku-liku kehidupannya. Dari sejak masa kecilnya di desa, hingga ia menjadi *" +
                "kelas atas di Kota Kairo. Ia menyambut gembira hukuman gantung itu. Bahkan dengan tegas ia menolak grasi kepada presiden yang diusulkan oleh dokter penjara. Menurut Firdaus, vonis itu justru merupakan satu-satunya jalan menuju kebebasan sejati. Ironis.\n\nLewat * ini, kita justru " +
                "bisa menguak kebobrokan masyarakat yang didominasi kaum lelaki. Sebuah kritik sosial yang amat pedas!\n\nNovel ini didasari pada kisah nyata. Ditulis oleh Nawal el-Saadawi, seorang penulis feminis dari Mesir dengan reputasi Internasional",R.drawable.buku_novel_pdtn,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Shadow and Bone","Leigh Bardugo | POP","“Bagaimana caramu menyembunyikan kesaktianmu?”\n\n“Aku tidak menyembunyikan apa-apa. Aku tidak punya kesaktian.”\n\n“Mustahil.”\n\n“Nyatanya begitu.”\n\nAlina Starkov bukan siapa-siapa, cuma gadis yatim piatu " +
                "yang tidak punya apa-apa. Dia memang bergabung di militer sebagai pembuat peta, tapi keahliannya tidak seberapa. Alina bahkan ketiban sial karena kali ini timnya ditugaskan untuk menyeberangi Selubung Bayangan—selaput hampa cahaya berisi monster pelahap manusia. Namun, saat sang sahabat Mal Oretsev " +
                "hampir kehilangan nyawa dalam misi tersebut, Alina tidak tinggal diam dan tersingkaplah kekuatan besar di dalam dirinya yang tak disangka-sangka.\n\nKini Alina diboyong ke Istana Kecil untuk berlatih bersama Grisha, tentara sakti raja yang dipimpin oleh Sang Kelam. Sang Kelam percaya bahwa Alina dapat " +
                "membantunya menghancurkan Selubung Bayangan dan mempersatukan wilayah negeri yang kocar-kacir karena perang. Namun, pilar-pilar istana menyimpan banyak rahasia dan segala sesuatu tidak sesederhana kelihatannya. Sementara kegelapan semakin membayangi negeri dan rakyat mulai menggantungkan harapan di pundaknya, " +
                "Alina harus menghadapi bahaya yang dapat mengancam dirinya, orang yang dia cintai, serta masa depan dunia.\n\n“Semesta sihir terbaik setelah Harry Potter.” —BUSTLE",R.drawable.buku_novel_sab,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Seperti Dendam, Rindu Harus Dibayar Tuntas","Eka Kurniawan | Gramedia Pustaka Utama","Di puncak rezim yang penuh kekerasan, kisah ini bermula dari satu peristiwa: dua orang polisi memerkosa seorang perempuan gila, dan dua bocah melihatnya melalui lubang di jendela. Dan " +
                "* memutuskan untuk tidur panjang. Di tengah kehidupan yang keras dan brutal, * tidur merupakan alegori tentang kehidupan yang tenang dan damai, meskipun semua orang berusaha membangunkannya.",R.drawable.buku_novel_sdr,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Sherlock Holmes: A Study in Scarlet","Arthur Conan Doyle | Gramedia Pustaka Utama","Penelusuran Benang Merah merupakan buku pertama dalam seri Sherlock Holmes dan mengisahkan perkenalan " +
                "Dr. Watson dengan sang detektif. Dr. Watson yang ketika itu belum mengetahui profesi Holmes, pada awalnya dibuat bingung oleh keeksentrikan pria itu serta kemampuannya yang unik. Holmes sangat pandai dalam ilmu deduksi dan mampu menebak " +
                "keadaan seseorang hanya dalam sekali pandang. Tamu-tamu yang mengunjungi di rumah sewaan mereka di Baker Street, berasal dari berbagai kelas sosial mulai dari bangsawan sampai portir. Holmes mahir bermain bola, tapi lebih sering menggeseknya secara sembarang. " +
                "Ia bisa tampak sangat bersemangat, namun di lain waktu termenung-menung dengan pandangan kosong seperti orang kecanduan narkotika.\n\nDr. Watson baru memahami teman barunya itu ketika ia mengetahui profesi Holmes dan mendapat kesempatan untuk menyaksikan sang detektif" +
                "bekerja, menelusuri benang merah pembunuhan yang terjadi di jantung kota London.",R.drawable.buku_novel_shas,R.drawable.scan_cerpen_9dn));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        BukuDataAdapter myAdapter = new BukuDataAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}