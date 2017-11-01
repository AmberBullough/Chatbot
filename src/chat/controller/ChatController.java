package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;

public class ChatController 
{ 
	private Chatbot chatbot;
	private Chatframe appFrame;
	private PopupDisplay display;
	
	public ChatController() 
	{
		chatbot = new Chatbot("Silly Chatbot");
		display = new PopupDisplay();
	}

	public void start()
	{
	 String response = display.collectResponse("What do you want to talk about?");
	 
	 while (chatbot.lengthChecker(response)&& !chatbot.quitChecker(response))
	 {
		 response = popupChat(response);
	 }
	}
	
	public String intertWithChatbot(String input)
	{
		
	}
	
	private String popupChat(String chat)
	{
		return null;
	}
	
	public Chatbot getChatbot()
	{
		
	}
	
	public PopupDisplay getDisplay()
	{
		
	}
	
	public ChatFrame getChatFrame()
	{
	
	}
	
}
