package com.ranganayaki.industryprojectstructure.dao

import androidx.room.Dao
import androidx.room.Insert
import com.ranganayaki.industryprojectstructure.domain.Organization

@Dao
interface OrganizationDao {
    @Insert
    fun createOrganization(organization: Organization)
}