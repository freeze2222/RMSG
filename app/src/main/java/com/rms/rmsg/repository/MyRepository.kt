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
        list[page][column].add(i)
        item++
        if (item==5){
            item=0
            list[page].add(mutableListOf<PagerModel>())
            column++
        }


    }
    Log.e("DEBPAGE", page.toString())
    Log.e("DEBCOLUMN", column.toString())
    Log.e("DEBITEM", item.toString())
    Log.e("Deb", list.toString())
    return list
}

fun getAllPagerModels(): List<PagerModel> {
    return listOf(
        PagerModel("Test1", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test3", "123"),
        PagerModel("Test4", "12356"),
        PagerModel("Test5", "12356"),
        PagerModel("Test6", "12356"),
        PagerModel("Test7", "123"),
        PagerModel("Test8", "12356"),
        PagerModel("Test9", "123"),
        PagerModel("Test10", "123"),
        PagerModel("Test11", "123"),
        PagerModel("Test12", "12356"),
        PagerModel("Test13", "123"),
        PagerModel("Test14", "12356"),
        PagerModel("Test15", "12356"),
        PagerModel("Test16", "12356"),
        PagerModel("Test17", "123"),
        PagerModel("Test18", "12356"),
        PagerModel("Test19", "123"),
        PagerModel("Test20", "123"),
        PagerModel("Test1", "123"),
        PagerModel("Test2", "12356"),
        PagerModel("Test3", "123"),
        PagerModel("Test4", "12356"),
        PagerModel("Test5", "12356"),
        PagerModel("Test6", "12356"),
        PagerModel("Test7", "123"),
        PagerModel("Test8", "12356"),
        PagerModel("Test9", "123"),
        PagerModel("Test10", "123")
    )
}