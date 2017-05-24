/* 
 *  Web-controlled Nerf Shooter
 *  
 *  Developed by Kevin Chen
 *  @ CapitalOne Engineering Summit
 *  
 */

#define BLUE_LED 9
#define GREEN_LED 10
#define RED_LED 11

/* runs on start */
void setup() {
  // initialize digital pin LED_BUILTIN as output
  pinMode(RED_LED, OUTPUT);
  pinMode(GREEN_LED, OUTPUT);
  pinMode(BLUE_LED, OUTPUT);
}

void loop() {
  digitalWrite(RED_LED, HIGH); // turn LED on (high voltage)
  digitalWrite(GREEN_LED, HIGH); // turn LED on (high voltage)
  digitalWrite(BLUE_LED, HIGH); // turn LED on (high voltage)
}
