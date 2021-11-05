package com.zaid.parpoluts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Daftar Partai Politik Indonesia"

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.pdi,"Partai Demokrasi Indonesia","Megawati Soekarno Putri","Pada Kongres Nasional 1993, Megawati Soekarnoputri terpilih sebagai Ketua Umum Partai Demokrasi Indonesia, salah satu dari tiga partai politik yang diakui oleh pemerintahan \"Orde Baru\" Presiden Soeharto. Hasil ini tidak diakui oleh pemerintah, yang terus mendorong Budi Harjono, calon ketua umum yang dipilihnya, untuk dipilih. Kongres Khusus diadakan di mana pemerintah mengharapkan Harjono terpilih, tetapi Megawati sekali lagi muncul sebagai pemimpin terpilih. Posisinya semakin terkonsolidasi ketika Majelis Nasional PDI meratifikasi hasil kongres. " +
                "Pada bulan Juni 1996, Kongres Nasional kembali diadakan di Kota Medan, di mana Megawati tidak diundang; anggota anti-Megawati hadir. Dengan dukungan pemerintah, Suryadi, mantan ketua umum, terpilih kembali menjadi Ketua Umum PDI. Megawati menolak mengakui hasil kongres ini dan terus memandang dirinya sebagai pemimpin sah PDI. " +
                "Pagi 27 Juli 1996, Suryadi mengancam akan mengambil kembali markas PDI di Jakarta. Para pendukung Suryadi (kabarnya dengan dukungan Pemerintah) menyerang Markas Besar PDI dan menghadapi perlawanan dari pendukung Megawati yang ditempatkan di sana sejak Kongres Nasional di Medan. Dalam bentrokan berikutnya, pendukung Megawati berhasil bertahan di markas. Kerusuhan pun terjadi—pada tahap yang dianggap terburuk yang pernah dilihat Jakarta pada masa \"Orde Baru\"—yang disusul dengan tindakan keras pemerintah. Pemerintah kemudian menuding kerusuhan itu terjadi pada Partai Rakyat Demokratik (PRD). Meski digulingkan sebagai ketua oleh Suryadi dan pemerintah, acara tersebut sangat mengangkat profil Megawati, memberikan simpati dan popularitas nasional. "+
                "PDI kini terpecah menjadi dua fraksi, Megawati dan Suryadi. Yang pertama ingin berpartisipasi dalam pemilihan legislatif 1997, tetapi pemerintah hanya mengakui yang terakhir. Dalam pemilu, Megawati dan pendukungnya memberikan dukungan kepada Partai Persatuan Pembangunan dan PDI hanya meraih 3% suara. Menyusul pengunduran diri Soeharto dan pencabutan batasan \"Orde Baru\" pada partai politik nasional, Megawati mendeklarasikan pembentukan PDIP, menambahkan sufiks \"perjuangan\" untuk membedakan fraksi partainya dari fraksi yang didukung pemerintah. Dia terpilih sebagai ketua umum PDIP dan dinominasikan sebagai presiden pada tahun 1999."))

        data?.add(DataModel(R.drawable.golkar,"Partai Golongan Karya","Airlangga Hartarto", "Partai Golongan Karya (Golkar) adalah sebuah partai politik di Indonesia. Didirikan sebagai Sekber Golkar (Sekretariat Bersama Golongan Karya, Sekretariat Gabungan Golongan Karya) pada tahun 1964, dan berpartisipasi untuk pertama kalinya dalam pemilihan nasional pada 1971 sebagai Golkar (Golongan Karya). Golkar tidak resmi menjadi partai politik sampai tahun 1999, ketika itu diperlukan untuk menjadi sebuah partai untuk kontes pemilihan. " +
                "Golkar adalah kelompok politik yang berkuasa dari tahun 1971 hingga 1999, di bawah kepemimpinan Presiden Soeharto dan B.J. Habibie. Kemudian bergabung dengan koalisi yang berkuasa di bawah presiden Abdurrahman Wahid, Megawati Soekarnoputri, dan Susilo Bambang Yudhoyono. Ketika Presiden Joko Widodo dari PDI-P terpilih pada tahun 2014, Golkar awalnya memilih untuk bergabung dengan koalisi oposisi yang dipimpin oleh mantan jenderal Prabowo Subianto, yang pada akhirnya kembali mengalihkan kesetiaannya kepada Pemerintahan Joko Widodo pada tahun 2016. "))

        data?.add(DataModel(R.drawable.pkb,"Partai Kebangkitan Bangsa","Muhaimin Iskandar", "Partai Kebangkitan Bangsa (PKB), adalah sebuah partai politik berideologi Moderat di Indonesia. Partai ini didirikan di Jakarta pada tanggal 23 Juli 1998 (29 Rabi'ul Awal 1419 Hijriyah) yang dideklarasikan oleh para kiai-kiai Nahdlatul Ulama, seperti Munasir Ali, Ilyas Ruchiyat, Abdurrahman Wahid, A. Mustofa Bisri, dan A. Muhith Muzadi). " ))

        data?.add(DataModel(R.drawable.nasdem,"Partai Nasdem","Surya Paloh", "Partai NasDem adalah sebuah partai politik di Indonesia yang diresmikan di Hotel Mercure Ancol, Jakarta Utara pada tanggal 26 Juli 2011. Partai ini didukung oleh Surya Paloh yang merupakan pendiri organisasi bernama sama yaitu Nasional Demokrat. " +
                "Pada Januari 2013, KPU menetapkan 10 partai politik yang lolos tahapan verifikasi administrasi dan faktual, dan menjadikan Partai NasDem sebagai satu-satunya partai baru yang lolos sebagai peserta Pemilu 2014. Pada bulan yang sama, partai ini diramaikan oleh isu terjadinya konflik di tataran para elit partai. Ketua Majelis Tinggi Partai Nasional Demokrat, Surya Paloh, kabarnya akan dicalonkan sebagai Ketua Umum Partai NasDem pada Kongres Partai NasDem yang akan diadakan pada 25 Januari 2013 di Jakarta. Pada bulan tersebut juga terjadi aksi pemecatan terhadap Sekjen DPW DKI Garda Pemuda Nasdem, Saiful Haq, sekaligus pembekuan kepengurusan DPW tersebut. Pada kongres perdana partai ini, yang diadakan pada Januari 2013, seluruh peserta kongres Partai NasDem yang berasal dari seluruh Indonesia secara aklamasi sepakat mengangkat Surya Paloh sebagai Ketua Umum Partai NasDem yang baru, menggantikan Patrice Rio Capella. "))

        data?.add(DataModel(R.drawable.pks,"Partai Keadilan Sejahtera","Ahmad Syaikhu", "Partai Keadilan Sejahtera (PKS), sebelumnya bernama Partai Keadilan (PK), adalah sebuah partai politik berbasis Islam yang memiliki perwakilan di parlemen Indonesia. Partai ini berdiri pada 20 April 1998 yang berawal dari gerakan aktivitas dakwah Islam sejak 1980-an. Pemilu 2019 menjadi pemilu kelima yang diikuti partai ini. " +
                "Kelahiran PKS erat kaitannya dengan gerakan Islam berbasis massa kampus dan cendekiawan yang muncul sebagai tanggapan atas tekanan politik pemerintah Orde Baru terhadap umat Islam. Gerakan ini ditandai dengan mulai maraknya kegiatan kajian Islam dan meluasnya penggunaan jilbab di kampus-kampus sekuler Indonesia pada era 1980-an." +
                "Dengan latar belakang pendirinya yang sebagian besar adalah anak muda terdidik, PKS meraup dukungan paling banyak di perkotaan. Dalam pemilu 2004, partai ini mendapat 7,3% dukungan suara nasional, melonjak dari perolehan suara pada pemilu sebelumnya yang hanya 1,36%. PKS menempatkan tokoh-tokoh muda sebagai kandidat alternatif untuk diusung sebagai gubernur, bupati, dan wali kota melalui pemilhan kepala daerah secara langsung yang digelar sejak 2005." +
                "PKS tampil sebagai peraih suara terbanyak keempat hasil pemilu 2009 seiring meluasnya sebaran pemilih PKS. Eskalasi kemenangan yang diraih PKS dalam pilkada serentak yang digelar sejak 2015 baik lewat jalan koalisi maupun mengusung kadernya sendiri telah mematahkan dominasi Golkar dan PDI Perjuangan." +
                "Partai ini secara rutin terlibat dalam program pelayanan sosial, pemberdayaan masyarakat, dan bantuan kemanusiaan. Dengan sistem kaderisasi yang teratur, PKS membangun militansi kadernya. Kader membiayai keterlibatan diri mereka dalam agenda politik dan tidak bergantung pada figur. PKS secara konsisten memberikan dukungan bagi perjuangan umat Islam di seluruh dunia lewat lobi di parlemen, demonstrasi, maupun penggalangan dana. Dalam setiap demonstrasi maupun kampanye mereka, PKS dianggap \"mendatangkan contoh\" mengerahkan massa dalam jumlah banyak dengan tertib dan aman."))

        data?.add(DataModel(R.drawable.gerindra,"Partai Gerakan Indonesia Raya","Prabowo Subianto", "Partai Gerakan Indonesia Raya (Gerindra) adalah partai politik di Indonesia. Dibentuk pada tahun 2008, Gerindra berfungsi sebagai kendaraan politik mantan jenderal Prabowo Subianto. Saat ini partai terbesar ketiga di DPR, di mana ia memiliki 78 kursi. Gerindra telah memposisikan dirinya sebagai partai oposisi, tetapi pada 2019 ia bergabung dengan Kabinet Indonesia Maju Presiden Joko Widodo, meskipun Prabowo telah mencalonkan diri melawan Widodo dalam pemilihan presiden Indonesia 2014 dan 2019. "))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("ketua", item?.ketua)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}