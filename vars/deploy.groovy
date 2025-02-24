def call(String imageName, String containerName, int port) {
    echo "Deploying application: ${imageName}"

    sh """
    docker stop ${containerName} || true
    docker rm ${containerName} || true
    """

    sh "docker pull ${imageName}"

    sh "docker run -d -p ${port}:80 --name ${containerName} ${imageName}"
}
