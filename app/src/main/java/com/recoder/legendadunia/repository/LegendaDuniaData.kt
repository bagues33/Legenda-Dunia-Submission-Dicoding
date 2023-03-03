package com.recoder.legendadunia.repository

import com.recoder.legendadunia.R
import com.recoder.legendadunia.model.LegendaDunia

object LegendaDuniaData {
    private val dNames = arrayOf("Messi",
    "Cristiano Ronaldo",
    "Neymar",
    "Kylian Mbappe",
    "Pele",
    "Mohammed Salah",
    "Ronaldo",
    "Robert Lewandowski",
    "Diego Maradona",
    "Karim Benzema")

    private val dThumb = intArrayOf(
        R.drawable.messi,
        R.drawable.cristiano_ronaldo,
        R.drawable.neymar,
        R.drawable.mbappe,
        R.drawable.pele,
        R.drawable.mohamedsaleh,
        R.drawable.ronaldo,
        R.drawable.lewandowski,
        R.drawable.maradona,
        R.drawable.benzema
    )

    private val dPhoto = intArrayOf(R.drawable.messi,
        R.drawable.cristiano_ronaldo,
        R.drawable.neymar,
        R.drawable.mbappe,
        R.drawable.pele,
        R.drawable.mohamedsaleh,
        R.drawable.ronaldo,
        R.drawable.lewandowski,
        R.drawable.maradona,
        R.drawable.benzema)


    private val dDescription = arrayOf("Lionel Andrés Messi juga dikenal sebagai Leo Messi, adalah seorang pemain sepak bola profesional asal Argentina yang bermain sebagai penyerang untuk klub Ligue 1 Paris Saint-Germain dan merupakan kapten tim nasional Argentina.",
        "Cristiano Ronaldo dos Santos Aveiro adalah seorang pemain sepak bola profesional asal Portugal yang bermain sebagai penyerang dan juga kapten tim nasional Portugal.",
        "Neymar da Silva Santos Júnior yang umumnya dikenal sebagai Neymar atau Neymar Jr, adalah pemain sepak bola profesional Brasil yang bermain untuk klub Prancis Paris Saint-Germain. Dia bermain sebagai penyerang atau pemain sayap.",
        "Kylian Mbappé Lottin adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis.",
        "Edson Arantes do Nascimento atau lebih dikenal sebagai Pelé adalah legenda sepak bola dunia yang berasal dari Brasil. Selama kariernya sebagai pemain, Pele berhasil membawa Brasil menjadi Juara Dunia Piala Dunia FIFA sebanyak 3 kali, yaitu pada tahun 1958 di Swedia, tahun 1962 di Chili, dan tahun 1970 di Meksiko.",
        "Mohamed Salah Hamed Mahrous Ghaly adalah seorang pemain sepak bola profesional asal Mesir yang bermain sebagai penyernag untuk klub Liga Utama Inggris Liverpool dan tim nasional Mesir.",
        "Ronaldo Luís Nazário de Lima, umumnya dipanggil Ronaldo saja, adalah seorang mantan pemain dan legenda sepak bola Brasil. Oleh banyak pengamat dan pecinta sepak bola ia dianggap sebagai salah satu pemain sepak bola terbaik sepanjang masa. Ia bermain sebagai penyerang dan terakhir kali bermain bagi klub Corinthians.",
        "Robert Lewandowski adalah pemain sepak bola Polandia yang saat ini bermain sebagai penyerang pada klub La Liga FC Barcelona dan merupakan kapten tim nasional Polandia.",
        "Diego Armando Maradona yang lebih dikenal dengan sebutan Maradona adalah mantan pemain sepak bola legendaris Argentina. Maradona menjadi pelatih timnas Argentina mulai November 2008 sampai Juli 2010. Untuk Argentina Maradona tampil sebanyak 91 kali dan mencetak 34 gol.",
        "Karim Mostafa Benzema adalah seorang pemain sepak bola profesional Prancis keturunan Aljazair yang saat ini bermain untuk tim klub Real Madrid di Liga Spanyol, La Liga dengan Timnas Prancis."
    )

    val listData : ArrayList<LegendaDunia>
        get() {
            val list = arrayListOf<LegendaDunia>()
            for (position in dNames.indices){
                val data = LegendaDunia()
                data.name = dNames[position]
                data.thumbnail = dThumb[position]
                data.photo = dPhoto[position]
                data.description = dDescription[position]
                list.add(data)
            }
            return list
        }

}