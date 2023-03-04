package com.recoder.legendadunia.repository

import com.recoder.legendadunia.R
import com.recoder.legendadunia.model.LegendaDunia

object LegendaDuniaData {
    private val dNames = arrayOf(
        "Messi",
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

    private val dPhoto = intArrayOf(
        R.drawable.messi,
        R.drawable.cristiano_ronaldo,
        R.drawable.neymar,
        R.drawable.mbappe,
        R.drawable.pele,
        R.drawable.mohamedsaleh,
        R.drawable.ronaldo,
        R.drawable.lewandowski,
        R.drawable.maradona,
        R.drawable.benzema)

    private val dKelahiran = arrayOf(
        "24 Juni 1987 (usia 35 tahun)",
        "5 Februari 1985 (usia 38 tahun",
        "5 Februari 1992 (usia 31 tahun)",
        "20 Desember 1998 (usia 24 tahun)",
        "23 Oktober 1940",
        "15 Juni 1992 (usia 30 tahun)",
        "18 September 1976 (usia 46 tahun)",
        "21 Agustus 1988 (usia 34 tahun)",
        "30 Oktober 1960",
        "19 Desember 1987 (usia 35 tahun)")

    private val dKebangsaan = arrayOf(
        "Argentina, Italia, Spanyol",
        "Portugis",
        "Brasil",
        "Prancis",
        "Brasil",
        "Mesir",
        "Brasil",
        "Polandian",
        "Argentina",
        "Prancis")

    private val dGaji = arrayOf(
        "41 juta USD (2022)",
        "62 juta GBP (2023)",
        "40,8 juta GBP (2022)",
        "72 juta EUR (2023)",
        "18,2 juta GBP (2023)",
        "30 juta euro",
        "13 juta euro",
        "150 ribu pound",
        "29 Juta USD",
        "8 juta GBP (2021)")

    private val dTim = arrayOf(
        "Paris Saint-Germain F.C. (#30 / Penyerang), Tim nasional sepak bola Argentina (#10 / Penyerang)",
        " Al-Nassr FC (#7 / Penyerang), Tim nasional sepak bola Portugal (#7 / Penyerang)",
        "Paris Saint-Germain F.C. (#10 / Penyerang), Tim nasional sepak bola Brasil (#10 / Penyerang), Brazil",
        "Paris Saint-Germain F.C. (#7 / Penyerang), Tim nasional sepak bola Prancis (#10 / Penyerang)",
        "Santos FC dan New York Cosmos",
        "Liverpool F.C. (#11 / Penyerang), Tim nasional sepak bola Mesir (#10 / Penyerang)",
        "Brazil",
        "FC Barcelona (#9 / Penyerang), Tim nasional sepak bola Polandia (#9 / Penyerang)",
        "Gimnasia La Plata (Manajer sepak bola, 2019–2020), LAINNYA",
        "Real Madrid")

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
                data.kelahiran = dKelahiran[position]
                data.kebangsaan = dKebangsaan[position]
                data.gaji = dGaji[position]
                data.tim = dTim[position]
                list.add(data)
            }
            return list
        }

}