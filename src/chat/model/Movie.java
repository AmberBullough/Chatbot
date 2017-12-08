package chat.model;

import java.time.LocalDate;
import chat.tests.MovieTest;
import chat.model.Chatbot;

public class Movie
{
	private String title;
	private String genre;
	private String ratingMPAA;
	private String review;
	private int length;
	private LocalDate releaseDate;
	private double starScore;
	
	public Movie(String title)
	{
		this.title = title;
		this.genre = "Sci-Fi";
		this.ratingMPAA = "G";
		this.review = "It was an amazing movie!";
		this.length = 120;
		this.releaseDate = null;
		this.starScore = 9.99;
	}

	public String getTitle()
	{
		return title;
	}

	public String getGenre()
	{
		this.genre = "Sci-Fi";
		this.genre = "Horror";
		this.genre = "Fantasy";
		this.genre = "Animation";
		this.genre = "Superheros";
		return genre;
	}

	public String getRatingMPAA()
	{
		return ratingMPAA;
	}

	public String getReview()
	{
		return review;
	}

	public int getLength()
	{
		return length;
	}

	public LocalDate getReleaseDate()
	{
		return releaseDate;
	}

	public double getStarScore()
	{
		return starScore;
	}

	public void setTitle(String title)
	{
		
		this.title = title;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setRatingMPAA(String ratingMPAA)
	{
	}

	public void setReview(String review)
	{
	}

	public void setLength(int length)
	{
	}

	public void setReleaseDate(LocalDate releaseDate)
	{
	}

	public void setStarScore(double starScore)
	{
	}
	
	public String toString()
	{
		return null; // Shout not be null
	}
}
