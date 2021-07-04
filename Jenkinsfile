pipeline{
agent any
stages{
stage('Build'){
steps{
checkout scm
bat 'mvn clean compile'
}}
stage('Test'){
steps{
bat 'mvn test'
}}
}}