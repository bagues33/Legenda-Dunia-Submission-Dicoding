package com.recoder.legendadunia.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LegendaDunia (
    var name : String ?= "",
    var thumbnail : Int ?= 0,
    var photo : Int ?= 0,
    var description : String ?= "",
    var kelahiran : String ?= "",
    var kebangsaan : String ?= "",
    var gaji : String ?= "",
    var tim : String ?= "",
) : Parcelable