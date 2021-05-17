package snake;

public class Position 
{
	private static final long serialVersionUID = 1L;
	
	protected int posX;
	protected int posY;
	
	
	/**
	 * Créer un nouvel  objectif pour le serpent
	 * @param posX position horizontal de l'objectif
	 * @param posY position vertical de l'objectif
	 */
	public Position(int posX, int posY)
	{
		
		this.posX = posX;
		this.posY = posY;
	}
	
	/**
	 * Bouger l'objectif
	 * @param posX position horizontal de l'objectif
	 * @param posY position vertical de l'objectif
	 */
	public void moveIt(int posX, int posY)
	{
		
		this.posX = posX;
		this.posY = posY;
		
	}
	
	/**
	 * @return position horizontal de l'objectif
	 */
	public int getPosX()
	{
		return posX;
	}
	
	/**
	 * @return position vertical de l'objectif
	 */
	public int getPosY()
	{
		return posY;
	}
}
