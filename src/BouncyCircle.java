
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class BouncyCircle extends Circle{
	
	Color color;
	public BouncyCircle(){
		
		size = 100;
		jumpImpulsen = 3f;
		color = Color.RED;
	}

	@Override
	public void  WallJump()
	{
		if(positionX+size > 600)
			{
				Rebotar();
				CambiarColor();
			}
	}
	
	public void Rebotar(){
		velocityX = 10f;
	}
	
	public void CambiarColor()
	{
		
		color = Color.red;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}

}
