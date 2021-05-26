package feri.com.moviecataloguejetpact

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FilmModel(
    val name: String? = null,
    val imgUrl: Int? = null,
    val storyline: String? = null,
    val releaseDate: String? = null,
    val director: String? = null,
    val runtime: Int? = null,
    val year: Int? = null,
    val actors: List<String?>? = null
) : Parcelable
