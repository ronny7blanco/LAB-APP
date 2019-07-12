-- PERSONAS
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL )
  values ('01','Ronny','Blanco','03/02/1991','ron123@gmail.com','7766-5443','inactivo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL )
  values ('02','Wilber','Hernandez','05/05/1994','wil321@gmail.com','7665-5643','inactivo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL )
  values ('03','Homero','Simpson','13/12/1996','homersimp48@yahoo.es','7666-6666','activo','doctor');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL)
  values ('04','Ervin','Romero','06/07/2000','erv456@gmail.com','7000-1122','inactivo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL)
  values ('05','Alex','Bonilla','02/05/1990/','albo12@gmail.com','7343-2312','activo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL)
  values ('06','Napo','Guevara','16/06/1997','nagu@gmail.com','7980-9878','activo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL )
  values ('07','Nestor','Argueta','23/01/1995','near23@gmail.com','7565-6565','inactivo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL)
  values ('08','Josue','Ayala','12/11/1989','joay45@gmail.com','7555-6565','activo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL)
  values ('09','Kelly','Hernandez','28/04/1998','kelly28@gmail.com','7677-7778','activo','paciente');
  
insert into "RONNY"."PERSONAS" (ID_PERSONA, NOMBRE, APELLIDO, FECHA_NACIMIENTO, E_MAIL, TELEFONO_CELULAR, ESTADO, ROL )
  values ('10','Maria','Andrade','07/06/1997','maan12@gmail.com','7665-4321','inactivo','paciente');
  
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
  VALUES ('09', 'Panel básico metabólico' , 'electrolitos', '--');
  
INSERT INTO "RONNY"."TIPOSEXAMENES" (ID_TIPO_EXAMEN, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('10', 'Panel básico metabólico' , 'glucosa', '--');
  
 --USUARIOS 
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('01', 'Administrador' , 'Napoleon Bonilla', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('02', 'Comun' , 'Joel Garcia', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('03', 'Comun' , 'Carlos Flores', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('04', 'Comun' , 'Jeremias Luna', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('05', 'Comun' , 'Edwin Ceren', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('06', 'Comun' , 'Beatriz Zuniga', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('07', 'Comun' , 'Ronny Blanco', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('08', 'Comun' , 'Nestor Ayala', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('09', 'Comun' , 'Joaquin Bolaños', '123456', 'activo');  
  
  INSERT INTO "RONNY"."USUARIOS" (ID_USUARIO, TIPO_EMPLEADO, NOMBRE_USUARIO, CONTRASEÑA, ESTADO) 
  VALUES ('10', 'Administrador' , 'Yissel Bonilla', '123456', 'activo'); 
  
  --ENCABEZADO EXAMEN
  
  INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (  DESCRIPCION, ID_PERSONA) 
  VALUES ('01', 'Resultados de los examenes obtenidos' , '01');  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('02', 'Resultados de los examenes obtenidos' , '02');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('03', 'Resultados de los examenes obtenidos' , '03');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('04', 'Resultados de los examenes obtenidos' , '04');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('05', 'Resultados de los examenes obtenidos' , '05');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('06', 'Resultados de los examenes obtenidos' , '06');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('07', 'Resultados de los examenes obtenidos' , '07');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('08', 'Resultados de los examenes obtenidos' , '08');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('09', 'Resultados de los examenes obtenidos' , '09');  
  
  
    INSERT INTO "RONNY"."ENCABEZADOEXAMEN" (ID_ENCABEZADO_EXAMEN,  DESCRIPCION, ID_PERSONA) 
  VALUES ('10', 'Resultados de los examenes obtenidos' , '10');  
  
  -- EXAMENES REALIZADOS
  
  INSERT INTO "RONNY"."EXAMENESREALIZADOS" (ID_EXAMEN_REALIZADO, NOMBRE_EXAMEN, DESCRIPCION, MUESTRA) 
  VALUES ('02', '' , '', '');  
  
  