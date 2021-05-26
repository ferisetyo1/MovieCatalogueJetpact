package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.detail

import com.nhaarman.mockitokotlin2.verify
import feri.com.moviecataloguejetpact.DummyData
import feri.com.moviecataloguejetpact.api.ApiHelperImpl
import feri.com.moviecataloguejetpact.api.ApiServices
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito
import retrofit2.Response

class DetailViewModelTest {

    private lateinit var dummy: DummyData
    private lateinit var apiServices: ApiServices
    private lateinit var apiHelperImpl: ApiHelperImpl

    @Before
    fun setUp() {
        dummy = DummyData
        apiServices = Mockito.mock(ApiServices::class.java)
        apiHelperImpl = ApiHelperImpl(apiServices)
    }

    @Test
    fun getDataTv() {
        runBlocking {
            Mockito.`when`(apiServices.getTv("120168")).thenReturn(
                Response.success(dummy.getDetailTvRepo())
            )
            val tv = apiHelperImpl.getMovie("120168").body()
            verify(apiServices).getMovie("120168")
            assertNotNull(tv)
            assertEquals(120168, tv?.id)
        }
    }

    @Test
    fun getDataMovie() {
        runBlocking {
            Mockito.`when`(apiServices.getMovie("578701")).thenReturn(
                Response.success(dummy.getDetailMovieRepo())
            )
            val movies = apiHelperImpl.getMovie("578701").body()
            verify(apiServices).getMovie("578701")
            assertNotNull(movies)
            assertEquals(578701, movies?.id)
        }
    }
}