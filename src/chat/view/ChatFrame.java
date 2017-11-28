package chat.view;

import chat.controller.ChatController;
import javax.swing.JFrame;


public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel firstPanel;
	

	public ChatFrame(ChatController baseController)
	{
		super();
		this.setBaseController(baseController);
		firstPanel = new ChatPanel(baseController);
		
		setupFrame();
	}
	

	private void setupFrame()
	{
		this.setContentPane(firstPanel);
		this.setTitle("Chatbot");
		this.setSize(600, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public ChatController getBaseController()
	{
		return baseController;
	}
	
	public void setBaseController(ChatController baseController)
	{
		this.baseController = baseController;
	}
}





