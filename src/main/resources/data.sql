-- PERSONAS
insert into "RONNY"."PERSONAS" (ID_PERSONA, DUI, NOMBRE, APELLIDO, GENERO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, REFERENCIA, ROL )
  values ('01','02030405-0','Ronny', 'Blanco','M','03/02/1991','ron123@gmail.com','7766-5443','no','PA-03');
 
 insert into "RONNY"."PERSONAS" (ID_PERSONA, DUI, NOMBRE, APELLIDO, GENERO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, REFERENCIA, ROL )
  values ('02','02030135-2','Wilbert','Aguilar','M','03/05/1993','wilo13@gmail.com','7261-5393','no','PA-04');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, DUI, NOMBRE, APELLIDO, GENERO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, REFERENCIA, ROL )
  values ('03','09283922-4','Nestor Josue','Argueta','M','13/12/1996','homersimp48@yahoo.es','7666-6666','no','PA-05');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, DUI, NOMBRE, APELLIDO, GENERO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, REFERENCIA, ROL )
  values ('04','02030135-7','Joaquin','Villatoro', 'M','06/07/2000','erv456@gmail.com','7000-1122','no','DOC-01' );
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, DUI, NOMBRE, APELLIDO, GENERO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, REFERENCIA, ROL )
  values ('05','04032011-3','Alexandra','Mendoza','F','02/05/1990','albo12@gmail.com','7343-2312','si','PA-06');
  
  
-- TIPOS DE EXAMENES

INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('01', 'General de Orina' , 'examen general de orina', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('02', 'General de Heces' , 'por parasitos', '--');  

INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('03', 'De Sangre' , 'examen general de sangre', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('04', 'General de Heces' , 'por sangre oculta', '--');

INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('05', 'Perfil Lipidico' , 'por trigliceridos', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('06', 'Perfil Renal' , 'creatinina', '--');

INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('07', 'Perfil Renal' , 'acido urico', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('08', 'Perfil Hepatico' , 'bilirrubina', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('09', 'Panel b�sico metab�lico' , 'electrolitos', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('10', 'Panel b�sico metab�lico' , 'glucosa', '--');
  
 --USUARIOS 
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, ROLE) 
  	VALUES ('01', 'javainuse' , '123456', 'Napoleon', 'Balladares', 'user');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, ROLE) 
 	 VALUES ('02', 'admin', 'admin', 'Joel', 'Garcia', 'admin');  
  
  
  
  --ENCABEZADO EXAMEN
  
  INSERT INTO "RONNY"."ENCABEZADO_EXAMEN" ( ID_ENCABEZADO_EXAMEN, DESCRIPCION, ID_USUARIO) 
  VALUES ('01', 'Resultados de examenes' , '01');  
  
    INSERT INTO "RONNY"."ENCABEZADO_EXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_USUARIO) 
  VALUES ('02', 'Resultados de los examenes obtenidos' , '02');  
  
  
 -- DETALLE DE TIPO EXAMEN
INSERT INTO "RONNY"."DETALLE_TIPO_EXAMEN" (ID_DETALLE_TIPO_EXAMEN, CAMPO_EXAMEN, DESCRIPCION, REQUIERE_VALOR_NORMAL, VALOR_NORMAL, ID_PERSONA, ID_TIPO_EXAMEN) 
  VALUES ('01', 'Examen Fisico Quimico', 'Color: Amarillo Desidad: 1000 Glucosa: Negativo Aspecto: Ligeramente turbio', '1', '----', '03', '01');

  