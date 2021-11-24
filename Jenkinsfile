node{
    stage('SCM Checkout'){
        git credentialsId: 'Git', url: 'https://github.com/SivaKumarK1/RestApiDocker.git'
    }
    stage('Run Docker Compose File'){
        sh 'sudo docker-compose build'
        sh 'sudo docker-compose up -d'
    }
    
    stage('Push Image To Docker Hub'){
        sh 'sudo docker login -u "shimigami" -p "Sammy@123@" docker.io'
        sh 'sudo docker push anil76201/springrest:v1'
    }
}
