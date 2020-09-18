����   4 �  servlet/UserFormServlet  javax/servlet/http/HttpServlet serialVersionUID J ConstantValue        userDirectory Ljava/util/Hashtable; 	Signature ;Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>; <init> ()V Code
     LineNumberTable LocalVariableTable this Lservlet/UserFormServlet; init  java/util/Hashtable
  	   
  doGet R(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V 
Exceptions ! javax/servlet/ServletException # java/io/IOException % username ' ) ( %javax/servlet/http/HttpServletRequest * + getParameter &(Ljava/lang/String;)Ljava/lang/String; - password / submit
  1 2 3 checkParameter (Ljava/lang/String;)Z 5 	text/html 7 9 8 &javax/servlet/http/HttpServletResponse : ; setContentType (Ljava/lang/String;)V 7 = > ? 	getWriter ()Ljava/io/PrintWriter; A <!Doctype html><html><head>
 C E D java/io/PrintWriter F ; println H <title>Login</title> J @<link rel='stylesheet' type='text/css' href='styles/styles.css'> L </head><body> N <div class='user_form'> P <h2>Login</h2> R 1<form method='GET' + action='/assignment1/login'> T <table border><tr><th> V User name: </th><td  X  style='background-color:red;' Z java/lang/StringBuilder \ +><input type='text' name='username' value='
 Y ^  ; `  
 Y b c d append -(Ljava/lang/String;)Ljava/lang/StringBuilder; f ' size='20'></td></tr>
 Y h i j toString ()Ljava/lang/String; l <tr><th>Password: </th><td  n /><input type='password' name='password' value=' p </textarea></td></tr> r L<tr><th></th><td><input type='submit' name='submit' value='Login'></td></tr> t </table></form> v </div> x </body></html>
  z {  doPost request 'Ljavax/servlet/http/HttpServletRequest; response (Ljavax/servlet/http/HttpServletResponse; Ljava/lang/String; action usernameCheck Z passwordCheck out Ljava/io/PrintWriter; StackMapTable � java/lang/String
 � � � j trim
 � � � � isEmpty ()Z � null
 � � � � equals (Ljava/lang/Object;)Z 	parameter � /assignment1/forum?username= 7 � � ; sendRedirect 
SourceFile UserFormServlet.java !                
                /     *� �                               :     *� Y� � �       
                              "   �  	   +$� & N+,� & :+.� & :*-� 06*� 06,4� 6 ,� < :@� BG� BI� BK� BM� BO� BQ� BS� BU� B� � 
W� B� YY[� ]-� _� -� ae� a� g� Bk� B� � 
W� B� YYm� ]� _� � ae� a� g� Bo� Bq� Bs� Bu� Bw� B� � 	*+,� y�       � #    	      $  , % 4 ( < + C , J - Q . X / _ 0 f 4 m 5 t 6 { 7 � 8 � 9 � : � 9 � ; � < � = � > � ? � > � @ � A � B C D E F H    \ 	           | }     ~   	 % �   - �   � �  $ � � �  , � � �  < � � �  �   � � � 	  ' 7 � � � C  �  	  ' 7 � � � C  C Y�   	  ' 7 � � � C  C Y �%�  	  ' 7 � � � C  C Y�  	  ' 7 � � � C  C Y �� @  2 3     `     +� +� �� �� +�� �� ��           J  K  L                � �  �      {          "    `     ,� YY�� ]+$� & � a� g� � �       
    P  Q                 | }     ~    �    �