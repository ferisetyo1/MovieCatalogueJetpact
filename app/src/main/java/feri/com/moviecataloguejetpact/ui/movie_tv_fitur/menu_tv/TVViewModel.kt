package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.menu_tv

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import feri.com.moviecataloguejetpact.api.model.TvModel
import feri.com.moviecataloguejetpact.data.DataManager
import feri.com.moviecataloguejetpact.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class TVViewModel @ViewModelInject constructor(
    private val dataManager: DataManager
) : ViewModel() {

    //utility
    val isGrid: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>().apply {
            this.value = true
        }
    }

    val dataTvShows: MutableLiveData<Resource<List<TvModel>>> by lazy {
        MutableLiveData<Resource<List<TvModel>>>()
    }

    fun getDataTv() = viewModelScope.launch(Dispatchers.IO) {
        dataTvShows.postValue(Resource.loading(null))
        dataManager.getDiscoverTv().let {
            try {
                if (it.isSuccessful) {
                    dataTvShows.postValue(Resource.success(it.body()?.results))
                } else {
                    dataTvShows.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } catch (e: Exception) {
                dataTvShows.postValue(Resource.error(e.message.toString(), null))
            }
        }
    }

    fun searchTv(query: String, job: Job) = viewModelScope.launch(job + Dispatchers.IO) {
        dataTvShows.postValue(Resource.loading(null))
        dataManager.getSearchTv(query).let {
            try {
                if (it.isSuccessful) {
                    dataTvShows.postValue(Resource.success(it.body()?.results))
                } else {
                    dataTvShows.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } catch (e: Exception) {
                dataTvShows.postValue(Resource.error(e.message.toString(), null))
            }
        }
    }

    var searchTvJob = Job()
    fun searchTv(s: String) {
        searchTvJob.cancel()
        searchTvJob = Job()
        if (s.isEmpty()) {
            getDataTv()
        } else {
            searchTv(s, searchTvJob)
        }
    }

}
