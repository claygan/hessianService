package com.quest.service;

import com.quest.entity.WordItem;

public interface HelloRemoteService {
	void saySomething(String content);
	
	WordItem listenWords(String words,String sound);
}
