/*To set up the arduino connect relay to arduino starring at arduino I/O pin 4
 * So arduino pin 4 will be relay 1 and arduino pin 11 will be relay 8
 * Relay 1 is for triggering fan off button on the fan remote
 * Relay 2 is for triggering fan low button on the fan remote
 * Relay 3 is for triggering fan med button on the fan remote
 * Relay 4 is for triggering fan high button on the fan remote
 * Relay 5 is for turning on Pin 1, on the fan remote
 * Relay 6 is for turning on Pin 2, on the fan remote
 * Relay 7 is for turning on Pin 3, on the fan remote
 * Relay 8 is for turning on Pin 4, on the fan remote however this is not set here because i dont have that many fans.
 * 
 */
#include <SmartThings.h>
#include <SoftwareSerial.h> 

//used by the smartthing shield for RX/TX
#define PIN_THING_RX    3
#define PIN_THING_TX    2

//sets the pin output for arduino
#define RELAY_ON 0
#define RELAY_OFF 1


#define DEBUG
#ifdef DEBUG
  #define DEBUG_PRINT(x)    Serial.print (x)
  #define DEBUG_PRINTDEC(x) Serial.print (x, DEC)
  #define DEBUG_PRINTLN(x)  Serial.println (x)
#else
  #define DEBUG_PRINT(x)
  #define DEBUG_PRINTDEC(x)
  #define DEBUG_PRINTLN(x) 
#endif
 
//communication to the smarthings shield message coming in from the smarthing hub is "messageCallout" 
SmartThingsCallout_t messageCallout;    
SmartThings smartthing(PIN_THING_RX, PIN_THING_TX, messageCallout);  

void setup()
{
  #ifdef DEBUG
    // setup debug serial port
    Serial.begin(9600);        
  #endif
  
  DEBUG_PRINTLN("Setting everything up...");  
    
  // turns off all the relays and sets them as output pins
  for (int relay=1;relay<9;relay++) 
  {
    // Initialize pins so relays are off at reset
    digitalWrite(relay+3, RELAY_OFF);          // +3 because the relay pins start at pin 4

    // THEN set pins as outputs 
    pinMode(relay+3, OUTPUT);                  // +3 because the relay pins start at pin 4
  }  
  DEBUG_PRINTLN("Ready...");  
}
 
void loop()
{
  // run smartthing logic
  smartthing.run();
}

//when a message/command is received from smartthings this runs
void messageCallout(String message)
{
  
  // take the message and breaks it appart into values
  int firstIndex = message.indexOf(':');
  int secondIndex = message. indexOf(':', firstIndex+1);
  int fan = message.substring(firstIndex+1, secondIndex).toInt(); // sets "fan" as the number after the : in the message.  (If message is "fanoff:1" then "fan=1")

if (fan==0)
  {
    return; //if fan is 0, stop the script
  }
  DEBUG_PRINT ("Fan ");
  DEBUG_PRINT (fan); //prints out what the fan value is in serial

 if (fan==1) //fan1 has not pin set on the remote so it simply have to trigger the fan speed
  {
    if (message.startsWith ("fanoff"))
      {
      digitalWrite(4, RELAY_ON);// turn fan off
      delay(800);
      digitalWrite(4, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Off");
      } 
    else if (message.startsWith ("fanlow"))
      {
      digitalWrite(5, RELAY_ON);// Set fan to Low
      delay(800);
      digitalWrite(5, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Low");
      } 
    else if (message.startsWith ("fanmed"))
      {
      digitalWrite(6, RELAY_ON);// Set fan to Med
      delay(800);
      digitalWrite(6, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Med");
      } 
    else if (message.startsWith ("fanhi"))
      {
      digitalWrite(7, RELAY_ON);// Set fan to High
      delay(800);
      digitalWrite(7, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" High");
      } 
  }

  else if (fan==2)//fan1 has pin 1 set to on, on the remote so it needs to set the pin on the remote firsh and then send the fan speed relay
  {
    digitalWrite(8, RELAY_ON);// Turn Pin 1 on
    delay(250);
    if (message.startsWith ("fanoff"))
      {
      digitalWrite(4, RELAY_ON);// turn fan off
      delay(800);
      digitalWrite(4, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Off");
      } 
    else if (message.startsWith ("fanlow"))
      {
      digitalWrite(5, RELAY_ON);// Set fan to Low
      delay(800);
      digitalWrite(5, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Low");
      } 
    else if (message.startsWith ("fanmed"))
      {
      digitalWrite(6, RELAY_ON);// Set fan to Med
      delay(800);
      digitalWrite(6, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Med");
      } 
    else if (message.startsWith ("fanhi"))
      {
      digitalWrite(7, RELAY_ON);// Set fan to High
      delay(800);
      digitalWrite(7, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" High");
      } 
    digitalWrite(8, RELAY_OFF);// Turn Pin 1 off  
  }

  else if (fan==3)//fan1 has pin 2 set to on, on the remote so it needs to set the pin on the remote firsh and then send the fan speed relay
  {
    digitalWrite(9, RELAY_ON);// Turn Pin 2 on
    delay(250);
    if (message.startsWith ("fanoff"))
      {
      digitalWrite(4, RELAY_ON);// turn fan off
      delay(800);
      digitalWrite(4, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Off");
      } 
    else if (message.startsWith ("fanlow"))
      {
      digitalWrite(5, RELAY_ON);// Set fan to Low
      delay(800);
      digitalWrite(5, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Low");
      } 
    else if (message.startsWith ("fanmed"))
      {
      digitalWrite(6, RELAY_ON);// Set fan to Med
      delay(800);
      digitalWrite(6, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Med");
      } 
    else if (message.startsWith ("fanhi"))
      {
      digitalWrite(7, RELAY_ON);// Set fan to High
      delay(800);
      digitalWrite(7, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" High");
      } 
    digitalWrite(9, RELAY_OFF);// Turn Pin 2 off  
  }

  else if (fan==4)//fan1 has pin 3 set to on, on the remote so it needs to set the pin on the remote firsh and then send the fan speed relay
  {
    digitalWrite(10, RELAY_ON);// Turn Pin 3 on
    delay(250);
    if (message.startsWith ("fanoff"))
      {
      digitalWrite(4, RELAY_ON);// turn fan off
      delay(800);
      digitalWrite(4, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Off");
      } 
    else if (message.startsWith ("fanlow"))
      {
      digitalWrite(5, RELAY_ON);// Set fan to Low
      delay(800);
      digitalWrite(5, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Low");
      } 
    else if (message.startsWith ("fanmed"))
      {
      digitalWrite(6, RELAY_ON);// Set fan to Med
      delay(800);
      digitalWrite(6, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" Med");
      } 
    else if (message.startsWith ("fanhi"))
      {
      digitalWrite(7, RELAY_ON);// Set fan to High
      delay(800);
      digitalWrite(7, RELAY_OFF);// release relay
      DEBUG_PRINTLN (" High");
      } 
    digitalWrite(10, RELAY_OFF);// Turn Pin 3 off  
  }    
  
  
}
