package com.ranganayaki.industryprojectstructure.sqlite

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ranganayaki.industryprojectstructure.dao.OrganizationDao
import com.ranganayaki.industryprojectstructure.domain.Organization

@Database(entities = [Organization::class], version = 1)
abstract class IndustryProjectAppDb : RoomDatabase() {
    abstract fun organizationDao() : OrganizationDao
}