package com.example.sae_s4

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {

    var imageArray:ArrayList<Int> = ArrayList()
    var carouselView:CarouselView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //carousel
        imageArray.add(R.drawable.manege2)
        imageArray.add(R.drawable.manege3)
        imageArray.add(R.drawable.manege4)
        imageArray.add(R.drawable.peche_aux_canards)
        carouselView =findViewById (R.id.carousel)
        carouselView!!.pageCount = imageArray.size
        carouselView!!.setImageListener(imageListener)
    }

    //carousel
    var imageListener = ImageListener { position, imageView -> imageView.setImageResource(imageArray[position])}
}