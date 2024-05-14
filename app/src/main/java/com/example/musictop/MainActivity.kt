package com.example.musictop

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musictop.adapters.MusicAdapter
import com.example.musictop.databinding.ActivityMainBinding
import com.example.musictop.entities.Music
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerMusicTop.layoutManager = LinearLayoutManager(this)
        initAdapter()
    }

    fun initAdapter() {
        val musicAdapter = MusicAdapter()
        binding.recyclerMusicTop.adapter = musicAdapter

        musicAdapter.musics = Music.dataMusics
        //musicAdapter.musics = Music.dataEmpty
        musicAdapter.onItemClickListener = { music ->
            Toast.makeText(this, music.songArtist, Toast.LENGTH_SHORT).show()

            sendEmailMusic(music)
            //sendWhatsappMusic(music)
        }

        if (musicAdapter.musics.isEmpty()) {
            binding.txtEmpty.visibility = View.VISIBLE
        } else {
            binding.txtEmpty.visibility = View.GONE
        }

    }


    private fun sendEmailMusic(music: Music) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "message/rfc822"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("llivanccgmail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "Music Top")
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "hello, I have an earthquake at ${music.songArtist} with magnitude ${music.number}"
        )

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(intent, "Send email"))
        } else {
            Toast.makeText(this, "The email could not be sent", Toast.LENGTH_SHORT).show()
        }
    }

    private fun sendWhatsappMusic(music: Music) {


    }
}