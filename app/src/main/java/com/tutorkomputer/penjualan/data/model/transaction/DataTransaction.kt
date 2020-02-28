package com.tutorkomputer.penjualan.data.model.transaction

import com.google.gson.annotations.SerializedName

data class DataTransaction (


    @SerializedName("kd_transaksi") val kd_transaksi: Long?,
    @SerializedName("no_faktur") val no_faktur: String?,
    @SerializedName("tgl_penjualan") val tgl_penjualan: String?,
    @SerializedName("kd_agen") val kd_agen: Long?,
    @SerializedName("username") val username: String?,
    @SerializedName("total") val total: String?,
    @SerializedName("total_rupiah") val total_rupiah: String?
)