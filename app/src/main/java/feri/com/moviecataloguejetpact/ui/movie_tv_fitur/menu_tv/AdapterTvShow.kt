package feri.com.moviecataloguejetpact.ui.movie_tv_fitur.menu_tv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import feri.com.moviecataloguejetpact.R
import feri.com.moviecataloguejetpact.api.ApiServices
import feri.com.moviecataloguejetpact.api.model.TvModel
import kotlinx.android.synthetic.main.item_movie_grid.view.*
import kotlinx.android.synthetic.main.item_movie_list.view.*

class AdapterTvShow(val listener: ActionAdapterTvShow) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var isGrid: Boolean = true
        set(b) {
            field = b
            notifyDataSetChanged()
        }

    private var moviewList: List<TvModel> = ArrayList()

    inner class ViewGrid(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: TvModel) {
            itemView.apply {
                judulGrid.setText(model.name)
                Glide.with(context)
                    .load(ApiServices.IMG_BASE_URL + model.posterPath)
                    .placeholder(R.drawable.ic_baseline_movie_24)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(imgGrid)
            }
            itemView.setOnClickListener { listener.clickedItem(model) }
        }
    }

    inner class ViewList(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: TvModel) {
            itemView.apply {
                judul.setText(model.name)
                Glide.with(context)
                    .load(ApiServices.IMG_BASE_URL + model.posterPath)
                    .placeholder(R.drawable.ic_baseline_movie_24)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(img)
                storyline.text = model.overview
                storyline.isSelected = true
                year.text=model.firstAirDate
            }
//            itemView.setOnClickListener {
//                listener.clickedItem(model)
//            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            1 -> ViewGrid(
                LayoutInflater.from(parent.context).inflate(R.layout.item_movie_grid, parent, false)
            )
            else -> ViewList(
                LayoutInflater.from(parent.context).inflate(R.layout.item_movie_list, parent, false)
            )
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (isGrid) {
            true -> 1
            else -> 0
        }
    }

    override fun getItemCount(): Int {
        return moviewList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            1 -> (holder as ViewGrid).bind(moviewList.get(position))
            else -> (holder as ViewList).bind(moviewList.get(position))
        }
    }

    fun replace(list: List<TvModel>) {
        moviewList = list
        notifyDataSetChanged()
    }

    interface ActionAdapterTvShow {
        fun clickedItem(model: TvModel)
    }
}
