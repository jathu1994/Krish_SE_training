package com.jatha.designpatterns.singleton;

import java.io.IOException;

/** all gamers connected to a server in a multiplayer 
 * game are set by a common configuration for gunsounds     */

public class Application {

	public static void main(String[] args) {

		/*
		 * long start; long end;
		 */

		GlobalSoundProfile player1 = GlobalSoundProfile.getGlobalSoundProfile();
		System.out.println(player1);

		/* start = System.nanoTime(); */
		try {
			System.out.println(player1.getGunSound());
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * end = System.nanoTime(); System.out.println("player1 " + (end - start));
		 */

		GlobalSoundProfile player2 = GlobalSoundProfile.getGlobalSoundProfile();
		System.out.println(player2);
		
		/* start = System.nanoTime(); */
		try {
			System.out.println(player2.getGunSound());
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * end = System.nanoTime(); System.out.println("player2 " + (end - start));
		 */

	}

}
