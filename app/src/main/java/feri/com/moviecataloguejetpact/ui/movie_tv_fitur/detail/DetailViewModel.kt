package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.detail

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import feri.com.moviecataloguejetpact.FilmModel
import feri.com.moviecataloguejetpact.api.model.MovieModel
import feri.com.moviecataloguejetpact.api.model.TvModel
import feri.com.moviecataloguejetpact.data.DataManager
import feri.com.moviecataloguejetpact.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class DetailViewModel @ViewModelInject constructor(
    private val dataManager: DataManager
) : ViewModel() {

    val datamovies: MutableLiveData<Resource<MovieModel>> by lazy {
        MutableLiveData<Resource<MovieModel>>()
    }

    val dataTvShows: MutableLiveData<Resource<TvModel>> by lazy {
        MutableLiveData<Resource<TvModel>>()
    }

    fun getDataTv(tvId : String) = viewModelScope.launch(Dispatchers.IO) {
        dataTvShows.postValue(Resource.loading(null))
        dataManager.getTv(tvId).let {
            try {
                if (it.isSuccessful) {
                    dataTvShows.postValue(Resource.success(it.body()))
                } else {
                    dataTvShows.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } catch (e: Exception) {
                dataTvShows.postValue(Resource.error(e.message.toString(), null))
            }
        }
    }

    fun getDataMovie(movieId : String) = viewModelScope.launch(Dispatchers.IO) {
        datamovies.postValue(Resource.loading(null))
        dataManager.getMovie(movieId).let {
            try {
                if (it.isSuccessful) {
                    datamovies.postValue(Resource.success(it.body()))
                } else {
                    datamovies.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } catch (e: Exception) {
                datamovies.postValue(Resource.error(e.message.toString(), null))
            }
        }
    }

}
