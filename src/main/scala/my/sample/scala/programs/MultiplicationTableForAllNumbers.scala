package my.sample.scala.programs

object MultiplicationTableForAllNumbers {
  
  def main(args: Array[String]) {
   val tableSize = args(0).toInt
   MultiplicationTablePrint(tableSize)
  }
  def MultiplicationTablePrint(tableSize:Int) {
        // first print the top header row
        System.out.format("      ")
        for(i<-1 to tableSize) {
            System.out.format(f"$i%4d")
        }
        println(" ")
        println("----------------------------------------------")   
         for(i<-1 to tableSize) {
            // print left most column first
            System.out.format(f"$i%4d |")
            for(j<-1 to tableSize){
              var m = i*j
                System.out.format(f"$m%4d")
            }
            println();
        }
    } 
}