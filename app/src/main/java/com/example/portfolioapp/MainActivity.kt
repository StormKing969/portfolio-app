package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.portfolioapp.cv.CVFragment
import com.example.portfolioapp.home.HomeFragment
import com.example.portfolioapp.testimonial.TestimonialFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        setTestimonialFragment();
        // setCVFragment()
        // setHomeFragment();
    }

    private fun setTestimonialFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container, TestimonialFragment()).commit()
    }

    private fun setCVFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container, CVFragment()).commit()
    }

    private fun setHomeFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
    }
}