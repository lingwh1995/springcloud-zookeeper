pipeline {
  agent any
  stages {
    stage('检出') {
      steps {
        echo '开始检出...'
        checkout([
          $class: 'GitSCM',
          branches: [[name: env.GIT_BUILD_REF]],
          userRemoteConfigs: [[url: env.GIT_REPO_URL, credentialsId: env.CREDENTIALS_ID]]
        ])
        echo '结束检出...'
      }
    }
    stage('推送部署') {
      steps {
        echo '正在推送文件...'
        echo '${GIT_COMMIT_MSG}'
        sh 'git fetch https://lingwh1995:04cacc5f135e93b1ed679462a55260b7@gitee.com/lingwh1995/springcloud-zookeeper.git'
        sh 'git push -f https://lingwh1995:04cacc5f135e93b1ed679462a55260b7@gitee.com/lingwh1995/springcloud-zookeeper.git HEAD:master'
        //sh 'git fetch https://lingwh1995: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@github.com/lingwh1995/springcloud-zookeeper.git'
        //sh 'git push -f https://lingwh1995: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@github.com/lingwh1995/springcloud-zookeeper.git HEAD:master'
        echo '完成文件推送...'
      }
    }
  }
}