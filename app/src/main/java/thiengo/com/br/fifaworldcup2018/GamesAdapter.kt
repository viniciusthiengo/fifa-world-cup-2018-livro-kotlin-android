package thiengo.com.br.fifaworldcup2018

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import thiengo.com.br.fifaworldcup2018.domain.Game


class GamesAdapter(
    private val context: Context,
    private val games: List<Game>) :
    RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int ) : GamesAdapter.ViewHolder {

        val v = LayoutInflater
            .from(context)
            .inflate(R.layout.game, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int) {

        holder.setData( games[position] )

        /*
         * Código para a mudança de cor de background de item.
         * Algoritmo utilizado, pois é mais simples do que
         * utilizar o terceiro parâmetro de onCreateViewHolder()
         * e assim trabalhar com dois layouts.
         * */
        holder.itemView.setBackgroundColor(
            if( position % 2 == 0 )
                ContextCompat.getColor(context, R.color.colorItemEven)
            else
                ContextCompat.getColor(context, R.color.colorItemOdd)
        )
    }

    override fun getItemCount(): Int {
        return games.size
    }

    inner class ViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {

        val ivCountryA: ImageView
        val ivCountryB: ImageView
        val tvGroup: TextView
        val tvDateTime: TextView
        val tvStadium: TextView

        init {
            ivCountryA = itemView.findViewById(R.id.iv_country_a)
            ivCountryB = itemView.findViewById(R.id.iv_country_b)
            tvGroup = itemView.findViewById(R.id.tv_group)
            tvDateTime = itemView.findViewById(R.id.tv_date_time)
            tvStadium = itemView.findViewById(R.id.tv_stadium)
        }

        fun setData( game: Game ) {
            ivCountryA.setImageResource( game.countryA.flagResource )
            ivCountryA.contentDescription = game.countryA.name
            ivCountryB.setImageResource( game.countryB.flagResource )
            ivCountryB.contentDescription = game.countryB.name

            tvGroup.text = game.generateGroupLabel()
            tvDateTime.text = game.generateDateTimeLabel()
            tvStadium.text = game.stadium
        }
    }
}