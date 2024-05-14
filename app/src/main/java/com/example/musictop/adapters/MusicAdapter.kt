package com.example.musictop.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musictop.databinding.MusicTopItemBinding
import com.example.musictop.entities.Music

private val TAG = MusicAdapter::class.java.simpleName

class MusicAdapter : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    lateinit var onItemClickListener: (Music) -> Unit

    //Atributo de clase
    var musics = mutableListOf<Music>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MusicAdapter.MusicViewHolder {

        val bindingItem =
            MusicTopItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MusicViewHolder(bindingItem)
    }

    override fun onBindViewHolder(holder: MusicAdapter.MusicViewHolder, position: Int) {
        val earthquake: Music = musics[position]
        holder.bind(earthquake)
    }

    override fun getItemCount(): Int {
        return musics.size
    }

    inner class MusicViewHolder(private var bindingItem: MusicTopItemBinding) :
        RecyclerView.ViewHolder(bindingItem.root) {

        fun bind(music: Music) {

            with(music) {
                bindingItem.txtNumber.text = number.toString()
                bindingItem.txtSongArtist.text = songArtist.toString()

            }
            bindingItem.root.setOnClickListener {
                if (::onItemClickListener.isInitialized)
                    onItemClickListener(music)
                else
                    Log.e(TAG, "onItemClickList is not initialized")

            }

//            bindingItem.txtMagnitude.text = earthquake.magnitude.toString()
//            bindingItem.txtLocation.text = earthquake.location
        }
    }

}