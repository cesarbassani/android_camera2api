package com.example.android.camera2video

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
                    .replace(R.id.container, Camera2VideoFragment.newInstance())
                    .commit()
    }

}
