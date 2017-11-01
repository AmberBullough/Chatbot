package chat.model;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;

public class Chatbot
{
	private List<Movie> movieList;
	private List<String> shoppingList;
	private List<String> cuteAnimalMemes;
	private String [] verbs;
	private String [] topics;
	private String [] followUps;
	private String [] questions;
	private String username;
	private String content;
	private String intro;
	private LocalTime currentTime;
	
	public Chatbot(String username)
	{
		this.movieList = null;
		this.shoppingList = new ArrayList<String>();
		this.cuteAnimalMemes = null;
		this.currentTime = null;
		this.questions = new String [10];
		this.username = username;
		this.content = null;
		this.intro = null;
		this.currentTime = null;
		this.topics = new String[7];
		this.verbs = new String [4];
		this.followUps = new String [5];
		
		buildVerbs();
		buildShoppingList();
		buildCuteAnimals();
		//buildTopics();
		//buildFollowups();
		//buildQuestions();
		buildChatbotResponse();
	}
	
	private void buildVerbs()
	{
		verbs [0] = "like";
		verbs [1] = "dislike";
		verbs [2] = "am ambivalent about";
		verbs [3] = "am thinking about";
	}

	private void buildMovieList()	
	{
		
	}
	
	private void buildShoppingList()
	{
		shoppingList.add("snacks");
		shoppingList.add("veggies");
		shoppingList.add("protein");
		shoppingList.add("slug bait");
		shoppingList.add("gross things");
		
	}
	
	private void buildCuteAnimals()
	{
		cuteAnimalMemes.add("pupper");
		cuteAnimalMemes.add("otter");
		cuteAnimalMemes.add("kittie");
		cuteAnimalMemes.add("FLOOFER");
	}
	
	private void buildQuestions()
	{
		questions [0] = "What is your name?";
		questions [1] = "Which are cuter? Puppies or kittens?";
		questions [2] = "Do you like badgers?";
		questions [3] = "Am I a robot?";
		questions [4] = "How much wood could a woodchuck chuck if a woodchuck could chuck chucked wood?";
		questions [5] = "How many pickled peppers did Peter Piper pick?";
		questions [6] = "Is this question false?";
		questions [7] = "Are you there or are you square?";
		questions [8] = "Is Wheatly your friend?";
		questions [9] = "Which is heavier? 200 pounds of bricks? Or 200 pounds of feathers?"+ "\n" + "Wouldn't it be feathers? Because you have to carry the weight of what you did to those poor birds, right?";
		
	}
	
	public String processConversation(String input)
	{
		String chatbotResponse = "";
		chatbotResponse += "You said: " + "\n" + input + "\n";
		chatbotResponse += buildChatbotResponse();
		
	
		
		return chatbotResponse;
	}
	private String buildChatbotResponse()
	{
		String response = "I ";
		int random = (int) (Math.random() * verbs.length);
		
		response += verbs[random];
		
		random = (int) (Math.random() * topics.length);
		response += " " + topics[random] + ".\n";
		
		random = (int) (Math.random() * questions.length);
		response += questions[random];
		
		
		return response;
		
	}
	
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		
		if (input != null && input.length() > 2)
		{
			if (input.length() > 2)
			{
				validLength = true;
			}
		}
		return validLength;
	}
	
	public boolean htmlTagChecker(String input)
	{
		return false;
	}
	
	public boolean userNameChecker(String input)
	{
		return true;
	}
	
	public boolean contentChecker(String contentCheck)
	{
		return true;
	}
	
	public boolean cuteAnimalMemeChecker(String input)
	{
		return true;
	}
	
	public boolean shoppingListChecker(String shoppingItem)
	{
		return true;
	}
	
	public boolean movieTitleChecker(String title)
	{
		return true;
	}
	
	public boolean movieGenreChecker(String genre)
	{
		return true;
	}

	public boolean quitChecker(String exitString)
	{
		if (exitString.equalsIgnoreCase("quit"))
		{
			return true;
		}
		return false;

	}

	public boolean keyboardMashChecker(String sample)
	{
		return true;
	}
	
	public List<Movie> getMovieList()
	{
		return movieList;
	}
	
	public List<String> getShoppingList()
	{
		return shoppingList;
	}
	
	public List<String> getCuteAnimalMemes()
	{
		return cuteAnimalMemes;
	}

	public String [] getQuestions()
	{
		return questions;
	}
	
	public String[] getVerbs()
	{
		return verbs;
	}

	public String[] getTopics()
	{
		return topics;
	}

	public String[] getFollowUps()
	{
		return followUps;
	}

	public String getUsername()
	{
		return username;
	}
	
	public String getContent()
	{
		return content;
	}

	public String getIntro()
	{
		return intro;
	}
	
	public LocalTime getCurrentTime()
	{
		return currentTime;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
