public class Ball {
  float radius = 0;
  String color = "";
  
  public Ball(float r, String c) {
    setRadius(r);
    setColor(c);
  }
  
  public Ball(float r) {
    setRadius(r);
  }
  
  public Ball() {}
  
  public float getRadius() { return this.radius; }
  public void setRadius(float r) { this.radius = r; }
  
  public String getColor() { return this.color; }
  public void setColor(String c) { this.color = c; }
  
  public String info() {
    return "I'm " + this.radius + " cm big and " + this.color + " color."; 
  }
  
  public static void main(String[] args) {
    Ball b = new Ball(4.2f, "red");
    System.out.println(b.info());
    
    b.setRadius(5f);
    b.setColor("black");
    System.out.println(b.info());
    
    Ball c = new Ball(b.getRadius() * 2 - 2, b.getColor().toUpperCase().concat(" is so good"));
    System.out.println(c.info());
  }
}