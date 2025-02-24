def call(String imageName) {
    echo "Pushing ${imageName}:latest to Docker Hub"

    withCredentials([usernamePassword(credentialsId: 'DOCKER_HUB_CREDENTIALS', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh "echo \$DOCKER_PASS | docker login --username \$DOCKER_USER --password-stdin"
        sh "docker tag ${imageName}:latest \$DOCKER_USER/${imageName}:latest"
        sh "docker push \$DOCKER_USER/${imageName}:latest"
    }
}
