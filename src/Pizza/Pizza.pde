PImage brocoli;
boolean toppingsPressed=false;
PImage Cheese;
void setup() {
  size(500, 500);
  brocoli = loadImage("brocoli.jpg");
  brocoli.resize(150, 100);
  Cheese = loadImage("cheese.jpg");
  Cheese.resize(90, 50);
}

void draw() {
  fill(#7D817D);
  ellipse(250, 250, 250, 250);
  if (mousePressed) {
    toppingsPressed= true;
    
  }
  if(toppingsPressed){
  image(Cheese, 250, 124);
    image(brocoli, 125, 125);
    image(Cheese, mouseX, mouseY);
    image(brocoli, 225, 200);
    toppingsPressed=false;
  }
}
