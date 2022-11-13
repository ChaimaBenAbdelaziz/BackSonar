

properties([pipelineTriggers([githubPush()])])
pipeline {
    agent any 
        tools { 
        maven "MyProjectDevops"
        
    } 
  environment {
        NEXUS_VERSION = "nexus3"
        NEXUS_PROTOCOL = "http"
        NEXUS_URL = "172.10.0.140:8081"
        NEXUS_REPOSITORY = "maven-nexus-repo"
        NEXUS_CREDENTIAL_ID = "nexus-user-credentials"
    }
      
    
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
         stage("Publish to Nexus Repository Manager") {
            steps {
                script {
                    pom = readMavenPom file: "pom.xml";
                    filesByGlob = findFiles(glob: "target/*.${pom.packaging}");
                    echo "${filesByGlob[0].name} ${filesByGlob[0].path} ${filesByGlob[0].directory} ${filesByGlob[0].length} ${filesByGlob[0].lastModified}"
                    artifactPath = filesByGlob[0].path;
                    artifactExists = fileExists artifactPath;
                    if(artifactExists) {
                        echo "*** File: ${artifactPath}, group: ${pom.groupId}, packaging: ${pom.packaging}, version ${pom.version}";
                        nexusArtifactUploader(
                            nexusVersion: NEXUS_VERSION,
                            protocol: NEXUS_PROTOCOL,
                            nexusUrl: NEXUS_URL,
                            groupId: pom.groupId,
                            version: pom.version,
                            repository: NEXUS_REPOSITORY,
                            credentialsId: NEXUS_CREDENTIAL_ID,
                            artifacts: [
                                [artifactId: pom.artifactId,
                                classifier: '',
                                file: artifactPath,
                                type: pom.packaging],
                                [artifactId: pom.artifactId,
                                classifier: '',
                                file: "pom.xml",
                                type: "pom"]
                            ]
                        );
                    } else {
                        error "*** File: ${artifactPath}, could not be found";
                    }
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
