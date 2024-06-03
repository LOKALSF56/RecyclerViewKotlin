package id.utbandung.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewBIC constructor(private var getActivity: MainActivity, private val BICBCB :List<BudimanBIC>):
RecyclerView.Adapter<RecyclerViewBIC.MyViewHolder>(){
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val ItemTitle : TextView =itemView.findViewById(R.id.judul)
        val imgtitle : ImageView=itemView.findViewById(R.id.img)
        val cardView : CardView= itemView.findViewById(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.listfilm, parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return BICBCB.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.ItemTitle.text= BICBCB[position].title
        holder.imgtitle.setBackgroundResource(BICBCB[position].image)
        holder.cardView.setOnClickListener {
                Toast.makeText(getActivity,BICBCB[position].title, Toast.LENGTH_SHORT).show()
        }
    }
}