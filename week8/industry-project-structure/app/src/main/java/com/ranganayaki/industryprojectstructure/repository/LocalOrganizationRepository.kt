package com.ranganayaki.industryprojectstructure.repository

import com.ranganayaki.industryprojectstructure.dao.OrganizationDao
import com.ranganayaki.industryprojectstructure.domain.Organization
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalOrganizationRepository
@Inject
constructor(
    private val daoOrganization : OrganizationDao
) {
    suspend fun createOrganization(organization: Organization) = daoOrganization.createOrganization(organization)
}