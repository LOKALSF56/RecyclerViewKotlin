package id.utbandung.recyclerview

import android.content.ClipData.Item
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var recyclerView : RecyclerView?= null
    private var ListAdapter : RecyclerViewBIC?= null
    private var Itemtitle = mutableListOf<BudimanBIC>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Itemtitle = ArrayList()
        recyclerView = findViewById<View>(R.id.ListFilm) as RecyclerView
        ListAdapter =  RecyclerViewBIC(this@MainActivity,Itemtitle)
        val LayoutMGR : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = LayoutMGR
        recyclerView!!.adapter=ListAdapter

        ListBCB()
    }
    private fun ListBCB() {
        var dashboard = BudimanBIC("Dashboard BIC",R.drawable.bic)
        Itemtitle.add(dashboard)
        var seatBIC = BudimanBIC("SeatBIC",R.drawable.seatbic)
        Itemtitle.add(seatBIC)
        var busbcb = BudimanBIC("Bus Best In Class",R.drawable.bcbbic)
        Itemtitle.add(busbcb)
    }
}