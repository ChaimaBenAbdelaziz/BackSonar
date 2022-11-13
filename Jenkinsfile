

properties([pipelineTriggers([githubPush()])])
pipeline {
    agent any 
        tools { 
        maven "MyProjectDevops"
        
    } 
//   environment {
//         NEXUS_VERSION = "nexus3"
//         NEXUS_PROTOCOL = "http"
//         NEXUS_URL = "172.10.0.140:8081"
//         NEXUS_REPOSITORY = "maven-nexus-repo1"
//         NEXUS_CREDENTIAL_ID = "nexus-user-credentials"
//     }
      
    
    stages {
        stage('git clone') {
            steps {
               git branch: 'master', url: 'https://github.com/ChaimaBenAbdelaziz/SpringDevops'
        
            }
        }
        stage('clean package') {
            steps {
             sh 'mvn clean install -DskipTests=true'
        
        
            }
        }
        
        
         stage('mvn test') {
            steps {
             sh 'mvn test'
        
        
            }
        }
//         stage('MVN SONARQUBE') {
//             steps {
//                 sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar'
//             }
//         }
        
         stage('Nexus') {
            steps {
                script{
          nexusPublisher nexusInstanceId: 'nexus3',
                                          nexusRepositoryId: 'Maven-',
                                          packages: [[$class: 'MavenPackage', 
                                          mavenAssetList: [[classifier: '', extension: '', filePath: 'target/tpAchatProject-1.0.jar']], 
                                          mavenCoordinate: [artifactId: 'tpAchatProject', groupId: 'com.esprit.examen', packaging: 'jar', version: '1.0']]]      
                }
            }
        } 
         
//      stage ('NEXUS DEPLOY') {
//             steps {
//                 sh 'mvn clean package deploy:deploy-file -DgroupId=com.esprit.examen -DartifactId=tpAchatProject -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://172.10.0.140:8081/repository/maven-releases/ -Dfile=target/tpAchatProject-1.0.jar -DskipTests'
//             }
//         }

        
//          stage('push docker hub') {
//             steps {
//                 sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW'
   
//             }
//         }
        
//                  stage('Building our image') {
//                  			steps {
//                  				script {
//                  					dockerImage = docker.build registry + ":$BUILD_NUMBER"
//                  					}
//                  				}
//                  		}
                 		
        

//         stage('Deploy our image') {
//                           steps {
//                           script {
//                               docker.withRegistry( '', registryCredential ) {
//                               dockerImage.push()
//                                 }
//                              }
//                            }

//                          }
        
//            stage(' docker-compose') {
//             steps {
//                 sh 'docker-compose -f docker-compose-app.yml up -d'
   
//             }
//         }
        
               
//          stage('Building our image') {
//                  			steps {
//                  				script {
//                  					dockerImage = docker.build registry + ":$BUILD_NUMBER"
//                  					}
//                  				}
//                  		}
                 		
        

//         stage('Deploy our image') {
//                           steps {
//                           script {
//                               docker.withRegistry( '', registryCredential ) {
//                               dockerImage.push()
//                                 }
//                              }
//                            }

//                          }
//            stage(' docker-compose') {
//             steps {
//                 sh 'docker build -t test .'
   
//             }
//         } 
               
       
//          stage('Building our image') {
//                  			steps {
//                  				script {
//                  					dockerImage = docker.build registry + ":$BUILD_NUMBER"
//                  					}
//                  				}
//                  		}
//                  		stage('Deploy our image') {
//                           steps {
//                           script {
//                               docker.withRegistry( '', registryCredential ) {
//                               dockerImage.push()
//                                 }
//                              }
//                            }

//                          }
//     stage       ('DOCKER COMPOSE') {
//              steps {
//                 sh 'docker-compose up  -d'
//             }
//         }
        
        
        
     }
    
    
      post{
        always{
        
        emailext body: 'jenkins', subject: 'jenkins', to: 'chaima.benabdelaziz@esprit.tn'
        }
        
    }    
        

}
