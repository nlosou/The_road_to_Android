package com.example.the_road_to_android.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.the_road_to_android.R
import com.example.the_road_to_android.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {
    // 使用 registerForActivityResult 注册启动活动
    private val startForResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        // 在这里处理返回的结果
        if (result.resultCode == RESULT_OK) {
            val data = result.data?.getStringExtra("return")
            Log.d("FirstActivity","return data is $data")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FirstLayoutBinding.inflate(layoutInflater)  // 使用绑定类初始化布局
        setContentView(binding.root)  // 设置内容视图

        // 使用绑定类访问按钮----绑定事件
        binding.buttonPanel.setOnClickListener {

            Log.d("FirstActivity",this.toString())
            /*

            val data = "hello SecondActivity"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra_data", data)
            Toast.makeText(this, "启动", Toast.LENGTH_SHORT).show()
            // 使用注册的 ActivityResultLauncher 启动 SecondActivity
            startForResult.launch(intent)

             */
            var intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_id -> Toast.makeText(this, "启动2", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "启动3", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}