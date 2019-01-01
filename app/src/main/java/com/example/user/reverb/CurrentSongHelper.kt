package com.example.user.reverb

class CurrentSongHelper{
    var songArtist : String?=null
    var songTitle : String?=null
    var songPath : String?=null
    var songId : Long = 0
    var currentPosition : Int = 0
    var isPlaying : Boolean = true
    var isLoop : Boolean = true
    var isShuffle : Boolean = true
    var trackPosition : Int = 0
}