le param�tre gamma correspond � la valeur qu'on met en seuil (un pourcentage du bruit moyen de base) au cas o� le bruit moyen est plus fort que le bruit courant.
le param�tre beta g�re l'importance de la correction, plus il est �lev�, plus on va "d�bruiter"
le param�tre alpha ? //TODO
On remarque donc qu'il faut que alpha soit > 0, sinon on n'a que du bruit blanc.
Aussi, plus gamma est �lev� plus le bruit blanc est audible.
On a donc int�r�t � garder gamma assez bas.
si beta vaut 0 on a un signal non filtr�.
Si beta est trop �lev� on ne reconnait pas beaucoup.
Il faut donc trouver un �quilibre entre beta et alpha.