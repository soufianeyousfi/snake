package snake;

/**
 * Class Block, un morceau du serpent
 *
 */
public class Block 
{
	private static final long serialVersionUID = 1L;
	
	protected int posX;
	protected int posY;
	
	/**
	 * Block a la position (posX, posY)
	 * @param posX position X du Block
	 * @param posY position Y du serpent
	 */
	public Block(int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
		
	}
	
	/**
	 * Faire avancer le Block vers le Block qu'il suit
	 */
	protected void avance()
	{
		this.posX = posX;
		this.posY = posY;
		
	}
	
	/**
	 * Block.WEST: Vers la gauche
	 * Block.EST: Vers la droite
	 * Block.NORTH: Vers le haut
	 * Block.SOUTH: Vers le bas
	 * Faire avancer le serpent dans la direction dir
	 * @param dir direction a prendre
	 */
	int nbrCaseX = 12;
	int nbrCaseY = 12;
	protected void avance(short dir)
	{
		if(dir == Snake.EST)
			posX++;
		else if(dir == Snake.WEST)
			posX--;
		else if(dir == Snake.NORTH)
			posY--;
		else //if(dir == Snake.SOUTH)
			posY++;
		
		//S'il sort du cadre
		
		if(posX<0 && dir == Snake.WEST)posX=nbrCaseX-1;
		if(posX>=nbrCaseX&& dir == Snake.EST)posX=0;
		
		if(posY<0 && dir == Snake.NORTH)posY=nbrCaseY-1;
		if(posY>=nbrCaseY && dir == Snake.SOUTH)posY=0;
		
	}
	
	/**
	 * Faire bouger le Block a la position (posX, posY)
	 * @param posX position X du Block
	 * @param posY position Y du serpent
	 */
	public void moveIt(int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
		
	}
	

	
}
