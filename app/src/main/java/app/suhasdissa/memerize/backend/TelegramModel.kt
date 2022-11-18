package app.suhasdissa.memerize.backend

import kotlinx.serialization.SerialName


data class TelegramModel(
    @SerialName("messages") var messages: ArrayList<Messages> = arrayListOf()

)

data class Messages(

    @SerialName("id") var id: Int,
    //@SerialName("media") var media: Media? = Media()

)
/*
data class Media(
    @SerialName("_") var type: String? = null
)
 */
//messageMediaDocument //messageMediaPhoto
// https://tg.i-c-a.su/media/eplussl/6057
//  https://tg.i-c-a.su/json/eplussl?limit=100
