package home

import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._

object Main extends App
{
  val coll = MongoConnection()("test")("hoge")

  coll.drop()
  (1 to 100000).foreach( i =>
      coll += MongoDBObject(
        "no"->i,
        "name"->"デッカード・ケイン",
        "address"->"トリストラム"
      )
  )
  println( coll.count() )
}

