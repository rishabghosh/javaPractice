package com.step;

public class MegaBytesConverter {
  public static void main(String[] args){
  printMegaBytesAndKiloBytes(-1);
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes){
    String message;
    int megaBytes = kiloBytes/1024;
    int remainingKiloBytes = kiloBytes % 1024;
    message = kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + "KB";
    if(kiloBytes < 0){
      message = "Invalid Value";
    }
    System.out.println(message);
  }
}
