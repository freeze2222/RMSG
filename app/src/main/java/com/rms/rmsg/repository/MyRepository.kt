package com.rms.rmsg.repository

import android.util.Log
import com.rms.rmsg.ui.model.PagerModel

fun getPages(items: List<PagerModel>): MutableList<MutableList<MutableList<PagerModel>>> {
    val list = mutableListOf(mutableListOf(mutableListOf<PagerModel>()))
    var page = 0
    var column = 0
    var item = 0
    for (i in items) {
        if (column == 2) {
            column = 0
            list.add(mutableListOf<MutableList<PagerModel>>())
            page++
            list[page].add(mutableListOf())
        }
        if (item==5){
            item=0
            list[page].add(mutableListOf<PagerModel>())
            column++
        }

        list[page][column].add(i)
        item++
    }
    Log.e("DEB", mutableListOf("").toString())
    Log.e("DEB",list.toString())
    return list
}

fun getAllPagerModels(): List<PagerModel> {
    return listOf(
        PagerModel("Test", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test2", "12356"),
        PagerModel("Test2", "12356"),
        PagerModel("Test", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test", "123"),
        PagerModel("Test", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test2", "12356"),
        PagerModel("Test2", "12356"),
        PagerModel("Test", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test", "123")
    )
}