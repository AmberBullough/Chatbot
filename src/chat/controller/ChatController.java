package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.tests.FrameTest;
import chat.tests.ControllerTest;
import chat.tests.AllTests;
import chat.tests.ChatbotTest;
import chat.view.ChatFrame;
import chat.model.CTECTwitter;

public class ChatController 
{ 
	private Chatbot chatbot;
	private ChatFrame appFrame;
	private PopupDisplay display;
	private CTECTwitter myTwitter;
	
	public ChatController() 
	{
		chatbot = new Chatbot("Silly Chatbot");
		myTwitter = new CTECTwitter(this);
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}

	public void start()
	{
	 String response = display.collectResponse("What do you want to talk about?" + "\n");
	 
	 while (chatbot.lengthChecker(response)&& !chatbot.quitChecker(response))
	 {
		 response = popupChat(response);
		 response = display.collectResponse(response);
	 }
	}
	
	public String interactWithChatbot(String input)
	{
		String response = "What do you do?";
		
		if (chatbot.quitChecker(input))
		{
			close();
		}
	
		response += "\n" + chatbot.processConversation(input);

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
	
	private void close()
	{
		System.exit(0);
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
	public void handleErrors(Exception error)
	{
		display.displayText(error.getMessage());
	}
	public void tweet(String text)
	{
		myTwitter.sendTweet(text);
	}
}
