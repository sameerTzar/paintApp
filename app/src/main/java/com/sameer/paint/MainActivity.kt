package com.sameer.paint


import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    private var paintView: MyCanvasView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        paintView = MyCanvasView(this)
        setContentView(paintView)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.clear -> {

                paintView?.clear()

                Toast.makeText(this, "Cleared", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.source -> {

                Toast.makeText(this, "Soon! Sorry for the inconvenience", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
        return true
    }


}
