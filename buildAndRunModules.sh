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
buildModule 'serviceProviderInterface' 'thepackage/interfacepackage'
buildModule 'serviceLocator' 'thepackage/locatorpackage'
buildModule 'consumer' 'thepackage/consumerpackage'
buildModule 'serviceProvider' 'thepackage/providerpackage'

echo "##### Running the Consumer #####"
java -p mods -m consumer/thepackage.consumerpackage.Consumer
