package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.menu_movie

import com.nhaarman.mockitokotlin2.verify
import feri.com.moviecataloguejetpact.DummyData
import feri.com.moviecataloguejetpact.api.ApiHelperImpl
import feri.com.moviecataloguejetpact.api.ApiServices
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import retrofit2.Response

class MovieViewModelTest {

    private lateinit var dummy:DummyData
    private lateinit var apiServices: ApiServices
    private lateinit var apiHelperImpl: ApiHelperImpl

    @Before
    fun setUp() {
        dummy= DummyData
        apiServices = mock(ApiServices::class.java)
        apiHelperImpl= ApiHelperImpl(apiServices)
    }

    @Test
    fun getDataMovie() {
        runBlocking {
            `when` (apiServices.getDiscoverMovie()).thenReturn(
                Response.success(dummy.getListMovieRepo())
            )
            val movies=apiHelperImpl.getDiscoverMovie().body()?.results
            verify(apiServices).getDiscoverMovie()
            assertNotNull(movies)
            assertEquals(20,movies?.size)
        }
    }

    @Test
    fun searchMovie() {
        runBlocking {
            `when` (apiServices.getSearchMovie("Those Who Wish Me Dead")).thenReturn(
                Response.success(dummy.getSearchMovieRepo())
            )
            val movies=apiHelperImpl.getSearchMovie("Those Who Wish Me Dead").body()?.results
            verify(apiServices).getSearchMovie("Those Who Wish Me Dead")
            assertNotNull(movies)
            assertEquals(1,movies?.size)
        }
    }
}