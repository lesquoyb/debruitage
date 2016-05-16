le paramètre gamma correspond à la valeur qu'on met en seuil (un pourcentage du bruit moyen de base) au cas où le bruit moyen est plus fort que le bruit courant.
le paramètre beta gère l'importance de la correction, plus il est élevé, plus on va "débruiter"
le paramètre alpha ? //TODO
On remarque donc qu'il faut que alpha soit > 0, sinon on n'a que du bruit blanc.
Aussi, plus gamma est élevé plus le bruit blanc est audible.
On a donc intérêt à garder gamma assez bas.
si beta vaut 0 on a un signal non filtré.
Si beta est trop élevé on ne reconnait pas beaucoup.
Il faut donc trouver un équilibre entre beta et alpha.