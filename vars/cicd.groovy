def newgit(xyz)
{
  git "${xyz}"
}

def newmaven()
{
sh 'mvn package'
}

def newdeploy(ip,context)
{
  "deploy adapters: [tomcat9(credentialsId: '2679f672-cf04-4c01-8265-bf657e86db6b', path: '', url: 'http://${ip}:8080')], contextPath: '${context}', war: '**/*.war'"
}
