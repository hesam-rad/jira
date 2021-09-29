pipeline {
    agent any
    tools {
        maven 'maven-3.6.3'
    }
    stages {
        stage('Download Feature Files'){
            steps {
                downloadFeatureFiles serverAddress: 'http://jira.gamelectronics.com/secure/Tests.jspa#/testCycle/RC-C2?testRunFolderId=3818',
                    projectKey: 'rc-c2',
                    targetPath:'src/test/resources/features'
            }
        }
        stage('Clean Work Space'){
            steps {
                sh 'mvn clean'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            publishTestResults serverAddress: 'http://jira.gamelectronics.com',
                    projectKey: 'rc-c2',
                    filePath:'target/cucumber/*.json',
                    format: 'Cucumber',
                    autoCreateTestCases: false
        }
    }
}
