#!/bin/bash -ex

function buildModule(){
  dir=$1
  package=$2

  echo "#### Building $dir ####"

  javac -p mods ${dir}/src/${package}/*.java ${dir}/src/module-info.java
  jar -cvf mods/${dir}.jar -C ${dir}/src/ .
  echo
}


function buildCombinedModule(){
  dir=$1
  package1=$2
  package2=$3

  echo "#### Building $dir ####"

  javac -p mods ${dir}/src/${package1}/*.java ${dir}/src/${package2}/*.java ${dir}/src/module-info.java
  jar -cvf mods/${dir}.jar -C ${dir}/src/ .
  echo
}

echo "##### Building The Modules #####"
echo
buildCombinedModule 'service' 'thepackage/interfacepackage' 'thepackage/locatorpackage'
buildModule 'consumer' 'thepackage/consumerpackage'
buildModule 'serviceProvider' 'thepackage/providerpackage'

echo "##### Running the Consumer #####"
java -p mods -m consumer/thepackage.consumerpackage.Consumer
