# Ingenieria-de-software-II

mvn archetype:generate -DgroupId=com.notificaciones -DartifactId=notificaciones-sistema -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

cd notificaciones-sistema

gradle init --type java-application

mkdir -p src/main/java/com/notificaciones src/test/java

touch src/main/java/com/notificaciones/Usuario.java
touch src/main/java/com/notificaciones/CanalNotificacion.java
touch src/main/java/com/notificaciones/CanalEmail.java
touch src/main/java/com/notificaciones/CanalSMS.java
touch src/main/java/com/notificaciones/CanalPush.java
touch src/main/java/com/notificaciones/Notificacion.java
touch src/main/java/com/notificaciones/NotificacionEmail.java
touch src/main/java/com/notificaciones/NotificacionSMS.java
touch src/main/java/com/notificaciones/NotificationFactory.java
touch src/main/java/com/notificaciones/Main.java

touch src/test/java/UsuarioTest.java
touch src/test/java/NotificacionTest.java
touch src/test/java/CanalNotificacionTest.java
