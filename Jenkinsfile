node{
    stage('SCM Checkout'){
        git credentialsId: 'Git_token', url: 'https://github.com/AnilComakeit/RestApiDocker.git'
    }
    stage('Run Docker Compose File'){
        sh 'sudo docker-compose build'
        sh 'sudo docker-compose up -d'
    }
    
    stage('Push Image To Docker Hub'){
        sh 'sudo docker login -u "anil76201" -p "Reddy@0108" docker.io'
        sh 'sudo docker push anil76201/springrest:v1'
    }
}
