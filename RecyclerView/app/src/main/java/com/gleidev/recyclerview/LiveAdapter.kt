package com.gleidev.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gleidev.recyclerview.model.Live
import kotlinx.android.synthetic.main.res_item_live.view.*

class LiveAdapter(private val onItemClicked:(Live)->Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Live> = ArrayList()

    //Criar um RecyclerView.ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LiveViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_live, parent, false)
        )
    }

    //Popula as informações na lista
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is LiveViewHolder -> {
                //add no holder o item na posição
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    //Informa quantos items serão mostrados
    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet (lives : List<Live>){
        this.items = lives
    }

    class LiveViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val liveTitle = itemView.title
        private val liveAuthor = itemView.author
        private val liveTumbnail = itemView.thumbnail

        //Seta a informação da Model e colocar no item do layout do RecyclerView
        fun bind(live: Live, onItemClicked: (Live) -> Unit){
            liveTitle.text = live.title
            liveAuthor.text = live.author

            val requestOptions =  RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(live.thumbnaiUrl)
                .into(liveTumbnail)

            itemView.setOnClickListener{
                onItemClicked(live)
            }
        }
    }
}