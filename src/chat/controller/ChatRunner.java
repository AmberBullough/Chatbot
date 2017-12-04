package chat.controller;

import chat.view.PopupDisplay;


public class ChatRunner 
{
 public static void main(String []args)
 {
	 ChatController chatbot = new ChatController();
	 chatbot.start();
	// PopupDisplay sample = new PopupDisplay();
	// sample.displayText("Badger");
	// sample.collectResponse("Mushroom, Mushroom."); 
 }
}
