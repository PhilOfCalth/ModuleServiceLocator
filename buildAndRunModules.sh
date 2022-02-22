#!/bin/bash -e

function buildModule(){
  dir=$1
  package=$2

  echo "#### Building $dir ####"

  javac -p mods ${dir}/src/${package}/*.java ${dir}/src/module-info.java
  jar -cvf mods/${dir}.jar -C ${dir}/src/ .
  echo
}


echo "##### Building The Modules #####"
echo
buildModule 'rebelHero' 'thepackage/heroInterfaces'
buildModule 'rebelHeroLocator' 'thepackage/locatorpackage'
buildModule 'rebelRecruiter' 'thepackage/recruiters'
buildModule 'heroProvider' 'thepackage/heros'

echo "##### Running the Consumer #####"
java -p mods -m rebelRecruiter/thepackage.recruiters.RebelRecruiter
java -p mods -m rebelRecruiter/thepackage.recruiters.RebelRecruiter
java -p mods -m rebelRecruiter/thepackage.recruiters.RebelRecruiter
