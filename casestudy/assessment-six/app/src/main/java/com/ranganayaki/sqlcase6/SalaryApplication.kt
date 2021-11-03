package com.ranganayaki.sqlcase6

import android.app.Application
import androidx.room.Room
import com.ranganayaki.sqlcase6.db.AppDatabase

class SalaryApplication : Application() {

    val db : AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "salary_database"
        ).fallbackToDestructiveMigration().build()
    }
}