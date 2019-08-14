package com.example.schoolapp

class ItemsNewFeed {
    var imageProfileResource : Int? = null
    var username : String? = null
    var postTime : String? =null
    lateinit var content : String
    var imageContentResource : Int? = null
    lateinit var price : String
    var checkHeart : Boolean? = false

    constructor(imageProfile : Int, username : String, postTime : String, content: String, imageContentResource : Int,
                price : String, checkHeart : Boolean){
        this.imageContentResource = imageContentResource
        this.imageProfileResource = imageProfile
        this.username = username
        this.postTime = postTime
        this.content = content
        this.price = price
        this.checkHeart = checkHeart
    }
}