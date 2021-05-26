package feri.com.moviecataloguejetpact.api

import feri.com.moviecataloguejetpact.api.model.MovieModel
import feri.com.moviecataloguejetpact.api.model.MovieRespon
import feri.com.moviecataloguejetpact.api.model.TvModel
import feri.com.moviecataloguejetpact.api.model.TvRespon
import retrofit2.Response

interface ApiHelper {

    suspend fun getDiscoverMovie(): Response<MovieRespon>

    suspend fun getSearchMovie(query: String): Response<MovieRespon>

    suspend fun getDiscoverTv(): Response<TvRespon>

    suspend fun getSearchTv(query: String): Response<TvRespon>

    suspend fun getMovie(movieId: String): Response<MovieModel>

    suspend fun getTv(tvId: String): Response<TvModel>
}