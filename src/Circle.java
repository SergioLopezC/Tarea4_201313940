
import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float jumpImpulsen;
	

	public Circle()
	{
		size = 20;
		jumpImpulsen = 0.05f;
	}
	
	public void Update()
	{
		AplicarAceleracion();
	   	ActualizarPosicion();
	   	WallJump();
	}
	
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
	}
	
	public void  WallJump()
	{
		if(positionX+size > 600)
			System.out.println("Detecte el borde");
	}
	
	public void AplicarAceleracion()
	{
		velocityX += jumpImpulsen;
	}
	
 	public void Draw (Graphics g){		 
 		
 		 g.setColor(Color.RED);
		 g.fillOval(positionX,positionY,size,size);
 	}

}