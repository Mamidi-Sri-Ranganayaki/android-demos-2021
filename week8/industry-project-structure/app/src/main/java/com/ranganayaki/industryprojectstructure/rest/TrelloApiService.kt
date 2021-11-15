package com.ranganayaki.industryprojectstructure.rest

import com.ranganayaki.industryprojectstructure.dto.OrganizationDto
import retrofit2.http.GET

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations() :  List<OrganizationDto>
}

interface TrelloBoardApi {
}

interface TrelloListApi {

}

interface TrelloCardApi {
}