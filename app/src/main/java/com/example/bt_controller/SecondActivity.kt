package com.example.bt_controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.bt_controller.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //this will hide the status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide() // this will hide the action bar

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pairBluetoothDevice?.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
        binding.aButtonId?.setOnClickListener {
            binding.textViewId?.setText("A is Clicked")
        }
        binding.bButtonId?.setOnClickListener {
            binding.textViewId?.setText("B is Clicked")
        }
        binding.xButtonId?.setOnClickListener {
            binding.textViewId?.setText("X is Clicked")
        }
        binding.yButtonId?.setOnClickListener {
            binding.textViewId?.setText("Y is Clicked")
        }

        //below code will ask for bluetooth permission if bluetooth is turned off
//        val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()
//        if (bluetoothAdapter == null) {
//            // Device doesn't support Bluetooth
//        }
//
//        if (bluetoothAdapter?.isEnabled == false) {
//            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
//            val REQUEST_ENABLE_BT = 0
//            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT)
//        }
    }
}
