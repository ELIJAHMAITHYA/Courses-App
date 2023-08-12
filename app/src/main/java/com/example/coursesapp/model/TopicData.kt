package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TopicData(
   @StringRes val name: Int,
   val quantity :Int,
   @DrawableRes val courseImage:Int,

)
