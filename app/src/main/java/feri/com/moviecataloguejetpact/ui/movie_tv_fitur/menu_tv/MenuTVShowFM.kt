package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.menu_tv

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import feri.com.moviecataloguejetpact.R
import feri.com.moviecataloguejetpact.api.model.TvModel
import feri.com.moviecataloguejetpact.databinding.FragmentMenuTvshowFMBinding
import feri.com.moviecataloguejetpact.ui.movie_tv_fitur.MainActivity
import feri.com.moviecataloguejetpact.utils.Status

@AndroidEntryPoint
class MenuTVShowFM : Fragment(), AdapterTvShow.ActionAdapterTvShow {

    private val vm: TVViewModel by activityViewModels()
    private var binding: FragmentMenuTvshowFMBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuTvshowFMBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setToolbar()

        val adapter = AdapterTvShow(this@MenuTVShowFM);
        binding?.rvTvshow?.adapter = adapter
        vm.getDataTv()
        vm.dataTvShows.observe(viewLifecycleOwner, Observer {
            if (it.status == Status.LOADING) {
                binding?.avi?.show()
                binding?.rvTvshow?.visibility = View.GONE
                binding?.notFound?.visibility = View.GONE
            } else if (it.status == Status.SUCCESS) {
                binding?.avi?.hide()
                binding?.rvTvshow?.visibility = View.VISIBLE
                it.data?.let { it1 -> adapter.replace(it1)
                    it1.forEach { it2 -> Log.d("", it2.toString()) }}
                binding?.notFound?.visibility = when (adapter.itemCount > 0) {
                    true -> View.GONE
                    else -> View.VISIBLE
                }
            } else {
                binding?.avi?.hide()
                Snackbar.make(binding?.root!!, it.message.toString(), Snackbar.LENGTH_SHORT).show()
            }
        })
        vm.isGrid.observe(viewLifecycleOwner, Observer {
            adapter.isGrid = it
            if (it) {
                binding?.rvTvshow?.layoutManager = GridLayoutManager(requireContext(), 2).apply {
                    isUsingSpansToEstimateScrollbarDimensions = true
                    orientation = GridLayoutManager.VERTICAL
                }
            } else {
                binding?.rvTvshow?.layoutManager = LinearLayoutManager(
                    requireContext(),
                    LinearLayoutManager.VERTICAL,
                    false
                )
            }
        })
    }

    private fun setToolbar() {
        binding?.topAppBar?.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.show -> {
                    if (vm.isGrid.value!!) {
                        vm.isGrid.value = false
                        it.setIcon(R.drawable.ic_baseline_list_24)
                    } else {
                        vm.isGrid.value = true
                        it.setIcon(R.drawable.ic_baseline_apps_24)
                    }
                    true
                }
                R.id.app_bar_search -> {
                    (it.actionView as SearchView).apply {
                        requestFocus()
                        this.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                            override fun onQueryTextSubmit(query: String?): Boolean {
                                vm.searchTv(query.toString())
                                return true
                            }

                            override fun onQueryTextChange(newText: String?): Boolean {
                                vm.searchTv(newText.toString())
                                return true
                            }

                        })
                    }
                    true
                }
                else -> false
            }
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun clickedItem(model: TvModel) {
        (requireActivity() as MainActivity).changePage(R.id.action_menuTVShowFM_to_detail_movie, Bundle().apply {
            putString("id", model.id.toString())
            putString("type", "tv")
        })
    }
}