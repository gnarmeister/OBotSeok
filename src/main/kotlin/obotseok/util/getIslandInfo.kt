package obotseok.util

import obotseok.api.HttpRequestHelper

suspend fun getIslandInfo(): List<String> {
    val targetString = HttpRequestHelper()
        .get("https://loawa.com/main/")
        .split("\n")
        .find {
            it.contains("<p class=\" text-theme-0")
        }!!

    return "<strong>.{1,10}</strong>"
        .toRegex()
        .findAll(targetString)
        .toList()
        .map {
            it.value.split("(<strong>)|(</strong>)".toRegex())[1]
        }
}