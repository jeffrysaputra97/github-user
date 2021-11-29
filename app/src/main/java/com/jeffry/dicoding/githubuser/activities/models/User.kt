package com.jeffry.dicoding.githubuser.activities.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    //From List
    var id: Int = -1,
    var username: String = "JakeWharton",
    var avatarUrl: String = "",
    var profileUrl: String = "Profile URL: Google, Inc.",

    //From Detail
    var name: String = "Jake Wharton",
    var followers: Int = -1,
    var following: Int = -1,
    var followersUrl: String = "",
    var followingUrl: String = "",
    var publicRepos: Int = -1,
) : Parcelable
