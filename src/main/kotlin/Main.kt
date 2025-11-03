package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    //println(doc.title())

    // #id - поиск по id
    // .classname - поиск по классу
    // a, div - поиск по тегу

    val newsHeadLines: Elements = doc.select("#mp-itn b a")
    //println(newsHeadLines)

    for (healLine: Element in newsHeadLines) {
        println("${healLine.attr("title")}\n\t${healLine.attr("href")}")
    }
}