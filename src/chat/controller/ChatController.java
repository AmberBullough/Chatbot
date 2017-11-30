package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.tests.FrameTest;
import chat.tests.ControllerTest;
import chat.tests.AllTests;
import chat.tests.ChatbotTest;
import chat.view.ChatFrame;

public class ChatController 
{ 
	private Chatbot chatbot;
	private ChatFrame appFrame;
	private PopupDisplay display;
	
	public ChatController() 
	{
		chatbot = new Chatbot("Silly Chatbot");
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
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
		String response = "What do you do?";
			return response;
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays =""; //Assigns a valid value to a variable that will be returned for the method.
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
	}
	

	public String useCheckers(String text)
	{
		String response = "";
		if(chatbot.contentChecker(text))
		{
			response+= "This text matches the special content\n";
		}
		if (chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
		}
		//continue will all checkers except length and quit checker
		
		return response;
		
	}
	public Chatbot getChatbot()
	{
		return chatbot;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
	public ChatFrame getChatFrame()
	{
		return appFrame;
	}
	
}
