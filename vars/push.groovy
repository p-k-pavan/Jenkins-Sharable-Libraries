def call(String imageName) {
    echo "Pushing ${imageName} to Docker Hub"

    withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable: 'DOCKER_USE', passwordVariable: 'DOCKER_PASS')]) {
        sh "echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin"
        sh "docker tag ${imageName}:latest \$DOCKER_USER/${imageName}:latest"
        sh "docker push \$DOCKER_USER/${imageName}:latest"
    }
}
