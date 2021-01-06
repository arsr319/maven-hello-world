package com.mycompany.app;
import software.amazon.codeguruprofilerjavaagent.Profiler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   new Profiler.Builder()
  .profilingGroupName("Maven-sample-project")
  .awsCredentialsProvider(myAwsCredentialsProvider) // optional
  .withHeapSummary(true) // optional - to start without heap profiling set to false or remove line
  .build().start();
        
        System.out.println( "Hello World!" );

        System.out.println("A NullPointerException is a drag...");
        Object myObject = null;
        /**
         * Checker prevents this from compiling...
         */
//        System.out.println("myObject: " + myObject.toString());
        /**
         * ... which is simply fantastic. It shows:
         *
         * error: [dereference.of.nullable] dereference of possibly-null
         * reference myObject
         *
         * http://checkerframework.org
         */
        System.out.println("... but thankfully, Checker has our back: http://checkerframework.org");
        

    }
    
}
