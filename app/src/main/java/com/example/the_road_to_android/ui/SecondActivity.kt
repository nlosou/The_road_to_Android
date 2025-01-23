package com.example.the_road_to_android.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.the_road_to_android.R
import com.example.the_road_to_android.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity()
{
    private lateinit var binding: ActivitySecondBinding  // 声明绑定类


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)  // 使用绑定类初始化布局
        setContentView(binding.root)  // 设置内容视图

        binding.button2.setOnClickListener {
            /*
        * val intent = Intent()
            val intent2 = Intent()
            intent.putExtra("return", "I am come back")
            setResult(RESULT_OK, intent)
            val extraData = intent2.getStringExtra("extra_data")
            Log.d("SecondActivity", "extra data if $extraData")
            println("sdjsjjs")
            finish()
        *
        *
        * */

            var intent=Intent(this,FirstActivity::class.java)
            startActivity(intent)

        }


        // 注册返回按钮回调
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // 在这里处理返回按钮的逻辑
                val intent = Intent()
                intent.putExtra("return", "I am come back")
                setResult(RESULT_OK, intent)
                finish()
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }
}
