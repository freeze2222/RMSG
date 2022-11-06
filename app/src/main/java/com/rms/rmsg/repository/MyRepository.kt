package com.rms.rmsg.repository

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
        }
        if (item==5){
            item=0
            list[page].add(mutableListOf<PagerModel>())
            column++
        }

        list[page][column].add(i)
        item++
    }
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
        PagerModel("Test", "123")
    )
}
