package com.quest.entity;

import java.io.Serializable;

public class WordItem implements Serializable {

	private static final long serialVersionUID = 6719104646263407511L;

	private String words;
	
	private String sound;

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String toString() {
		return "WordItem [words=" + words + ", sound=" + sound + "]";
	}
}
