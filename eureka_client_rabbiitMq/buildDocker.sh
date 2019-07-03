#!/bin.bash
export springboot_image=springboot_image_eureka_rabbitmq
export imageid=`docker images|grep $springboot_image|grep latest|awk '{print $3}'`

docker stop $springboot_image
docker rm springboot_image

echo "容器已停止，并移除start"
docker ps -a|grep $springboot_image
echo "容器已停止，并移除end"


docker tag $imageid $springboot_image:`date +%Y%m%d%H%M%S`
docker rmi $springboot_image:latest

echo "镜像已重命名，start"
docker images|grep $springboot_image
echo "镜像已重命名，并移除end"

echo "重新创建镜像，start"
docker build -t $springboot_image .
docker images
echo "重新创建镜像，并移除end"

docker run -d -p 8183:8183 --add-host hadoopslave4:172.16.2.17 --name $springboot_image $springboot_image



