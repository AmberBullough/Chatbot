package chatbot.controller;

import chatbot.view.PopupDisplay;

public class chatbotRunner 
{
 public static void main(String []args)
 {
	 chatbotController chatbot= new chatbotController();
	 chatbot.start();
	// PopupDisplay sample = new PopupDisplay();
	// sample.displayText("Badger");
	// sample.collectResponse("Mushroom, Mushroom."); 
 }
}
