package kup9_lab6;

public class MyRectangle {

	
	private int width;
	private int height;
	private int startX;
	private int startY;
	
	
		public MyRectangle()
		{
			this.width = 0;
			this.height = 0;
			this.startX = 0;
			this.startY = 0;
		}

		public MyRectangle(int x, int y, int w, int h)
		{
			this.startX = x;
			this.startY = y;
			this.width = w;
			this.height = h;
		}

		public int area()
		{
			return this.width*this.height;
		}

		// I have written this method for you.  Note how a StringBuilder is
		// utilized, since (as we discussed in lecture) it can be modified
		// without having to create a new object each time (unlike a String).
		public String toString()
		{
			StringBuilder S = new StringBuilder();
			S.append("Width: " + width);
			S.append(" Height: " + height);
			S.append(" X: " + startX);
			S.append(" Y: " + startY);
			return S.toString();
		}

		public boolean isInside(int x, int y)
		{
			boolean insideX = (x >= this.startX && x <= (this.startX + this.width));
			boolean insideY = (y >= this.startY && y <= (this.startY + this.height));
			return insideX && insideY;
		}

		public void setSize(int w, int h)
		{
			this.width = w;
			this.height = h;
		}

		public void setPosition(int x, int y)
		{
			this.startX = x;
			this.startY = y;
		}
}
