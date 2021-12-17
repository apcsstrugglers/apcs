
In a text messaging system, data is sent from one device to another. Devices are recognized by a unique device ID. The format of the message is sent as a string with information about the number of characters in the device ID, the device ID itself, the number of characters in the text message and the text message that is being sent with each part being separated by a space. The system uses this information to send the message to the correct device and the receiving device displays only the text message. The number of words in the text message is also useful. A word is defined by strings separated by spaces.

Here is a sample VALID message:
04 1234 05 hello

The first two digits in the string represent the length of the device ID to follow.

The device ID is the number of characters following the length. Note that the device ID may not be limited to number values.

Following the device ID is the length of the text message and then the text message itself. The text message may be any combination of characters (such as letters, numbers or symbols) and may include spaces.

This message contains one word.

Here is a sample INVALID message:
06 a2b10 09 I’m ready

The first two values 06 indicate the device ID length. The device ID is a2b10 which has a length of 5. This does not match the specified length 06. Thus, this is NOT a valid message.

This message contains two words.

The Message class represents messages in this system. A Message must have a device ID, the length of the ID, the length of the message and the text message being sent in order to be a valid message sent through the system. The Message class must determine if a message is valid in order to send a message. A valid message is one where the device ID length matches the given length in the message string and the text message length matches the length of the supplied text message. The text message consists of one or more words where the length of the text message string is at least one character.

Consider the code below:

Message msg1 = new Message("08 abc123xy 16 Computer Science"); //creates a new message object
boolean msg1Valid = msg1.isValid(); // returns true for a valid message
String text = "11 radio11a287 14";
Message msg2 = new Message(text);
boolean msg2Valid = msg2.isValid(); // returns false for an invalid message
Message msg3 = new Message("04 92a1 16 Computer Science");
Message msg4 = new Message("03 x8r 21 Today is a great day!");
int numWords = msg4.wordCount(); //returns 5, the number of words in the
//text message

Complete the Message class by writing the isValid() and wordcount() methods.

public class Message{

     private int idLength;
     private String deviceID;
     private int msgLength;
     private String textMsg;

     public Message(String msg){
     //implementation not shown
     }

     public boolean isValid(){
     //to be written
     }

     public int wordCount(){
     //to be written
     }

}