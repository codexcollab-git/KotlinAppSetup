package com.lokesh.appsetup.ui.module.xmlview.categories.offline.mapper

import com.lokesh.appsetup.room.entity.CategoriesEntity

class CategoriesMapper {

    fun mapCategoriesToCategoriesEntity(list: List<String>?): List<CategoriesEntity> {
        if (list.isNullOrEmpty()) return arrayListOf()
        return list.map { CategoriesEntity(name = it) }
    }

    fun mapCategoriesEntityToCategories(list: List<CategoriesEntity>?): List<String> {
        if (list.isNullOrEmpty()) return arrayListOf()
        return list.map { it.name }
    }
}