package com.ranganayaki.industryprojectstructure.db

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "Trello Workspace")
data class Trello(
    @ColumnInfo(name = "workspace_id")
    var id: String,

    @ColumnInfo(name = "workspace-name")
    var name: String,

    @ColumnInfo(name = "key")
    var key: String,

    @ColumnInfo(name = "token")
    var token: String
)

@Entity(tableName = "Trello Board")
data class TrelloBoard(
    @ColumnInfo(name = "board_id")
    var id: String,

    @ColumnInfo(name = "board-name")
    var name: String,

    @ColumnInfo(name = "key")
    var key: String,

    @ColumnInfo(name = "token")
    var token: String
)

@Entity(tableName = "Trello List")
data class TrelloList(
    @ColumnInfo(name = "list_id")
    var id: String,

    @ColumnInfo(name = "list-name")
    var name: String,

    @ColumnInfo(name = "key")
    var key: String,

    @ColumnInfo(name = "token")
    var token: String
)

@Entity(tableName = "Trello Card")
data class TrelloCard(
    @ColumnInfo(name = "card_id")
    var id: String,

    @ColumnInfo(name = "card_name")
    var name: String,

    @ColumnInfo(name = "key")
    var key: String,

    @ColumnInfo(name = "token")
    var token: String
)