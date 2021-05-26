package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import dagger.hilt.android.AndroidEntryPoint
import feri.com.moviecataloguejetpact.R
import feri.com.moviecataloguejetpact.api.ApiServices
import feri.com.moviecataloguejetpact.databinding.FragmentDetailMovieBinding
import feri.com.moviecataloguejetpact.utils.Status
import javax.inject.Inject

@AndroidEntryPoint
class DetailMovieFM @Inject constructor() : Fragment() {

    private val vm: DetailViewModel by activityViewModels()
    private var binding: FragmentDetailMovieBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailMovieBinding.inflate(inflater, container, false)
        return binding?.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            if (it.getString("type", "").equals("tv")) {
                vm.getDataTv(it.getString("id", ""))
            } else {
                vm.getDataMovie(it.getString("id", ""))
            }
        }

        with(requireActivity()) {
            vm.datamovies.observe(viewLifecycleOwner, {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading(true)
                    }
                    Status.SUCCESS -> {
                        showLoading(false)
                        it.data?.let {
                            bindsData(
                                it.title.orEmpty(),
                                it.backdropPath.orEmpty(),
                                it.posterPath.orEmpty(),
                                it.overview.orEmpty(),
                                (it.genres ?: ArrayList()).map { it?.name.orEmpty() },
                                it.releaseDate.orEmpty()
                            )

                            Log.d("",it.toString())
                        }
                    }
                    else -> {
                        showLoading(false)
                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_LONG).show()
                    }
                }
            })
            vm.dataTvShows.observe(viewLifecycleOwner, {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading(true)
                    }
                    Status.SUCCESS -> {
                        showLoading(false)
                        it.data?.let {
                            bindsData(
                                it.name.orEmpty(),
                                it.backdropPath.orEmpty(),
                                it.posterPath.orEmpty(),
                                it.overview.orEmpty(),
                                (it.genres ?: ArrayList()).map { it?.name.orEmpty() },
                                it.firstAirDate.orEmpty()
                            )
                            Log.d("",it.toString())
                        }
                    }
                    else -> {
                        showLoading(false)
                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_LONG).show()
                    }
                }
            })
            binding?.toolbar?.setNavigationOnClickListener { onBackPressed() }
        }
    }

    private fun showLoading(boolean: Boolean) {
        binding?.parent?.children?.forEach {
            when (it.id) {
                R.id.avi -> it.visibility = if (boolean) View.VISIBLE else View.GONE
                else -> it.visibility = if (boolean) View.GONE else View.VISIBLE
            }
        }

    }

    private fun bindsData(
        title: String,
        backdrop: String,
        poster: String,
        overview: String,
        genres: List<String>,
        tgl: String
    ) {
        binding?.let {
            it.title.text = title

            Glide.with(requireContext())
                .load(ApiServices.IMG_BASE_URL + backdrop)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(it.image)

            Glide.with(requireContext())
                .load(ApiServices.IMG_BASE_URL + poster)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(it.miniImage)

            it.desc.text = overview

            it.genre.text = genres.joinToString(separator = ", ", limit = 4, truncated = "...")

            it.tgl.text = tgl
        }
    }
}