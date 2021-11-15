package com.ranganayaki.industryprojectstructure.rest

import com.ranganayaki.industryprojectstructure.domain.Organization
import retrofit2.http.GET
import retrofit2.http.Query

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations() :  List<Organization>
}

interface TrelloBoardApi {
}

interface TrelloListApi {

}

interface TrelloCardApi {
}