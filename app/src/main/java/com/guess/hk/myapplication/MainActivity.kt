package com.guess.hk.myapplication

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.graphics.Color
import android.support.constraint.ConstraintLayout
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)


		val mainLayout = findViewById<View>(R.id.mainLayout) as ConstraintLayout
		val arrat = intArrayOf(Color.BLACK,Color.YELLOW)
		val gd = GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, arrat)
		gd.setStroke(2, Color.WHITE)
		mainLayout.setBackgroundDrawable(gd)
//		val mainLayout1 = findViewById<View>(R.id.mainLayout2) as RelativeLayout
//		val gd2  = gd.mutate() as GradientDrawable;
//		gd2.colors = intArrayOf(Color.BLACK,Color.BLUE)
//		gd2.setStroke(8, )
//		mainLayout1.setBackgroundDrawable(gd2)
	}
}
