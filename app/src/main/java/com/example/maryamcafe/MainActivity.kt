package com.example.maryamcafe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview1:TextView=findViewById(R.id.textView)
        val textview2:TextView=findViewById(R.id.textView2)
        val textview3:TextView=findViewById(R.id.textView3)
        val textview4:TextView=findViewById(R.id.textView4)
        val textview5:TextView=findViewById(R.id.tot)
        val textview6:TextView=findViewById(R.id.num)
        val textview7:TextView=findViewById(R.id.textView6)

        val button:Button=findViewById(R.id.button)
        var h:String="     "
        var c:String="     "
        var co:String="     "

        val spinner1:Spinner=findViewById(R.id.spinner1)
        val spinner2:Spinner=findViewById(R.id.spinner2)
        val spinner3:Spinner=findViewById(R.id.spinner3)

        var total:Double=0.00
        var hot= arrayOf("     ","Mariam's Coffee","Hot Chocolate","Spanish Latte")
        var cold= arrayOf("     ","Iced Cinnamon Latte","Toffee Latte","Passion Fruit")
        var cookies= arrayOf("     ","Milk","Red Velvet","Double Chocolate")
        spinner1.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hot)
        spinner2.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cold)
        spinner3.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cookies)

        fun hotDrinks(){

            if(h=="Mariam's Coffee")total+=3.00
            else if (h=="Hot Chocolate")total+=2.00
            else if (h=="Spanish Latte") total+=2.50

        }
        fun coldDrinks(){
            if(c=="Iced Cinnamon Latte")total+=2.50
            else if (c=="Toffee Latte")total+=2.50
            else if (c=="Passion Fruit") total+=2.50

        }
        fun cookie(){
            if(co=="Milk")total+=1.00
            else if (co=="Red Velvet")total+=1.25
            else if (co=="Double Chocolate") total+=1.00

        }

        button.setOnClickListener { view->
            hotDrinks()
            coldDrinks()
            cookie()
            textview4.text="Thanks For Ordering From Mariam's Cafe"
            textview5.text="Total"
            textview6.text=total.toString()
            textview7.text="JD"
        }
        spinner1.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                h=hot.get(p2)

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        spinner2.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                c=cold.get(p2)

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spinner3.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                co=cookies.get(p2)

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }





}