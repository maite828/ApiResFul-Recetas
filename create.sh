#!/bin/sh

sudo mv recetas-1.0-SNAPSHOT.zip /opt
cd ..
cd opt
sudo unzip recetas-1.0-SNAPSHOT.zip
sudo rm -rf recetas-1.0-SNAPSHOT.zip
sudo recetas-1.0-SNAPSHOT/bin/recetas -DapplyEvolutions.default=true -Dhttp.port=80

exit 0
