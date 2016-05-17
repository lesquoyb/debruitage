les réglages de l'algorithme:
	le paramètre gamma correspond à la valeur qu'on met en seuil (un pourcentage du bruit moyen de base) au cas où le bruit moyen est plus fort que le bruit courant.
	le paramètre beta gère l'importance de la correction, plus il est élevé, plus on va "débruiter"
	On remarque donc qu'il faut que alpha soit > 0, sinon on n'a que du bruit blanc.
	Aussi, plus gamma est élevé plus le bruit blanc est audible.
	On a donc intérêt à garder gamma assez bas(entre 0 et 0.5 par exemple). Au dessus de 1, on ajoute du bruit.
	si beta vaut 0 on a un signal non filtré.
	Si beta est trop élevé on ne reconnait pas beaucoup.
	Il faut donc trouver un équilibre entre beta et alpha.
	
Problèmes rencontrés:
	j'ai hésité pour la variable représentant le bruit moyen entre un tableau et un seul nombre, puis j'ai opté pour un seul nombre car dans le sujet il était indiqué que  le spectre du bruit "à
l’instant k,[...] qui est ici le même pour tous les k". De plus j'ai essayé les deux et j'ai constaté un meilleur resultat quand j'utilisé un seul nombre plutôt qu'un tableau. Le nombre étant la moyenne globale (il est censé représenter une sorte de seuil(du moins dans mon esprit)).
