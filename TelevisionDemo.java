package com.ahmi.tutoringclass;
import java.util.Scanner;
public class TelevisionDemo {

	/**
	This class demonstrates the Television class.
	*/
	public static void main(String[] args) {
	// Create a Scanner object to read from the keyboard
	Scanner keyboard = new Scanner (System.in);
	// Declare variables
	int channel; // The user's channel choice
	// Declare and instantiate a television object
	Television bigScreen = new Television("Toshiba", 55);
	// Turn the power on
	bigScreen.power(false);
	// Display the state of the television
	System.out.println("A " +
	bigScreen.getSCREEN_SIZE() +
	" inch " +
	bigScreen.getMANUFACTURER() +
	" has been turned on.");
	// Prompt the user for input and store into station
	System.out.print("What channel do you want? ");
	channel = keyboard.nextInt();
	// Change the channel on the television
	bigScreen.setChannel(channel);
	// Increase the volume of the television
	bigScreen.increaseVolume(bigScreen.volume);
	// Display the the current channel and volume of the television
	System.out.println("Channel: " +
	bigScreen.getChannel() +
	" Volume: " +
	bigScreen.getVolume());
	System.out.println("Too loud! Lowering the volume.");
	// Decrease the volume of the television
	bigScreen.decreaseVolume(bigScreen.volume);
	bigScreen.decreaseVolume(bigScreen.volume);
	bigScreen.decreaseVolume(bigScreen.volume);
	bigScreen.decreaseVolume(bigScreen.volume);
	bigScreen.decreaseVolume(bigScreen.volume);
	bigScreen.decreaseVolume(bigScreen.volume);
	// Display the the current channel and volume of the television
	System.out.println("Channel: " +
	bigScreen.getChannel() +
	" Volume: " +
	bigScreen.getVolume());
	System.out.println();
	
	Television portable = new Television("Sharp", 19);
	portable.power(false);
	System.out.println("A " + portable.getSCREEN_SIZE2() + " inch " + portable.getMANUFACTURER2() + " has been turned on.");
	System.out.println("Please select a channel.");
	channel = keyboard.nextInt();
	keyboard.close();
	portable.decreaseVolume(portable.volume);
	portable.decreaseVolume(portable.volume);
	System.out.println("Channel is: " + portable.getChannel());	
	System.out.println("Volume is: " + portable.getVolume());
	}
}

	

