package com.ranganayaki.industryprojectstructure.db

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface OrganizationDao{
    @Insert
    fun addOrganization(org : OrganizationDao)

}

@Dao
interface BoardDao{
    @Insert
    fun addBoard(brd : BoardDao)
}

@Dao
interface ListDao{
    @Insert
    fun addList(lst : ListDao)
}

@Dao
interface CardDao{
    @Insert
    fun addCard(card : CardDao)
}