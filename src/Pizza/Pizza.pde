import ddf.minim.*;     
Minim minim;     
AudioPlayer sound;  
PImage brocoli;
boolean toppingsPressed=false;
PImage Cheese;
boolean pizzadrawn=false;


void setup() {

minim = new Minim(this);  
sound = minim.loadFile("Scream.wav");      

  size(500, 500);
  brocoli = loadImage("brocoli.jpg");
  brocoli.resize(150, 100);
  Cheese = loadImage("cheese.jpg");
  Cheese.resize(90, 50);
}

void draw() {
  if (pizzadrawn==false) {  
    fill(#7D817D);
    ellipse(250, 250, 250, 250);
    pizzadrawn=true;
  }
  if (mousePressed) {
    sound.play();
    sound.rewind(); 
    toppingsPressed= true;
  }
  if (toppingsPressed) {
    image(Cheese, 250, 124);
    image(brocoli, 125, 125);
    image(Cheese, mouseX, mouseY);
    image(brocoli, 225, 200);
    toppingsPressed=false;
    Cheese.resize(50, 50);
  }
}
