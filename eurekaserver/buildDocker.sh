#!/bin.bash
export Dockerfile_01=Dockerfile8762
export Dockerfile_02=Dockerfile8763
export springboot_image_01=springboot_image_8762
export springboot_image_02=springboot_image_8763
export id8762=`docker images|grep $springboot_image_01|grep latest|awk '{print $3}'`
export id8763=`docker images|grep $springboot_image_02|grep latest|awk '{print $3}'`

docker stop $springboot_image_01 $springboot_image_02
docker rm $springboot_image_01 $springboot_image_02

docker tag $id8762 $springboot_image_01:`date +%Y%m%d%H%M%S`
docker tag $id8763 $springboot_image_02:`date +%Y%m%d%H%M%S`

docker rmi $springboot_image_01:latest $springboot_image_02:latest

docker build -t $springboot_image_01 -f $Dockerfile_01 .
docker build -t $springboot_image_02 -f $Dockerfile_02 .

docker run -d -p 8762:8762 $springboot_image_01
docker run -d -p 8763:8763 $springboot_image_02



