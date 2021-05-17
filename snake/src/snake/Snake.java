package snake;

import java.util.ArrayList;
import java.util.List;


/**
 * Le serpent
 *
 */
public class Snake 
{
	private static final long serialVersionUID = 1L;
	//TODO
	public final static short WEST = -1;
	public final static short EST = 1;
	public final static short NORTH = -2;
	public final static short SOUTH = 2;

	
	private Block tete;
	//TODO replace object with block
	private List<Object> queue = new ArrayList<Object>(0);
	
	private short dir = WEST;
	private short dirAv = WEST;
	
	
	
	//TODO
	Position objectif  =new Position(0, 0);
//TODO score
	//private Point2D score ;
	
	/**
	 * Créé un nouveau serpent
	 * @param tete le Block représentant sa tête
	 * @param nbrQueue le nombre de Block en plus de sa tete
	 */
	public Snake(Block tete, int nbrQueu)
	{
		this.tete = tete;
		
		for(int i=0;i<nbrQueu;i++)//Ajoute le corp
		{
			if(i==0){
				//queue.add(new Block(tete));
			}
				
				
			//TODO
//			else queue.add(new Block(queue.get(i-1)));
			
		}
		
	}
	
	
	
	/**
	 * Faire avancer le serpent d'une case
	 */
	public void avance()
	{
		for(int k=queue.size()-1;k>=0;k--)//Remplacer le Block n-1 par celui n
			//todo add avancer()
//			queue.get(k).avance();
		
		if(dir+dirAv != 0)//Ne peut pas se diriger dans le sens contraire
		{
			tete.avance(dir);//On fait avancer la tete toujours dans la même direction
			dirAv=dir;
		}
		else
			tete.avance((short) (dirAv));//On fait avancer la tete dans la direction dir
		
		for(int k=0;k<queue.size();k++)
		//TODO ado getLocation()
		/*	if(queue.get(k).getLocation().equals(tete.getLocation()))
				//Si la tete touche un autre Block du serpent
			{
				//Bloquer le serpent
			}*/
		
		if(tete.posX == objectif.getPosX() && tete.posY == objectif.getPosY())//Si il a atteind un objectif
		{//TODO
			objectif.moveIt((int)(1), (int)(1));
			
		}
	}
	
	
}