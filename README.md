# Application destinée à observer le fonctionnement du GC
L'applicaton va remplir une liste d'objets et vide la liste après un million d'éléments. tout celà pendant une durée définie (30 s)

## Paramétrage du GC
-verbosegc

-XX:+PrintGCDetails -XX:+PrintGCDateStamps

Affichage d’informations supplémentaires (détails, dates)

-XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:C:\tmp\jee2018.log 

Logs des informations dans un fichier de sortie

