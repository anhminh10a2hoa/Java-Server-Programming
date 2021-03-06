����   4 �  servlet/PostRequestHandler  javax/servlet/http/HttpServlet serialVersionUID J ConstantValue        data Ljava/util/Vector; 	Signature %Ljava/util/Vector<Lservlet/Message;>; <clinit> ()V Code  java/util/Vector
     <init>	   
  LineNumberTable LocalVariableTable
   this Lservlet/PostRequestHandler; doGet R(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)V 
Exceptions ! javax/servlet/ServletException # java/io/IOException % 	text/html ' ) ( &javax/servlet/http/HttpServletResponse * + setContentType (Ljava/lang/String;)V ' - . / 	getWriter ()Ljava/io/PrintWriter; 1 <html>
 3 5 4 java/io/PrintWriter 6 + println 8 <head> : <title>Search</title> < </head> > <body> @ <h1>Error</h1> B 6<p>This servlet does not handle HTTP Get requests!</p> D G<div style='text-align:center'><a href='index.html'>Main page</a></div> F </body> H </html> request 'Ljavax/servlet/http/HttpServletRequest; response (Ljavax/servlet/http/HttpServletResponse; out Ljava/io/PrintWriter; doPost
 Q S R java/util/Calendar T U getInstance ()Ljava/util/Calendar; W java/text/SimpleDateFormat Y 
yyyy-MM-dd
 V [  + ] servlet/Message _ name a c b %javax/servlet/http/HttpServletRequest d e getParameter &(Ljava/lang/String;)Ljava/lang/String; g message
 Q i j k getTime ()Ljava/util/Date;
 V m n o format $(Ljava/util/Date;)Ljava/lang/String;
 \ q  r 9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  t u v add (Ljava/lang/Object;)Z x <title>Welcome</title> z <h1>Inbox</h1>
  | } ~ get (I)Ljava/lang/Object;
 \ � � � toString ()Ljava/lang/String;
  � � � size ()I calendar Ljava/util/Calendar; 	formatter Ljava/text/SimpleDateFormat; i I StackMapTable 
SourceFile PostRequestHandler.java !               	 
                +      � Y� � �                         3     *� �       
                              "    �     L,$� & ,� , N-0� 2-7� 2-9� 2-;� 2-=� 2-?� 2-A� 2-C� 2-E� 2-G� 2�       6    &  (  *  +  , ! - ' . - / 3 0 9 1 ? 2 E 3 K 5    *    L       L I J    L K L   = M N   O          "   �     �� PN� VYX� Z:� � \Y+^� ` +f� ` -� h� l� p� sW,$� & ,� , :0� 27� 2w� 2;� 2=� 2y� 26� � � {� \� � 2�� � ����C� 2E� 2G� 2�       R    C  D  F & G 2 F 6 I > K F M M N T O [ P b Q i R p V v W � V � \ � ] � ^ � _    H    �       � I J    � K L   � � �   � � �  F g M N  s $ � �  �    � v   a ' Q V 3    �    �