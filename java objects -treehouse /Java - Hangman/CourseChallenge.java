//challenge 1 - scrabble
public class ScrabblePlayer {
  // A String representing all of the tiles that this player has
  private String tiles;

  public ScrabblePlayer() {
    tiles = "";
  }

  public String getTiles() {
    return tiles;
  }

  public void addTile(char tile) {
    // TODO: Add the tile to tiles
    tiles += tile;

  }

  public boolean hasTile(char tile) {
    // TODO: Determine if user has the tile passed in
    return tiles.indexOf(tile) != -1;
  }

}

//challenge 2 - get in line
public class ConferenceRegistrationAssistant {

  /**
   * Assists in guiding people to the proper line based on their last name.
   *
   * @param lastName The person's last name
   * @return The line number based on the first letter of lastName
   */
  public int getLineNumberFor(String lastName) {
    int lineNumber = 0;
    /*
      lineNumber should be set based on the first character of the person's last name
      Line 1 - A thru M
      Line 2 - N thru Z

     */
    if(lastName.charAt(0) <= 'M') {
      lineNumber = 1;
    } else {
      lineNumber = 2;
    }
    return lineNumber;
  }

}

//challenge 3 - scrabble progression
// This code is here for example purposes only
public class Example {
    
  public static void main(String[] args) {
    ScrabblePlayer player1 = new ScrabblePlayer();
    player1.addTile('d');
    player1.addTile('d');
    player1.addTile('p');
    player1.addTile('e');
    player1.addTile('l');
    player1.addTile('u');

    ScrabblePlayer player2 = new ScrabblePlayer();
    player2.addTile('z');
    player2.addTile('z');
    player2.addTile('y');
    player2.addTile('f');
    player2.addTile('u');
    player2.addTile('z');

    int count = 0;
    // This would set count to 1 because player1 has 1 'p' tile in her collection of tiles
    count = player1.getCountOfLetter('p');
    // This would set count to 2 because player1 has 2 'd'' tiles in her collection of tiles
    count = player1.getCountOfLetter('d');
    // This would set 0, because there isn't an 'a' tile in player1's tiles
    count = player1.getCountOfLetter('a');

    // This will return 3 because player2 has 3 'z' tiles in his collection of tiles
    count = player2.getCountOfLetter('z');
    // This will return 1 because player2 has 1 'f' tiles in his collection of tiles
    count = player2.getCountOfLetter('f');
  }
}

public class ScrabblePlayer {
  // A String representing all of the tiles that this player has
  private String tiles;

  public ScrabblePlayer() {
    tiles = "";
  }

  public String getTiles() {
    return tiles;
  }

  public void addTile(char tile) {
    tiles += tile;
  }

  public boolean hasTile(char tile) {
    return tiles.indexOf(tile) != -1;
  }
  
  public int getCountOfLetter (char letter) {
    int count = 0;
    for(char tile : tiles.toCharArray()) {
      if( tile == letter) {
      count++;
      }
    }
    return count;
  }
  
}

//final challenge - twitter like app
public class Tweet {
  public static final int MAX_CHARS = 140;
  private String text;

  public Tweet(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
  
    public int getRemainingCharacterCount() {
    return MAX_CHARS - text.length();
  }
}

//shopping cart normalization challenge
//Example.java with Order.java
public class Example {

  public static void main(String[] args) {
    // This is here just for example use cases.

    Order order = new Order(
            "Yoda PEZ Dispenser",
            600);

    // These are valid.  They are letters and the $ character only
    order.applyDiscountCode("abc");
    order.getDiscountCode(); // ABC

    order.applyDiscountCode("$ale");
    order.getDiscountCode(); // $ALE


    try {
      // This will throw an exception because it contains numbers
      order.applyDiscountCode("ABC123");
    } catch (IllegalArgumentException iae) {
      System.out.println(iae.getMessage());  // Prints "Invalid discount code"
    }
    try {
      // This will throw as well, because it contains a symbol.
      order.applyDiscountCode("w@w");
    }catch (IllegalArgumentException iae) {
      System.out.println(iae.getMessage());  // Prints "Invalid discount code"
    }

  }
}

public class Order {
  private String itemName;
  private int priceInCents;
  private String discountCode;

  public Order(String itemName, int priceInCents) {
    this.itemName = itemName;
    this.priceInCents = priceInCents;
  }

  public String getItemName() {
    return itemName;
  }

  public int getPriceInCents() {
    return priceInCents;
  }

  public String getDiscountCode() {
    return discountCode;
  }
  
  private String normalizeDiscountCode(String discountCode) {
    for (char c : discountCode.toCharArray()) {
      if(!Character.isLetter(c) && c != '$') {
        throw new IllegalArgumentException("Invalid discount code");
      }
    }
    return discountCode.toUpperCase();
  }

  public void applyDiscountCode(String discountCode) {
    this.discountCode = normalizeDiscountCode(discountCode);
  }
}

// CHALLENGE FOR NORMALIZING 
/*
For this first task, create a new private method named normalizeDiscountCode. 
It should take the discount code that is passed into the method and return the uppercase version. 
Call it from the current applyDiscountCode method and set this.discountCode to the result.
*/
//EXAMPLE.JAVA 
public class Example {

  public static void main(String[] args) {
    // This is here just for example use cases.

    Order order = new Order(
            "Yoda PEZ Dispenser",
            600);

    // These are valid.  They are letters and the $ character only
    order.applyDiscountCode("abc");
    order.getDiscountCode(); // ABC

    order.applyDiscountCode("$ale");
    order.getDiscountCode(); // $ALE


    try {
      // This will throw an exception because it contains numbers
      order.applyDiscountCode("ABC123");
    } catch (IllegalArgumentException iae) {
      System.out.println(iae.getMessage());  // Prints "Invalid discount code"
    }
    try {
      // This will throw as well, because it contains a symbol.
      order.applyDiscountCode("w@w");
    }catch (IllegalArgumentException iae) {
      System.out.println(iae.getMessage());  // Prints "Invalid discount code"
    }

  }
}

//ORDER.JAVA
public class Order {
  private String itemName;
  private int priceInCents;
  private String discountCode;

  public Order(String itemName, int priceInCents) {
    this.itemName = itemName;
    this.priceInCents = priceInCents;
  }

  public String getItemName() {
    return itemName;
  }

  public int getPriceInCents() {
    return priceInCents;
  }

  public String getDiscountCode() {
    return discountCode;
  }
  private String normalizeDiscountCode(String discountCode){
    discountCode = discountCode.toUpperCase();
    return discountCode;
  }

  public void applyDiscountCode(String discountCode) {
    this.discountCode = normalizeDiscountCode(discountCode);
  }
  
}

/*
Now let's use your validation skills. Only letters and the $ symbols are allowed in the discount code. 
Check Example.java for use cases


In the normalizeDiscountCode verify that only letters or the $ character are used. 
If any other character is used, throw a IllegalArgumentException with the message Invalid discount code.
 */

//EXAMPLE.JAVA PEZ DISPENSERS
public class Example {

  public static void main(String[] args) {
    // This is here just for example use cases.

    Order order = new Order(
            "Yoda PEZ Dispenser",
            600);

    // These are valid.  They are letters and the $ character only
    order.applyDiscountCode("abc");
    order.getDiscountCode(); // ABC

    order.applyDiscountCode("$ale");
    order.getDiscountCode(); // $ALE


    try {
      // This will throw an exception because it contains numbers
      order.applyDiscountCode("ABC123");
    } catch (IllegalArgumentException iae) {
      System.out.println(iae.getMessage());  // Prints "Invalid discount code"
    }
    try {
      // This will throw as well, because it contains a symbol.
      order.applyDiscountCode("w@w");
    }catch (IllegalArgumentException iae) {
      System.out.println(iae.getMessage());  // Prints "Invalid discount code"
    }

  }
}

//ORDER.JAVA - use char array to see if valid letters or $

public class Order {
  private String itemName;
  private int priceInCents;
  private String discountCode;

  public Order(String itemName, int priceInCents) {
    this.itemName = itemName;
    this.priceInCents = priceInCents;
  }

  public String getItemName() {
    return itemName;
  }

  public int getPriceInCents() {
    return priceInCents;
  }

  public String getDiscountCode() {
    return discountCode;
  }
  //challenge area
  private String normalizeDiscountCode(String discountCode){
    for (char c : discountCode.toCharArray()) { 
      if ( !(Character.isLetter(c) || c == '$')) { 
        throw new IllegalArgumentException("Invalid discount code");
      }
    }
    discountCode = discountCode.toUpperCase();
    return discountCode;
  }

  public void applyDiscountCode(String discountCode) {
    this.discountCode = normalizeDiscountCode(discountCode);
  }
}



///forum - final java objects challenge
//FOrum.java
public class Forum {
  private String topic;

  // TODO: add a constructor that accepts a topic and sets the private field topic
  public Forum(String topic) {
    this.topic = topic;
  }

  public String getTopic() {
    return topic;
  }

  public void addPost(ForumPost post) {
    System.out.printf("A new post in %s topic from %s %s about %s is available",
            topic,
            post.getAuthor().getFirstName(),
            post.getAuthor().getLastName(),
            post.getTitle()
    );
  }

}


//User.java

public class User {
  // TODO: add private fields for firstName and lastName
  private String firstName;
  private String lastName;

  public User(String firstName, String lastName) {
    // TODO: set and add the private fields
    this.firstName = firstName;
    this.lastName = lastName;

  }

  // TODO: add getters for firstName and lastName
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }

}

//ForumPost.java
public class ForumPost {
  private User author;
  private String title;
  private String description;

  // TODO: add a constructor that accepts the author, title and description
  public ForumPost(User author, String title, String description) {
    this.author = author;
    this.title = title;
    this.description = description;
  }

  public User getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }
}

//Main.java goes with Forum challenge - last part
public class Main {
  
    public static void main(String[] args) {
  
      System.out.println("Beginning forum example");
      if (args.length < 2) {
        System.out.println("Usage: java Main <first name> <last name>");
        System.err.println("<first name> and <last name> are required");
        System.exit(1);
      }
  
      Forum forum = new Forum("Java");
      // TODO: pass in the first name and last name that are in the args parameter
  
      User author = new User(args[0], args[1]);
      
      // TODO: initialize the forum post with the user created above and a title and description of your choice
  
      ForumPost post = new ForumPost(author, "This challenge is nuts", "I am nuts.");
      forum.addPost(post);
  
    }
  
  }