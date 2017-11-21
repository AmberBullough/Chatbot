
package chat.view;

import chat.controller.ChatController;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton exitButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	private JTextField inputField;
	private JTextArea chatArea;

	/**
	 * Initializes GUI data members, also calling Panel, layout, and listeners methods
	 * @param baseController
	 */
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;

		// initialize GUI data members
		chatButton = new JButton("chat");
		exitButton = new JButton("Exit");
		randomButton = new JButton("Random, Click me");
		checkerButton = new JButton("check");
		baseLayout = new SpringLayout();

		inputField = new JTextField(25);
		chatArea = new JTextArea(10, 25);

		setupPanel();
		setupLayout();
		setupListeners();

	}

	/**
	 * sets up the window with color,layout, and adds components to the ChatFrame
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		//buttons
		this.add(chatButton);
		this.add(exitButton);
		this.add(randomButton);
		this.add(checkerButton);
		
		//text area
		this.add(inputField);
		this.add(chatArea);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);

	}

	/**
	 * the constraint on the components on the Frame
	 */
	private void setupLayout()
	{
		// TextArea
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, chatArea);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 20, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatArea, -25, SpringLayout.EAST, this);

		// TextField
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, 0, SpringLayout.SOUTH, chatButton);

		// buttons
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -34, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 0, SpringLayout.NORTH, exitButton);
		baseLayout.putConstraint(SpringLayout.WEST, exitButton, 0, SpringLayout.WEST, chatButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, exitButton, -6, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, -5, SpringLayout.WEST, chatArea);
	}

	/**
	 * Listening for the components to take action once they are clicked
	 */
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = baseController.interactWithChatbot(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});

		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = baseController.useCheckers(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});

		exitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeRandomColor();
			}

		});

		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeRandomColor();
			}
		});
	}

	/**
	 * A method to change the Background color of the Frame
	 */
	private void changeRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);

		this.setBackground(new Color(red, green, blue));
	}
}
