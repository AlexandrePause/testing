Q.1b Le test de ces constructeurs utilisent les opérations getX et getY. Ne trouvez-vous pas cela étrange qu’un test utilise d’autres opérations ? Que faire ?

Oui le test devrait utiliser qu'une seule opération afin d'isoler les problèmes.
On peut soit comparer un Point crée avec un autre Point en implémentant le test et l'opération qui vont bien. Soit séparer le test du constructeur en deux, un pour getX, l'autre pour getY. 

Q.2b Est-ce que votre code est sûr lorsque toutes les instructions sont couvertes par au moins un test ?

Non, il faut parfois plusieurs tests par instruction pour couvrir l'ensemble des chemins possible. De plus il est possible que le test en question n'est pas suffisant pour tester l'instruction en entière. (ou la test mal).



Q.3a Expliquez en quoi il est impossible de tester en l’état cette opération. >> On veut donc utiliser le principe du Mock pour tester cette opération.

L'opération utilise deux opérations qui ont pour but de retourner un résultat aléatoire. On ne peut donc pas prévoir à l'avance le Random qui sera renvoyé de part et d'autre des opérations.