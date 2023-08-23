package com.example.chatai.data

import com.example.chatai.constants.textCompletionEndPoint
import com.example.chatai.constants.textCompletionTurboEndPoint
import com.google.gson.JsonObject
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Streaming

interface OpenAIApi {
    @POST(textCompletionEndPoint)
    @Streaming
    fun textCompletionWithStream(@Body body: JsonObject): Call<ResponseBody>

    @POST(textCompletionTurboEndPoint)
    @Streaming
    fun textCompletionTurboWithStream(@Body body: JsonObject): Call<ResponseBody>
}