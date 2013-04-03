package com.github.tkmtmkt.study

import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._

object Main extends App
{
  val cmd = if ( args.length > 0 ) { args(0) } else { "" }

  lazy val coll = MongoConnection()("test")("hoge")

  cmd match {
    case "insert" => { insert }
    case "select" => { select }
    case "update" => { update }
    case "delete" => { delete }
    case _ => { println("usage: (insert|select|update|delete)") }
  }

  def insert {
    val count = coll.count().toInt
    (1 to 100000).foreach( i =>
        coll += MongoDBObject(
          "no"->(count + i),
          "name"->"デッカード・ケイン",
          "address"->"トリストラム"
        )
    )
    println( coll.count() + " 件")
  }

  def select {
    val count = coll.count().toInt
    val cursor = coll.find( DBObject.empty, DBObject("_id"->0) ).skip(count - 10).limit(10)
    cursor.foreach( println )
    println( count + " 件")
  }

  def update {
  }

  def delete {
    coll.drop()
  }
}
