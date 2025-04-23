def call(String Project, String ImageTag, String DockerHubUser) {
    echo "Attempting to remove Docker image: ${DockerHubUser}/${Project}:${ImageTag}"
    sh """
        docker rmi ${DockerHubUser}/${Project}:${ImageTag} || echo 'Image not found or already removed — skipping.'
    """
}
