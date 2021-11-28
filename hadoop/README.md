# Apache Hadoop
## Steps
1. Used images from `https://hub.docker.com/r/bde2020/hadoop-datanode` and `https://hub.docker.com/r/bde2020/hadoop-namenode`
2. Used the commands mentioned from the main [ReadMe](https://github.com/florescss14/BigDataProcessingApp/blob/main/README.md) to get the images onto GCP
3. Go to workloads and hit deploy and select the images.
4. For the namenode add an environmental variable for CLUSTER_NAME=cluster. It doesn't really matter the name.
5. For the datanode add an environmental variable SERVICE_PRECONDITION=IP:8020 as that is the service node that the namenode has by default.
6. The namenode is listening on port `9870` to display hadoop statistics and as seen in the documentation as well as port `8020` is the service port for the datanodes and must be exposed as well.

