def call(String ProjectName, String ImageTag, String DockerHubUser) {
    echo "Building Docker image: ${DockerHubUser}/${ProjectName}:${ImageTag}"
    sh """
        docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} .
    """
}
