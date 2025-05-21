package com.example.obrasdearte.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ObraArte(
    val id: Int,
    val titulo: String,
    val descricao: String,
    val imagem: String
) : Parcelable