package com.example.yetniel_rama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var cowokImage: ImageView

    lateinit var cewekImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cariButton: Button=findViewById(R.id.btn_cari)
        cariButton.setOnClickListener {
            cowok()
            cewek()
        }
        cowokImage=findViewById(R.id.cowok_image)
        cewekImage=findViewById(R.id.cewek_image)
    }

    private fun cowok() {
        val randomInt=Random.nextInt(20)+1
        val drawableResource=when(randomInt){
            1->R.drawable.a
            2->R.drawable.b
            3->R.drawable.c
            4->R.drawable.d
            5->R.drawable.e
            6->R.drawable.f
            7->R.drawable.g
            8->R.drawable.h
            9->R.drawable.i
            10->R.drawable.j
            11->R.drawable.k
            12->R.drawable.l
            13->R.drawable.m
            14->R.drawable.n
            15->R.drawable.o
            16->R.drawable.p
            17->R.drawable.q
            18->R.drawable.r
            19->R.drawable.s
            else->R.drawable.t
        }
        cowokImage.setImageResource(drawableResource)
    }
    private fun cewek(){
        val randomInt=Random.nextInt(7)+1
        val drawableResource=when(randomInt){
            1->R.drawable.aa
            2->R.drawable.bb
            3->R.drawable.cc
            4->R.drawable.dd
            5->R.drawable.ee
            6->R.drawable.ff
            else->R.drawable.gg
        }
        cewekImage.setImageResource(drawableResource)
    }
}