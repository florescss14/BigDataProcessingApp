# BigDataProcessingApp

### Commands for creating images  
- **Pulling images**
  - docker pull ImageName  
- **Build image**
  - docker build -t florescss14/ImageName
- **Running images**
  - docker run -d -p PORT:PORT florescss14/ImageName
- **Uploading images to Docker Hub**
  - docker push florescss14/ImageName
  
### Commands for getting images on GCP
From the GCP console
- **Pulling images**
  - docker pull florescss14/ImageName  
- **Change tag to GCP tag**
  - docker tag florescss14/ImageName gcr.io/PROJECT_ID/florescss14/ImageName
- **Pushing image to deploy**
 - docker push gcr.io/PROJECT_ID/florescss14/ImageName
  
### How to Run Application
1. Pull all applications from https://hub.docker.com/u/florescss14 and use the commands above to get the images on GCP.
2. Now Deploy each app as seen in each of the application folders readme's.
3. Use `git pull https://github.com/florescss14/BigDataProcessingApp.git` and change the application IP addresses to the IP addresses of your application. Ports should remain the same.
4. Run `javac App.java` and then `java App`
5. DONE!

## Video
[Click here!](https://pitt-my.sharepoint.com/:v:/g/personal/cwf24_pitt_edu/EeuBCGRzGzZGglldvj8U0LEBgUTEZfbVgcyEKhsdHzR1Xw?e=Dip0EQ)
