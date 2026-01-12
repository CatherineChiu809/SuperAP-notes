package pkg;
import java.util.*;
import java.io.*;

public class Message {
	String author;
	String subject;
	String body;
	int a;
	ArrayList <Message> messages; 
	// Default Constructor
	public Message() {
		author = "";
		subject = "";
		body = "";
		a = 0;
		messages = new ArrayList<Message>();
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		author = auth;
		subject = subj;
		body = bod;
		a = i;
		messages = new ArrayList<Message>();
	}

	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its childList, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. 

	public void print(int indentation){
		int indent = indentation*2;
		String newIndent = "";
		for(int i = 0; i<indent; i++){
			newIndent +=" ";
		}
		System.out.println(newIndent + "Message #" + a + ": " + subject);
		System.out.println(newIndent + "From " + author + ": " + body);
		System.out.println();

		for(int a = 0; a<messages.size(); a++){
			messages.get(a).print(indentation+1);
		}
	}

	// Default function for inheritance
	public boolean isReply(){
		return false;
	}

	// Returns the subject String
	public String getSubject(){
		return subject;
	} 

	// Returns the ID
	public int getId(){
		return a;
	}

	// Adds a child pointer to the parent's childList.
	public void addChild(Message child){
		messages.add(child);
	}

}
