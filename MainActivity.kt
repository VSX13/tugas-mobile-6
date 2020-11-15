package com.example.jajanankekiniansurabaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createJajanData()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = JajanAdapter(testData, {jajanItem : JajanData -> jajanItemClicked(jajanItem) })
    }

    private fun jajanItemClicked(jajanItem : JajanData) {
        val showDetailActivityIntent = Intent(this, JajanDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.jajanFoto.toInt())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, jajanItem.jajanName.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.jajanDetail.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createJajanData() : List<JajanData> {
        val partList = ArrayList<JajanData>()
        partList.add(JajanData("Takoyaki Rice Crispy", R.drawable.foto_takoyaki, "Takoyaki merupakan street food khas Jepang berbentuk bola-bola kecil yang diisi dengan potongan gurita. Di Surabaya, traveler bisa mencicipi takoyaki dengan isian rice crispy yang gurih. Takoyaki unik ini dibanderol dengan harga Rp 10 ribu (isi 4) dan Rp 12 ribu (isi 5).\n"))
        partList.add(JajanData("Sate Cumi Bakar", R.drawable.foto_sate, "Sate Cumi bakar merupakan sate yang dibuat dari cumi yang sudah dipotong-potong lalu ditusuk dengan sate,kadang-kadang sate cumi bakar ini dicampur dengan bahan tambahan seperti sosis dan lain-lainnya agar menambah rasa cita pada sate cumi bakar ini. Sate cumi bakar ini dijual dengan harga minimal 15 Ribu dan terdapat diseluruh kota di indonesia termasuk surabaya.\n"))
        partList.add(JajanData("Mix Odeng Tokkochi", R.drawable.foto_odeng, "odeng merupakan kudapan khas korea selatan yang berupa ikan rebus,nah jadi kudapan mix odeng tokechi merupakan kudapan campuran dari odeng dan berbagai bahan makanan lain seperti sosis dan lain-lain. kudapan ini dimulai dari harga 18 Ribu, kudapan ini bisa didapatkan disurabaya dan sekitarnya\n"))
        partList.add(JajanData("Pentol Jumbo", R.drawable.foto_bakso, "Jika pentol biasanya berukuran kecil, di Surabaya ada pentol dengan ukuran jumbo. Uniknya pentol ini terdapat beragam jenis pentol, mulai dari pentol jumbo, pentol cabe, pentol jamur, pentol keju, pentol puyuh, dan pentol urat. Harga pentol ini mulai Rp 500 hingga Rp 2 ribu.\n"))
        partList.add(JajanData("Kripik Usus Crepsus", R.drawable.foto_crepsus, "Kripik Usus Crepsus merupakan kripik usus kekinian yang enak dan gurih dan tersedia 6 macam rasa yaitu Original, Hot Spicy (pedas), Barbeque, Seaweed (rumput laut), Smoked Beef (daging sapi asap), dan Jagung Bakar. harga kripik usus crepsus ini dijual dengan harga sekitar 9 ribu.\n"))
        partList.add(JajanData("Guna-Guna Snack", R.drawable.foto_guna, "Guna-Guna Snack merupakan keripik berbahan dasar singkong dan kentang dengan berbagai varian rasa yang kekinian dan disukai anak muda. guna-guna snack ini memiliki beberapa varian rasa yang bisa kita nikmati mulai dari rasa manis, balado, kentang pedas, spemprit keju, dan lain-lain. Harga snack ini dibandrol mulai dari 20 ribu rupiah.\n"))
        partList.add(JajanData("Kue Spiku Ala Snow Cake", R.drawable.foto_spiku, "Kue Spiku Ala Snow Cake merupakan kue yang memiliki 3 lapisan roti yang sangat empuk dan lembut. Snow Cake ini memiliki beragam rasa seperti cokelat, keju, oreo, dan masih banyak lagi yang lainnya. Harganya Dibandrol mulai dengan harga 69 ribu rupiah.\n"))
        return partList
    }

}