package com.akirachix.blogreaderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvAuthors.layoutManager=LinearLayoutManager(this)
        displayAuthors()
        }

    fun displayAuthors(){
        val author1=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author2=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author3=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author4=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author5=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author6=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author7=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author8=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author9=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author10=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author11=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author12=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author13=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author14=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author15=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")
        val author16=Blog("Maury Tweri","A life not lived","20/01/2011","A life not lived","A doll's House","More..","New summary")

         val myAuthors= listOf(author1,author2,author3,author4,author5,author6,author7,author8,author9,author10,author11,author12,author13,author14,author15,author16)
        val blogAdapter=BlogAdapter(myAuthors)
        binding.rvAuthors.adapter=blogAdapter
    }
}