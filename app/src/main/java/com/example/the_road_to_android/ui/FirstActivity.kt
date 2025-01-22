package com.example.the_road_to_android.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import com.example.the_road_to_android.R
import com.example.the_road_to_android.databinding.FirstLayoutBinding
class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: FirstLayoutBinding  // 声明绑定类
        super.onCreate(savedInstanceState)
        binding = FirstLayoutBinding.inflate(layoutInflater)  // 使用绑定类初始化布局
        setContentView(binding.root)  // 设置内容视图

        // 使用绑定类访问按钮
        binding.buttonPanel.setOnClickListener {
            Toast.makeText(this, "启动", Toast.LENGTH_SHORT).show()
            finish()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.add_id->Toast.makeText(this, "启动2", Toast.LENGTH_SHORT).show()
            R.id.remove_item-> Toast.makeText(this, "启动3", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}