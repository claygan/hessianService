package com.quest.service.impl;

import org.springframework.stereotype.Service;

import com.quest.entity.WordItem;
import com.quest.service.HelloRemoteService;

@Service("helloRemoteService")
public class HelloServiceImpl implements HelloRemoteService {

	public void saySomething(String content) {
		System.out.println("I'm want say: "+content);
	}

	public WordItem listenWords(String words,String sound) {
		WordItem wordItem = new WordItem();
		wordItem.setWords(words);
		wordItem.setSound(sound);
		System.out.println(wordItem);
		return wordItem;
	}

}
