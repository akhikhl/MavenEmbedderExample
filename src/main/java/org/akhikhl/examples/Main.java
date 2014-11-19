package org.akhikhl.examples;

import org.apache.maven.cli.MavenCli;

class Main {
  public static void main(String[] args) {
    System.out.println("Before calling embedded maven");
    MavenCli cli = new MavenCli();
    cli.doMain(
      new String[]{ "package", "exec:java" }, // maven command line
      System.getProperty("user.home") + "/anotherProject", // working dir
      System.out, // output stream
      System.err  // error stream
    );
    System.out.println("After calling embedded maven");
  }
}
