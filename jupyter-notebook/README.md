# Jupyter Notebook
## Steps
1. Used image from `https://hub.docker.com/r/jupyter/base-notebook`
2. Used the commands mentioned from the main [ReadMe](https://github.com/florescss14/BigDataProcessingApp/blob/main/README.md) to get the image onto GCP
3. Go to workloads and hit deploy and select the image.
4. The documentation said that it was listening on port `8888` so after the pods were created I exposed port `8888`
5. This allowed access on the specific IP and port `8888`
