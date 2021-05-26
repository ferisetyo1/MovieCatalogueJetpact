package feri.com.moviecataloguejetpact.data

import feri.com.moviecataloguejetpact.api.ApiHelper
import feri.com.moviecataloguejetpact.api.model.TvModel
import retrofit2.Response
import javax.inject.Inject

class DataManager @Inject constructor(
    private val apiHelper: ApiHelper
) {
    suspend fun getDiscoverMovie() = apiHelper.getDiscoverMovie()

    suspend fun getSearchMovie(query: String) = apiHelper.getSearchMovie(query)

    suspend fun getDiscoverTv() = apiHelper.getDiscoverTv()

    suspend fun getSearchTv(query: String) = apiHelper.getSearchTv(query)

    suspend fun getMovie(movieId: String) = apiHelper.getMovie(movieId)

    suspend fun getTv(tvId: String): Response<TvModel> = apiHelper.getTv(tvId)
}