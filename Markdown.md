Q.1b Le test de ces constructeurs utilisent les op�rations getX et getY. Ne trouvez-vous pas cela �trange qu�un test utilise d�autres op�rations ? Que faire ?

Oui le test devrait utiliser qu'une seule op�ration afin d'isoler les probl�mes.
On peut soit comparer un Point cr�e avec un autre Point en impl�mentant le test et l'op�ration qui vont bien. Soit s�parer le test du constructeur en deux, un pour getX, l'autre pour getY. 

Q.2b Est-ce que votre code est s�r lorsque toutes les instructions sont couvertes par au moins un test ?

Non, il faut parfois plusieurs tests par instruction pour couvrir l'ensemble des chemins possible. De plus il est possible que le test en question n'est pas suffisant pour tester l'instruction en enti�re. (ou la test mal).



Q.3a Expliquez en quoi il est impossible de tester en l��tat cette op�ration. >> On veut donc utiliser le principe du Mock pour tester cette op�ration.

L'op�ration utilise deux op�rations qui ont pour but de retourner un r�sultat al�atoire. On ne peut donc pas pr�voir � l'avance le Random qui sera renvoy� de part et d'autre des op�rations.