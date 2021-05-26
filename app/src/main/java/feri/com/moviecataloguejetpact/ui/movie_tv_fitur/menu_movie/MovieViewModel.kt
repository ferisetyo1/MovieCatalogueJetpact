package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.menu_movie

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import feri.com.moviecataloguejetpact.FilmModel
import feri.com.moviecataloguejetpact.api.model.MovieModel
import feri.com.moviecataloguejetpact.data.DataManager
import feri.com.moviecataloguejetpact.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MovieViewModel @ViewModelInject constructor(
    private val dataManager: DataManager
) : ViewModel() {

    //utility
    val isGrid: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>().apply {
            this.value = true
        }
    }

    val datamovies: MutableLiveData<Resource<List<MovieModel>>> by lazy {
        MutableLiveData<Resource<List<MovieModel>>>()
    }

    fun getDataMovie() = viewModelScope.launch (Dispatchers.IO) {
        datamovies.postValue(Resource.loading(null))
        dataManager.getDiscoverMovie().let {
            try {
                if (it.isSuccessful) {
                    datamovies.postValue(Resource.success(it.body()?.results))
                } else {
                    datamovies.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } catch (e: Exception) {
                datamovies.postValue(Resource.error(e.message.toString(), null))
            }
        }
    }

    val selectedFilm: MutableLiveData<FilmModel> by lazy {
        MutableLiveData<FilmModel>()
    }

    fun searchMovie(query: String, job: Job) = viewModelScope.launch(job + Dispatchers.IO) {
        datamovies.postValue(Resource.loading(null))
        dataManager.getSearchMovie(query).let {
            try {
                if (it.isSuccessful) {
                    datamovies.postValue(Resource.success(it.body()?.results))
                } else {
                    datamovies.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } catch (e: Exception) {
                datamovies.postValue(Resource.error(e.message.toString(), null))
            }
        }
    }

    var searchMovieJob = Job()
    fun searchMoview(s: String) {
        searchMovieJob.cancel()
        searchMovieJob = Job()
        if (s.isEmpty()) {
            getDataMovie()
        } else {
            searchMovie(s, searchMovieJob)
        }
    }

}
