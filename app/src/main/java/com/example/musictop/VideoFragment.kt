package com.example.musictop

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import com.example.musictop.databinding.ActivityMainBinding
import com.example.musictop.databinding.FragmentVideoBinding
import com.example.musictop.entities.Music


class VideoFragment : Fragment() {

    private lateinit var binding: FragmentVideoBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =FragmentVideoBinding.inflate(inflater,container,false)
        return binding.root



    }


    @SuppressLint("SetJavaScriptEnabled")
    fun putVideo(music: Music) {
        val webView: WebView = binding.webView
        val videoUrl = music.link
        webView.loadData(videoUrl,"text/html","utf-8")

        webView.settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()

        webView.loadUrl(videoUrl)
    }
}