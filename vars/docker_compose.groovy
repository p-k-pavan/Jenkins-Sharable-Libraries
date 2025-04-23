def call() {
    echo "Bringing down existing Docker Compose services..."
    sh "docker-compose down || echo 'Nothing to stop or error during down — proceeding...'"
    
    echo "Starting Docker Compose services..."
    sh "docker-compose up -d"
}
