					
					public class SimpleGeometricObject  {
						private String color = "white";
						private boolean filled;
						private java.util.Date dateCreated;
					
						public SimpleGeometricObject() {
					
							dateCreated = new java.util.Date();
					
						}
					//constructs a geometric object with the specified color and a filled value
					
						public SimpleGeometricObject(String color, boolean filled) {
							dateCreated = new java.util.Date();
							this.color = color;
							this.filled = filled;
					
						}
					
					//return color
						public String getColor() {
							return color;
					
						}
					
					//set color
						public void setColor(String color) {
							this.color = color;
					
						}
					
						/**
						 * Return filled. Since filled is boolean, its getter method is named isFilled
						 */
						public boolean Isfilled() {
							return filled;
						}
					
					//set filled value
						public void setFilled(boolean filled) {
							this.filled = filled;
						}
					
						// get date created
						public java.util.Date getDateCreated() {
							return dateCreated;
						}
					
						/** Return a string representation of this object */
						public String toString() {
					
							return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
					
						}
					
					}
