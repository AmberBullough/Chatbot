package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.tests.FrameTest;
import chat.tests.ControllerTest;
import chat.tests.AllTests;
import chat.tests.ChatbotTest;

public class ChatController 
{ 
	private Chatbot chatbot;
	//private Chatframe appFrame;
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
		 response = display.collectResponse(response);
	 }
	}
	
	public String interactWithChatbot(String input)
	{
		
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays ="";
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
	}
	
	public Chatbot testGetChatbot()
	{
		
	}
	
	public PopupDisplay
	{
		
	}
	
	public ChatFrame testGetChatFrame()
	{
	
	}
	
}
