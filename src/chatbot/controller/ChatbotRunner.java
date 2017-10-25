package chatbot.controller;

import chatbot.view.PopupDisplay;

public class ChatbotRunner 
{
 public static void main(String []args)
 {
	 ChatbotController chatbot= new ChatbotController();
	 chatbot.start();
	// PopupDisplay sample = new PopupDisplay();
	// sample.displayText("Badger");
	// sample.collectResponse("Mushroom, Mushroom."); 
 }
}
