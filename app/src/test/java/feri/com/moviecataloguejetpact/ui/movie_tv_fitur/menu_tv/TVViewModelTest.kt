package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.menu_tv

import com.nhaarman.mockitokotlin2.verify
import feri.com.moviecataloguejetpact.DummyData
import feri.com.moviecataloguejetpact.api.ApiHelperImpl
import feri.com.moviecataloguejetpact.api.ApiServices
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito
import retrofit2.Response

class TVViewModelTest {

    private lateinit var dummy: DummyData
    private lateinit var apiServices: ApiServices
    private lateinit var apiHelperImpl: ApiHelperImpl

    @Before
    fun setUp() {
        dummy= DummyData
        apiServices = Mockito.mock(ApiServices::class.java)
        apiHelperImpl= ApiHelperImpl(apiServices)
    }


    @Test
    fun getDataTv() {
        runBlocking {
            Mockito.`when` (apiServices.getDiscoverTv()).thenReturn(
                Response.success(dummy.getListTVRepo())
            )
            val tv=apiHelperImpl.getDiscoverTv().body()?.results
            verify(apiServices).getDiscoverTv()
            assertNotNull(tv)
            assertEquals(20,tv?.size)
        }
    }

    @Test
    fun searchTv() {
        runBlocking {
            Mockito.`when` (apiServices.getSearchTv("Jurassic World: Camp Cretaceous")).thenReturn(
                Response.success(dummy.getSearchTVRepo())
            )
            val tv=apiHelperImpl.getSearchTv("Jurassic World: Camp Cretaceous").body()?.results
            verify(apiServices).getSearchTv("Jurassic World: Camp Cretaceous")
            assertNotNull(tv)
            assertEquals(1,tv?.size)
        }
    }
}