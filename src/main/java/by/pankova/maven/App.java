package by.pankova.maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

/**
 * Hello world!
 *
 */
public class App 
{
  
  private static final Logger LOG = LogManager.getLogger(App.class);
  
    public static void main( String[] args )
    {
        LOG.error( "Hello World! " + new SuperMath().pow(42));
    }
}




