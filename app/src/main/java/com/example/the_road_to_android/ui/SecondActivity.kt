package com.example.the_road_to_android.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.the_road_to_android.R
import com.example.the_road_to_android.databinding.ActivitySecondBinding
import com.example.the_road_to_android.databinding.FirstLayoutBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding  // 声明绑定类
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)  // 使用绑定类初始化布局
        setContentView(binding.root)  // 设置内容视图
        /*
        * val extraData=intent.getStringExtra("extra_data")
        Log.d("SecondActivity","extra data if $extraData")
        println("sdjsjjs")
        *
        *
        * */
        binding.button2.setOnClickListener{
            var intent=Intent()
            intent.putExtra("return","I am come back")
            setResult(RESULT_OK,intent)
            finish()
        }
    }

}