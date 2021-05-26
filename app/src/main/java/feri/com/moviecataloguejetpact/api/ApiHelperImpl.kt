package feri.com.moviecataloguejetpact.api

import feri.com.moviecataloguejetpact.api.model.TvModel
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(
    private val apiServices: ApiServices
) : ApiHelper {

    override suspend fun getDiscoverMovie() = apiServices.getDiscoverMovie()

    override suspend fun getSearchMovie(query: String) = apiServices.getSearchMovie(query)

    override suspend fun getDiscoverTv() = apiServices.getDiscoverTv()

    override suspend fun getSearchTv(query: String) = apiServices.getSearchTv(query)

    override suspend fun getMovie(movieId: String) = apiServices.getMovie(movieId)

    override suspend fun getTv(tvId: String): Response<TvModel> = apiServices.getTv(tvId)

}