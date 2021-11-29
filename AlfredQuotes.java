import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String newGreeting = String.format ("Hello, %s, lovely to see you. How are you?", name);
        return newGreeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String newDate = String.format("It is currently " + date);
        return newDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if(conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally.";
        }
        else
            return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

