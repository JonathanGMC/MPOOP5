class Main {
  public static void main(String[] args) {
  Circulo cir = new Circulo();
  System.out.println(cir);//imprime 0 por ... (video)

  cir.setRadio(5.6f);//primer solucion
  System.out.println(cir);

  cir.setRadio((float) 7.33);//segunda solucion
  System.out.println(cir);
  
  float var = -8.66f;
  cir.setRadio(var);
  System.out.println(cir);//imprime negativos y no es correcto

  System.out.println("* Composicion *");
  Persona persona_1 = new Persona("jonathan","Morales",3,6,2002);
  System.out.println(persona_1);
  /*persona1.setNombre("Jonathan");
  persona1.setApellido("Morales");
  Fecha fecha = new Fecha(3,6,2002);
  persona1.setfNacimiento(fecha);
  System.out.println(persona1);
  System.out.println(persona1.getfNacimiento().getAnio());*/

  System.out.println("* Composicion *");
  Persona persona_2 = new Persona("Rafael","Zavala",8,4,1998);
  System.out.println(persona_2);

  System.out.println("* Extra *");
  Persona persona1 = new Persona("Melquiades","Reyes",7,12,1975);
  Persona persona2 = new Persona("Raul","Morales",1,8,1971);
  Persona persona3 = new Persona("Lucero","Reyes",26,6,1996);
  Persona persona4 = new Persona("Rubi","Reyes",26,9,2004);
  Coche coche1 = new Coche("Gris","Grand voyager",5,2005,600);
  System.out.println(coche1);
  System.out.println("chofer = "+persona1);
  System.out.println("copiloto = "+persona2);
  System.out.println("pasajero1 = "+persona3);
  System.out.println("pasajero2 = "+persona4);
  }
}