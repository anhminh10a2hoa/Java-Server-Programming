����   4 ;  servlet/Message  java/lang/Object name Ljava/lang/String; message date <init> 9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V Code
   	  ()V	    	    	     LineNumberTable LocalVariableTable this Lservlet/Message; toString ()Ljava/lang/String;  java/lang/StringBuilder  Date: 
    	 ! (Ljava/lang/String;)V
  # $ % append -(Ljava/lang/String;)Ljava/lang/StringBuilder; ' <br /> ) Name:  + 	Message:  - <hr />
  /   getDate getName 
getMessage
 4 6 5 java/lang/String 7 8 valueOf &(Ljava/lang/Object;)Ljava/lang/String; 
SourceFile Message.java !                       	 
     l     *� *+� *,� *-� �              	 	  
      *                                  j     @� Y� *� � "&� "(� "*� � "&� "*� "*� � "&� ",� "� .�                   @      0      /     *� �                         1      /     *� �                         2      A     � Y*� � 3� &� "� .�                         9    :