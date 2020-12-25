package com.jatha.designpatterns.singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** common sound profile for all players */

public class GlobalSoundProfile {

	public static volatile GlobalSoundProfile globalSoundProfile;
	public static volatile String gunSound;

	private GlobalSoundProfile() {
//		preventing from reflection frameworks creating instances
		if (globalSoundProfile != null) {
			throw new RuntimeException("please use getGlobalSoundProfile method");
		}

	}

	public static GlobalSoundProfile getGlobalSoundProfile() {

//		dual check to avoid multiple threads creating instances
		if (globalSoundProfile == null) {
//			locking to prevent other thread from entering the block before creation of an instance
			synchronized (GlobalSoundProfile.class) {
				if (globalSoundProfile == null) {
					globalSoundProfile = new GlobalSoundProfile();
				}
			}
		}
		return globalSoundProfile;
	}

	public String getGunSound() throws IOException {

		if (gunSound == null) {
			synchronized (GlobalSoundProfile.class) {
				if (gunSound == null) {
					FileReader fileReader = null;
					BufferedReader buffuredReader = null;
					try {
						fileReader = new FileReader("D://soundConfig.txt");
						buffuredReader = new BufferedReader(fileReader);

						String sound;

						while ((sound = buffuredReader.readLine()) != null) {
							gunSound = sound;

						}
					} finally {
						if (fileReader != null) {
							fileReader.close();
						}
						if (buffuredReader != null) {
							buffuredReader.close();
						}

					}
				}
			}

		}

		return gunSound;

	}

}
