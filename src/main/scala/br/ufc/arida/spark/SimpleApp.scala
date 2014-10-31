package br.ufc.arida.spark

/**

 * Author: Igo Brilhante
 * Date: 31/10/14
 * Time: 09:41
 */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {

  def main(args: Array[String]) {
    val logFile = args(0) // Should be some file on your system
    val output = args(1)

    val conf = new SparkConf().setAppName("Simple Application")

    val sc = new SparkContext(conf)

    val file = sc.textFile(logFile, 2)

    // word count
    val words = file.flatMap( line => line.split(" ") )
                    .map( word => (word, 1) )
                    .reduceByKey(_ + _)
                    .map( (x : (String, Int))  => x._1 + "\t" + x._2)
    // store the result
    words.saveAsTextFile(output)


  }

}
