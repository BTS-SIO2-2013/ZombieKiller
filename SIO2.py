# Conception et Adaptation de solution applicatives
# 
# Ce module aborde les savoirs et savoirs faire liés à la participation à des projets de conception d’une 
# solution applicative ainsi qu’aux activités de maintien en condition opérationnelle des services associés 
# et de réponse aux besoins d’évolution. 

# Pré requis : modules SI1, SI2, SI3, SI4, SI5, SI6, SLAM1, SLAM2 

# Activités supports de l’acquisition des compétences
# D1.1 - Analyse de la demande 
# D1.2 - Choix d’une solution 
# D1.3 - Mise en production d’un service 
# • A1.3.1 Test d’intégration et d’acceptation d’un service 
# • A1.3.2 Définition des éléments nécessaires à la continuité d’un service
# D1.4 - Travail en mode projet 
# D2.2 - Gestion des incidents et des demandes d’assistance 
# D2.3 - Gestion des problèmes et des changements 
# D4.1 - Conception et réalisation d’une solution applicative 
# • A4.1.1 - Proposition d’une solution applicative 
# • A4.1.2 - Conception ou adaptation de l’interface utilisateur d’une solution applicative 
# • A4.1.4 – Définition des caractéristiques d’une solution applicative 
# • A4.1.5 – Prototypage de composants logiciels 
# • A4.1.6 - Gestion d’environnements de développement et de test 
# • A4.1.7 - Développement, utilisation ou adaptation de composants logiciels 
# • A4.1.8 - Réalisation des tests nécessaires à la validation d’éléments adaptés ou développés 
# • A4.1.9 - Rédaction d’une documentation technique 
# D4.2 - Maintenance d’une solution applicative 
# D5.1 - Gestion des configurations 
# • A5.1.3 Suivi d'une configuration et de ses éléments 
# • A5.1.4 Étude de propositions de contrat de service (client, fournisseur) 
# • A5.1.5 Évaluation d'un élément de configuration ou d'une configuration 
# • A5.1.6 Évaluation d'un investissement informatique 
# D5.2 - Gestion des compétences 

# Savoir-faire 
# • Justifier le choix d’une architecture applicative 
# • Participer à un processus de production d’une solution applicative 
# • Gérer les versions d’une solution applicative 
# • Développer en équipe 
# • Valider et documenter une solution applicative 
# • Répondre à une demande d’assistance 
# • Résoudre un incident 

# Savoirs associés 
# • Cahier des charges et spécifications 
# • Méthodes, normes et standards associés au processus de conception 
# • Cycle de production d’un service et acteurs associés 
# • Typologie des offres de solutions logicielles, modèles économiques et coûts associés 
# • Architectures applicatives : concepts avancés 
# • Test d’acceptation d’une solution logicielle 


# Cours 1 : 04/12/2013
# La pratique de ce cours portera sur les compétences de savoir-faire suivantes:
 
# Gérer les versions d'une solution applicative
# Développer en équipe
# Participer à un processus de production d'une solution applicative

# Les outils utilisés sont:
# git un gestionaire de controle de version distribué, open source et utilisé par le projet linux.
# github: Un service web basé sur git permettant le travail collaboratif (donc en équipe) , les revues de codes, et le management du code de projet open source
# Un projet applicatif : ZombieKiller un jeu en mode console codé en java et disponible à l'adresse suivante : https://github.com/BTS-SIO2-2013/ZombieKiller

# I - La gestion des versions d'une solution applicative:

# En quoi consiste la gestion de version?
# La gestion de versions (version control / revision control) permet de conserver l'ensemble des modifications physique (au sens fichier) effectués sur un projet applicatifs.
# La gestion manuel des différentes versions des fichiers qu'il soit des fichiers textes (codes) ou binaires (images/tableurs/videos...) est fastidieuse et complexe.
# L'utilisation de préfixe/suffixe V0,V1,V2,old,test,proto... ne permet pas la gestion fine des différentes modifications effectuées au sein du fichier, mais en plus ne donne pas d'information sur la date, ni sur qui à effectué la modification
# Les logiciels de gestion de versions permettent donc de conserver l'intégralité des modifications effectuées sur les fichiers du projet.
# Mais également la gestion fine des modifications aux niveau du code, par une gestion fine ligne à ligne des fichiers texte.

# Globalement un logiciel de gestion de version permet de passer de la version N à la version N+1 en appliquant une modification M.
# Le logiciel conserve en mémoire l'ensemble des modifications M, et permet donc de générer toutes les versions du projet à n'importe quel moment.

# L'ensembles des modifications (des versions) est conservé dans un DÉPOT. Ce DÉPOT est généralement une base de données.
# L'interet du logiciel pour un développeur indépendant réside dans la capacité de retour arrière, mais également la possibilité de gérer plusieurs versions du logiciel en parallèle.
# En effet lorsque l'on livre un logiciel. On livre une VERSION de ce logiciel. Ce logiciel évolue au sein de la société éditrice, alors que les utilisateurs doivent attendre une mise à jour.
# Le logiciel offre la possibilité de creer un différentiel (patch) entre la VERSION livré et la dernière version (généralement nommée HEAD, tête).

# Mais la nécéssité de ces logiciels apparais lors du travail en équipe.
# Il est courrant que les développeurs travaillent de façons séparés et à distance sur les mêmes fichiers.
# Il en résulte un problème d'intégration des différentes modifications apportées par les différents développeurs.

# Un logiciel de gestion de version propose une façons de travailler permettant aux développeurs d'intégrer facilement leurs travaux.
# Le principe repose sur la précédence des actions.
# Il est impossible pour le logiciel de traiter deux (et plus) modifications en même temps.

# Pour garantir cet impossibilité le logiciel vérifie à chaque fois que le développeur 'sauve' son travail sur le dépot que la distance entre sa modification est la dernière version est bien de 1.
# On dit que le développeur 'COMMIT' (soummet) sa modification (qui contient un ensemble de versions) sur le DÉPOT. 
# Lors d'un 'COMMIT' le logiciel vérifie que ce commit se base sur la dernière version.

# Si ce n'est pas le cas le développeur doit alors récuperer la dernière version par le bias d'une commande 'PULL' qui va chercher la dernière version du DÉPOT
# Cette commande peux provoquer un conflit de modification.
# En effet, supposon qu'un développeur travail sur la version 10, un autre travail également sur la version 10.
# Le deuxième développeur COMMIT ses changements. Le DÉPOT passe en version 11
# Le premier développeur tente un COMMIT, le DÉPOT lui répond qu'il ne peux pas effectuer la modification car il est en version 11 et le développeur propose une modification pour la version 10
# Le premier développeur doit demande un PULL du DÉPOT, ce pull récupère la version 11
# Cette version rentre en conflit avec les modifications du deuxième développeur.
# Dans ce cas le premier développeur doit effectuer un MERGE. Cet oppération consiste à fusionner ('merger') les modifications de la version 11 avec ses propres modifications de la version 10.
# Une fois sauvé le premier développeur a bien un ensemble de modifications basé sur la version 11
# Il peut donc COMMIT sur le DÉPOT qui passe en version 12.

# L'opération de merge est généralement automatique car le logiciel gère finement les lignes de texte. Néanmoins il arrive que le merge doit être fais manuellement.
# Dans ce cas l'outils DIFF (pour différence) permet de comparer les différences entre la version courante (ici 10) et la version HEAD du DÉPOT (ici 11)

# Ce problème de gestion de la concurrence des versions peut être également résolu d'une autre manière. Je vous invite à regarder sur wikipédia: http://fr.wikipedia.org/wiki/Gestion_de_versions

# Il existe de nombreux outils de gestion de versions.
# Deux grandes catégories ont emergé:
# - Les outils CENTRALISÉE
# - Les outils DÉCENTRALISÉE

# La grande différence entre ces outils est la place du DÉPOT.
# Dans le cas des outils CENTRALISÉE le DÉPOT n'est disponible que sur une machine. Les plus connus sont CVS (ancien) et SVN (nouveau)
# Dans le cas des outis DÉCENTRALISÉE chaque utilisateur dispose d'une copie du DÉPOT sur sa machine. GIT , Mercurial et GNU Arch sont les outils les plus utilisés.

# I.I Un peu de pratique:
# - Installation de git:
#   L'outil GIT est disponible pour windows à l'adresse suivante : http://git-scm.com/download/win
#   Sous ubuntu:
#   $ sudo apt-get install git
#   La documentation (TRES BONNE) en francais est disponible à l'adresse suivante : http://git-scm.com/book/fr

# - Paramètrage:
#   Dans une lignes de commande tapez:
#   $ git config --global user.name "Votre Nom D'utilisateur"
#   $ git config --global user.email toto.titi@tutu.org

# En cas de panique la commande:
# $ git help
# fournis différentes pages de manuel propre à chaques commandes.

#  Sous Windows lancer le racourcis Git Bash pour obtenir un environnement shell
#  Sous unix ouvrez un terminal et vérifier que git --version réponde.

#  Placer vous en ligne de commande sur un réperoire de travail
#  (La commande pour se déplacer est CD (Change Directory), la commande pour créer un répertoire est MKDIR (make directory)
#  Initialisation d'un DÉPOT:
#  Utiliser la commande:
#  $ git init 
#  Cette commande génère un répertoire caché .git qui contient le DÉPOT. Il ne faut donc jamais le supprimer sous peine de perdre les informations de modifications !!!!

#  Ajouter un fichier texte quelconque ainsi qu'une image quelconque au répertoire de travail.
#  Utiliser la commande:
#  $ git status
#  Cette commande doit générer un message en anglais vous informant que :
#  Vos fichiers sont "untracked" c'est à dire non versionnés.
#  Il vous propose d'utiliser la commande git add <file> pour versionner les fichiers.

#  utiliser la commande:
#  $ git add NomDuFichier.extension
#  Sur chaque fichier ajouté ( on peut aussi utiliser la commande git add *)

#  Utiliser la commande:
#  $ git status
#  Les fichiers doivent êtres dans un état : new file: NomDuFichier.extension
#  Git vous informe que des 'Changes' (MODIFICATIONS) sont prêtes à être 'COMMITER' (soumise)

#  Utiliser la commande:
#  $ git commit
#  Cette action lance l'éditeur par défaut.
#  Par défaut VI . Utiliser i pour inserer du text et <Esc>:wq pour sauver    
#  Dans l'éditeur écrivez le but de la modification (ici ajouts de fichiers)
#  Sauver le message du 'COMMIT'
#  L'action de COMMIT envoie les MODIFICATIONS (Changes) sur le DÉPOT local.

#  Maintenant modifier un fichier texte (ajouter des lignes) et sauver le
#  Utiliser la commande:
#  $ git status
#  Dans ce cas on remarque que git vous informe: 'modified : NomDuFichierModifier.extension

#  Il faut ensuite commiter la modification sur le DÉPOT
#  $ git commit
#  Et vérifier que tout c'est bien passé
#  $ git status

#  Pour supprimer un fichier du versionning:
#  $ git rm NomDuFichier.extension
#  et bien sur toujours commiter
#  $ git commit

#  Si on supprime dirrectement un fichier sur le disque. (sans passer par la commande git rm)
#  $ git status
#  Git détecte que le fichier supprimé est manquant et vous propose de le supprimer en utilisant git rm.

#  Généralement on ne souhaite pas que les fichiers générés (fichier.class en java .o en c... )
#  soient versionné.
#  Pour que git ignore ces fichiers (et répertoires) on va écrire un fichier .gitignore dans le répertoire de travail
#  Ouvrez dans un éditeur de texte le fichier .gitignore
#  Dans ce fichier ajouter les lignes suivantes

#  *.pyc
#  *.class
#  *.o
#  build
#  bin

#  Tout les fichiers se terminant par l'extension .pyc, .class ou .o seront ignoré par git
#  Le répertoire build est également ignoré. Dans de nombreux projets on génère les executables dans les répertoires build ou bin.

#  Déplacer les fichiers.
#  Attention git ne suit pas automatiquement les mouvements/renommages des fichiers.
#  Pour déplacer/renommer un fichier il faut utiliser la commande:
#  $ git mv nom_origine.extension nom_cible.extension

#  Cela permet à l'outil de suivre les modifications même si le fichier est déplacer, mais également de garder en mémoire la position du fichier dans l'historique!

#  Visualiser les différents moditifactions
#  Utiliser la commande
#  $ git log
#  L'affichage des différentes versions (de la plus récente à la plus ancienne). 
#  Pour une approche plus visuelle utiliser la commande
#  $ gitk

#  Annuler les actions:
#  Dans le cas ou vous avez fait un COMMIT, mais que vous avez oublié des fichiers/modifactions vous utiliser alors la commande suivante:
#  $ git commit --amend

#  Par exemple:
# $ git commit -m "validation initiale"
# $ git add fichier_oublie
# $ git commit --amend
# Ces trois dernières commandes donnent lieu à la création d'un unique commit — la seconde validation remplace le résultat de la première.

# Pour annuler les éléments d'un commit:
# $ git reset HEAD NomDuFichier.extension
# Dans ce cas le fichier repasse à un état dit non indexé (la modification n'est plus dans le prochain commit)

# Pour revenir à la version du DÉPOT:
# $ git checkout -- NomDuFichier.extension
# Dans ce cas les modifications sont écrasé par la version présente sur le DÉPOT c'est une commande à utiliser AVEC PRÉCAUTION!!! (Dans le cas ou on a fait une bêtise, rendu son code complètement innopérable depuis le dernier COMMIT).

# Exercice:
#  Ajouter plusieurs Fichiers et faites les 'vivres' en les modifiants et en effectuant plusieurs commit.
#  L'objectif de l'exercice est de bien comprendre les différentes commandes en les utilisants

# I.2 Travail en équipe sur un dépot GIT
#   Le projet ZombieKiller est disponible sur un DÉPOT Git distant hébergé par le service GitHub.

#  Utiliser la commande:
#  $ git clone https://github.com/BTS-SIO2-2013/ZombieKiller.git
#  Cette commande vas 'cloner' le DÉPOT distant du projet ZombieKiller
#  Vous disposer désormais d'une copie local dit DÉPOT local du projet ZombieKiller dans le répertoire ZombieKiller (notez que ce répertoire contient bien un dossier .git)

#  La commande:
#  $ git remote
#  Vous permet de voir les différents dépots distant, ici vous ne devez avoir qu'un seul dépot 'origin'

#  Pour soumettre ('POUSSER') les modifications (VERSIONS) du dépot local sur le dépot distant on utilise la commande:
#  $ git push

#  Pour récuperer ('TIRER') les VERSIONS du DÉPOT distant sur le DÉPOT local on utilise la commande:
#  $ git pull


#  Une session de travail de deux développeurs sur le projet donne:
#  $Dev1 git pull
#                                                           $Dev2 git pull
#  $Dev1 git add Fichier1.txt
#  $Dev1 git commit -m"Ajout du fichier 1"
#                                                           $Dev2 git add Fichier2.txt
#                                                           $Dev2 git commit -m"Ajout du fichier 2"
#                                                           $Dev2 git push
#  $Dev1 git push /// ECHEC 
#  $Dev1 git pull
#  $Dev1 git commit -m"Prise en compte du fichier 2"
#  $Dev1 git push

# Exercice:
# Modifier le fichier README.md pour y ajouter vos noms et prénoms

# Nous aborderons dans un prochain cours la notion de 'branches'. Ce cour est en grande partie basé sur la docummentation de git disponible sur : http://git-scm.com/book/fr/

# II Développer en équipe.

# Pour la suite du cours vous allez développer en équipe les différents éléments du monde du jeu ZombieKiller.
# Lors des précédents cours:
#      Nous avons ajouté :
#               - Le joueur
#               - Les zombies

# Il vous est demandé de vous organiser pour vous partager les taches suivantes:
#       Création des Armes
#               - Hache [h]
#               - Fusil à pompe [p]
#               - Révolver 6 coups [r]
#       Création du Décors
#               - Mur [w] (wall)
#               - Vitre [v]
#       Création des Bonus
#               - Trousse de soin [s]
#               - Munitions [m]
#               - Invincibilité [i]

# Chaque tâche doit être accompagné, PILOTÉ! par ses tests.
# Les objets doivent ensuite être ajouté à la grille dont la sortie doit être la suivante:
#   0  1  2  3  4
#0 [w][w][v][w][w]
#1 [w][j][h][p][w]
#2 [w][s][m][z][w]
#3 [w][i][w][r][w]
#4 [w][w][w][w][w]

# La note d'équipe sera moyenné avec une note de participation individuelle laissé à mon appreciation.

