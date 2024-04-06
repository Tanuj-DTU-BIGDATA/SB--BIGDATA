import scala.util.control.Breaks

object April04 {
  def main(args: Array[String]): Unit = {
      var n : Int = 4
      for( i <- 1 to 2*n -1)
        {
          if( i <= n)
            {
              for(j <- 1 to i)
                {
                  print("*")
                }
            }
          else if(i > n)
          {
            for( j <- 1 to 2*n - i)
              {
                print("*")
              }
          }
          println()
        }

  }
}
