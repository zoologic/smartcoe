pipeline {
    agent any
    stages {
		stage('Build') {
			steps {
				load "${WORKSPACE}//pipeline.properties"
                sh "source /root/softwares/env.sh"
				sh "mvn ${MVN_BUILD_PARAMETER_ONE} ${MVN_BUILD_PARAMETER_TWO} ${MVN_BUILD_PARAMETER_THREE}"
			}
		}
       
		stage('Deploy') {
			steps {
				withCredentials([usernamePassword(credentialsId: "${PCF_CREDENTIALS_ID}", usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
					script {
						load "${WORKSPACE}//pipeline.properties"
						sh "cf login -a ${PCF_ENDPOINT_NAME} -u $USERNAME -p $PASSWORD -o ${PCF_ORG} -s ${PCF_SPACE} --skip-ssl-validation"
						sh "cf zero-downtime-push ${PCF_APP_NAME} -f manifest.yml"
					}
				}
			}
		}
		
		stage('Analyze') {
			steps {
				load "${WORKSPACE}//pipeline.properties"
				sh "mvn sonar:sonar"
			}
		}
    }

	post { 
		always { 
			cleanWs()
		}
	}
}