package com.example.top10university;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DataUniversity {
    private static String[] universityNames = {
            "Universitas Indonesia",
            "Universitas Gadjah Mada",
            "Universitas Institut Teknologi Bandung",
            "Universitas Brawijaya",
            "Universitas Diponegoro",
            "Universitas Airlangga",
            "Universitas Padjadjaran",
            "Universitas Institut Teknologi Sepuluh November",
            "Universitas Institut Pertanian Bogor",
            "Universitas Muhamadiyyah"
    };

    private static String[] universityDetails = {
            "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, universitas Indonesia adalah kampus modern, komprehensif, terbuka, multibudaya, dan humanis yang mencakup disiplin ilmu yang luas. Telah menghasilkan lebih dari 400.000 alumni. Cikal-bakal terbentuknya Universitas Indonesia adalah ketika pemerintah kolonial Belanda mendirikan sebuah sekolah yang bertujuan untuk menghasilkan asisten dokter tambahan yang memegang sertifikat untuk melakukan perawatan-perawatan tingkat dasar serta mendapatkan gelar Dokter Jawa (Javanese doctor). Secara resmi Universitas Indonesia memulai kegiatannya pada 2 Februari 1950 dengan presiden (saat ini disebut rektor) pertamanya Ir. R.M. Pandji Soerachman Tjokroadisoerio.[11] Kantor Presiden Universitas Indonesia mula-mula berkedudukan di Jakarta, di gedung Fakultas Kedokteran di Jl Salemba Raya no. 6, kemudian dipindahkan ke Jl. Salemba Raya no. 4, Jakarta. Tanggal 2 Februari 1950 dijadikan hari kelahiran Universitas Indonesia.",
            "Universitas Gadjah Mada disingkat UGM merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949 berdasarkan Peraturan Pemerintah Nomor 23 Tahun 1949 tentang Peraturan Tentang Penggabungan Perguruan Tinggi Menjadi Universiteit tanggal 16 Desember 1949. Kampus UGM yang terletak di Yogyakarta merupakan universitas pertama yang didirikan oleh Pemerintah Republik Indonesia setelah Indonesia merdeka. Pada saat didirikan, Universitas Gadjah Mada hanya memiliki enam fakultas, sekarang memiliki 18 Fakultas dan dua Sekolah yaitu Sekolah Vokasi dan Sekolah Pascasarjana (dahulu bernama Program Pascasarjana), dan lebih dari 100 Program Studi untuk S2, S3, dan Spesialis. ",
            "Institut Teknologi Bandung (ITB) adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung. Nama ITB diresmikan pada tanggal 2 Maret 1959. Sejak tanggal 14 Oktober 2013 ITB menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) yang memiliki otonomi pengelolaan dalam akademik dan nonakademik.[9] ITB telah memiliki 27 program studi yang terakreditasi secara internasional (sebelas dari ABET, sebelas dari ASIIN). Kampus utama ITB saat ini merupakan lokasi dari sekolah tinggi teknik pertama di Indonesia[note 4] sekaligus lembaga pendidikan tinggi pertama di Hindia Belanda.[note 5] Walaupun masing-masing institusi pendidikan tinggi yang mengawali ITB memiliki karakteristik dan misi masing-masing, semuanya memberikan pengaruh dalam perkembangan yang menuju pada pendirian ITB. Rektor ITB saat ini adalah Prof. Dr. Ir. Kadarsah Suryadi, DEA, untuk masa jabatan 2015-2020. ",
            "Universitas Brawijaya (UB) adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB. Nama Brawijaya diberikan khusus oleh Presiden Soekarno dengan harapan mampu gemilang seperti Raden Wijaya (Brawijaya I) selaku pendiri Kerajaan Majapahit sekaligus menjadi kampus kebanggan bangsa Indonesia. Universitas Brawijaya merupakan kampus elit di Indonesia dan secara konsisten menduduki peringkat 5 terbaik sedangkan di tingkat Internasional, UB menduduki peringkat 51 di Asia dan 400 dunia. UB memiliki empat kampus. Kampus utama terletak di sebelah barat Kota Malang (Ketawanggede), dan kampus kedua berada di Puncak Dieng atau dikenal sebagai UB Dieng yang digunakan untuk fasilitas olahraga outdoor, dan beberapa fasilitas riset maupun perkuliahan.[6] Sedangkan kampus ketiga dan keempat berada di Kediri dan Jakarta.",
            "Universitas Diponegoro disingkat Undip, adalah sebuah Perguruan Tinggi Negeri di Indonesia yang berlokasi di Semarang, Jawa Tengah, Indonesia. Undip didirikan pada tahun 1956 sebagai Perguruan Tinggi Swasta dan baru mendapat status sebagai Perguruan Tinggi Negeri pada tahun 1961. Kata Diponegoro diambil dari nama pahlawan nasional, yaitu Pangeran Diponegoro yang merupakan seorang pangeran pengobar semangat kemerdekaan dari tindakan kolonialisme Belanda di awal abad ke-18. Semangat ini turut menginspirasi pendirian Undip. Universitas Diponegoro memperoleh akreditasi A (Sangat Baik) dengan skor 361 dari Badan Akreditasi Nasional Perguruan Tinggi yang berlaku sejak 2013-2018. Berdasarkan Peraturan Pemerintah Nomor 52 Tahun 2015, Undip ditetapkan statusnya menjadi Perguruan Tinggi Negeri Badan Hukum.",
            "Universitas Airlangga (disingkat UNAIR) adalah sebuah perguruan tinggi negeri yang terletak di Gubeng, Surabaya, Surabaya, Jawa Timur. Universitas ini didirikan tanggal 10 November 1954 bertepatan dengan hari pahlawan yang ke-9. Berdasarkan data 30 September 2015, terdapat 38.047 mahasiswa yang terdaftar di Unair. Berdirinya Universitas Airlangga memiliki sejarah yang cukup panjang. Sebelum Unair resmi didirikan, pada tanggal 9 dan 11 Oktober 1847, disampaikan usul kepada Pemerintah Kolonial Belanda untuk mendidik pemuda-pemuda Jawa yang berbakat menjadi ahli-ahli praktik kesehatan. Pada tanggal 2 Januari 1849, melalui Keputusan Pemerintah No. 22, didirikan NIAS (Nederlandsch Indische Artsen School)[butuh rujukan] sebagai tempat pendidikan dokter di Surabaya. Sejak tahun 1913, pendidikan dokter di Surabaya berlangsung di Jl. Kedungdoro 38 Surabaya. Pada tahun 1923 gedung NIAS dipindah dari Jl. Kedungdoro ke tempat berdirinya Fakultas Kedokteran Unair di Jl. Mayjen. Prof. Dr. Moestopo Surabaya.",
            "Universitas Padjadjaran (disingkat Unpad) adalah sebuah perguruan tinggi negeri di Bandung, Jawa Barat, Indonesia. Pada 20 Oktober 2014, Universitas ini berubah status menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) dari Badan Layanan Umum (BLU). Peresmian itu ditandai dengan peraturan pemerintah (PP) yang ditandatangani mantan Presiden Susilo Bambang Yudhoyono. Penetapan itu didasarkan atas evaluasi kinerja yang dilakukan tim independen yang dibentuk Kementerian Pendidikan dan Kebudayan (Kemendikbud).[2] Selain itu berdasarkan Keputusan Badan Akreditasi Nasional Perguruan Tinggi (BAN PT) yang ditetapkan pada 16 Januari 2014, Unpad mendapat peringkat A (sangat baik).",
            "Institut Teknologi Sepuluh Nopember (disingkat ITS) adalah perguruan tinggi negeri yang terletak di Surabaya. ITS awalnya didirikan oleh Yayasan Perguruan Tinggi Teknik (YPTT) yang diketuai oleh dr. Angka Nitisastro pada tanggal 10 November 1957. Dies Natalis ITS pertama adalah 10 November 1960, sementara nama ITS mulai digunakan dalam Peraturan Pemerintah No. 9 tahun 1961 (ditetapkan tanggal 23 Maret 1961). Dalam visi awal, ITS ditujukan untuk mendidik para pemimpin yang unggul di bidang sains dan teknologi, untuk mengangkat Republik Indonesia menjadi negara berperadaban maju dan tinggi. Kampus ITS Sukolilo menempati areal seluas 180 hektare, dengan luas bangunan seluruhnya kurang lebih 150.000 m2. Selain itu terdapat Kampus Manyar yang dipergunakan oleh Program D-3 dan D-4 Teknik Sipil dengan luas bangunan 5.176 m2 dan Kampus ITS Cokroaminoto yang dipergunakan untuk magister manejemen serta beberapa lembaga kerjasama dengan luas bangunan 4.000 m2.",
            "Institut Pertanian Bogor IPB University, sebelumnya Bogor Agricultural University adalah sebuah perguruan tinggi pertanian negeri yang berkedudukan di Bogor. Sebelum diresmikan pada tahun 1963, IPB adalah sebuah fakultas pertanian pada Universitas Indonesia. Pada tanggal 1 September 1963.[3] Presiden Pertama Indonesia, Ir. Soekarno, melakukan peletakkan batu pertama pembangunan kampus sekaligus menandai peresmian Institut Pertanian Bogor sebagai sebuah perguruan tinggi mandiri. Berdasarkan hasil keputusan rapat pleno Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT) tanggal 7 November 2017, BAN-PT memutuskan bahwa Institut Pertanian Bogor (IPB) memperoleh status terakreditasi dengan peringkat A (sangat baik). Saat ini, Rektor IPB untuk periode 2017-2022 adalah Dr. Arif Satria, SP, M.Si.",
            "Universitas Muhammadiyah Surakarta (UMS) merupakan satu dari 164 Perguruan Tinggi Muhammadiyah (PTM) dan satu di antara 1.890 Perguruan Tinggi Swasta (PTS) di Indonesia. UMS ini terletak di Kecamatan Kartasura Kabupaten Sukoharjo (Kartasura, Sukoharjo). Amal usaha bidang pendidikan ini bertekad mewujudkan kampus sebagai \"Wacana Keil\u00ADmuan dan Keislaman\", yakni mampu menumbuhkan budaya islami yang menguasai ilmu pengetahuan dan keterampilan yang dilandasi nilai-nilai keislaman. Sikap kerja keras, jujur, ikhlas, sabar, berintegritas tinggi, berpikiran positif, rasional, objektif, adil dan berhati bersih sebagai landasan moral pengembangan ilmu pengetahuan, teknologi dan ilmu-ilmu keislaman senantiasa ditanamkan kepada seluruh civitas akademik UMS untuk menyongsong era globalisasi. Era globalisasi dan informasi menimbulkan interdependensi. Oleh karena itu, perguruan tinggi memainkan peran yang menen-tukan dalam pembentukan kualitas sumberdaya insani suatu bangsa yang menguasai ilmu pengetahuan dan informasi. UMS tidak bisa lepas dari tuntutan tersebut dan perlu menata diri untuk meningkatkan keberlangsungan, daya juang, dan daya saing pada masa-masa mendatang.",

    };

    private static int[] universityImages = {
            R.drawable.universitas_indonesia,
            R.drawable.universitas_gadjah_mada,
            R.drawable.universitas_institut_teknologi_bandung,
            R.drawable.universitas_brawijaya,
            R.drawable.universitas_diponegoro,
            R.drawable.universitas_airlangga,
            R.drawable.universitas_padjadjaran,
            R.drawable.universitas_institut_teknologi_sepuluh_november,
            R.drawable.universitas_institut_pertanian_bogor,
            R.drawable.universitas_muhammadiyah,
    };

    static ArrayList<Universitas> getLishData() {
        ArrayList<Universitas> list = new ArrayList<>();
        for (int position = 0; position < universityNames.length; position++) {
            Universitas universitas = new Universitas();
            universitas.setName(universityNames[position]);
            universitas.setDetail(universityDetails[position]);
            universitas.setPhoto(universityImages[position]);
            list.add(universitas);

        }
        return list;
    }
}