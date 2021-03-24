# DevAndLive-Profiles
Digitalocean Dev ve Canlı ortamları için test projesi.application-dev.properties(test branchi), application-prod.properties(master branchi), application.properties.

JENKINS DEV SISTEM SHELL
---------------------------------------------
mvn clean package -P dev
sudo systemctl restart devspring.service

JENKINS LIVE SISTEM SHELL
---------------------------------------------
mvn clean package -P prod
sudo systemctl restart livespring.service
