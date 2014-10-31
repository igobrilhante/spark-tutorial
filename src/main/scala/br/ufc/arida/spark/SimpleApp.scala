package br.ufc.arida.spark

/**

 * Author: Igo Brilhante
 * Date: 31/10/14
 * Time: 09:41
 */
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SimpleApp {

  def main(args: Array[String]) {
    val logFile = "/tmp/example.txt" // Should be some file on your system

    val conf = new SparkConf().setAppName("Simple Application")

    val sc = new SparkContext(conf)

    val logData = sc.textFile(logFile, 2).cache()

    val numAs = logData.filter(line => line.contains("a")).count()

    val numBs = logData.filter(line => line.contains("b")).count()

    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

  }

}
