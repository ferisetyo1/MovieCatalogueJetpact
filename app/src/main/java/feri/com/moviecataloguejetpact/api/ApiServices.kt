package feri.com.moviecataloguejetpact.api

import feri.com.moviecataloguejetpact.BuildConfig
import feri.com.moviecataloguejetpact.api.model.MovieModel
import feri.com.moviecataloguejetpact.api.model.MovieRespon
import feri.com.moviecataloguejetpact.api.model.TvModel
import feri.com.moviecataloguejetpact.api.model.TvRespon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val API_KEY = BuildConfig.MOVIEDB_API_KEY
        const val IMG_BASE_URL = "https://image.tmdb.org/t/p/w500"
    }

    @GET("discover/movie?api_key=$API_KEY")
    suspend fun getDiscoverMovie(): Response<MovieRespon>

    @GET("search/movie?api_key=$API_KEY")
    suspend fun getSearchMovie(@Query("query") query: String): Response<MovieRespon>

    @GET("movie/{movie_id}?api_key=$API_KEY")
    suspend fun getMovie(@Path("movie_id") movieId: String): Response<MovieModel>

    @GET("discover/tv?api_key=$API_KEY")
    suspend fun getDiscoverTv(): Response<TvRespon>

    @GET("tv/{tv_id}?api_key=$API_KEY")
    suspend fun getTv(@Path("tv_id") tvId: String): Response<TvModel>

    @GET("search/tv?api_key=$API_KEY")
    suspend fun getSearchTv(@Query("query") query: String): Response<TvRespon>
}
