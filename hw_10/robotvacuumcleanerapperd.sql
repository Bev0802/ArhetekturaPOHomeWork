CREATE TABLE "public.User" (
	"idUser" serial NOT NULL,
	"hashIoginPasword" TEXT NOT NULL,
	"name" TEXT NOT NULL,
	"e-mail" TEXT NOT NULL,
	CONSTRAINT "User_pk" PRIMARY KEY ("idUser")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Robots" (
	"idRobot" serial NOT NULL,
	"model" TEXT NOT NULL,
	"fabricNum" TEXT NOT NULL,
	"idGroup" integer NOT NULL,
	"version" TEXT NOT NULL,
	"ipAddress" integer NOT NULL,
	"statistica" integer NOT NULL,
	CONSTRAINT "Robots_pk" PRIMARY KEY ("idRobot")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Grour" (
	"idGrour" serial NOT NULL,
	"group" TEXT NOT NULL,
	"idUser1" TEXT NOT NULL,
	"idUser2" TEXT NOT NULL,
	"idUser3" TEXT NOT NULL,
	CONSTRAINT "Grour_pk" PRIMARY KEY ("idGrour")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Schedule" (
	"idSchedule" serial NOT NULL,
	"IdRobots" integer NOT NULL,
	"dateTime" DATE NOT NULL,
	"idTypeJ" integer NOT NULL,
	CONSTRAINT "Schedule_pk" PRIMARY KEY ("idSchedule")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.TypeJ" (
	"idTypeJ" serial NOT NULL,
	"nameType" integer NOT NULL,
	CONSTRAINT "TypeJ_pk" PRIMARY KEY ("idTypeJ")
) WITH (
  OIDS=FALSE
);




ALTER TABLE "Robots" ADD CONSTRAINT "Robots_fk0" FOREIGN KEY ("idGroup") REFERENCES "Grour"("idGrour");

ALTER TABLE "Grour" ADD CONSTRAINT "Grour_fk0" FOREIGN KEY ("idUser1") REFERENCES "User"("idUser");
ALTER TABLE "Grour" ADD CONSTRAINT "Grour_fk1" FOREIGN KEY ("idUser2") REFERENCES "User"("idUser");
ALTER TABLE "Grour" ADD CONSTRAINT "Grour_fk2" FOREIGN KEY ("idUser3") REFERENCES "User"("idUser");

ALTER TABLE "Schedule" ADD CONSTRAINT "Schedule_fk0" FOREIGN KEY ("IdRobots") REFERENCES "Robots"("idRobot");
ALTER TABLE "Schedule" ADD CONSTRAINT "Schedule_fk1" FOREIGN KEY ("idTypeJ") REFERENCES "TypeJ"("idTypeJ");

ALTER TABLE "TypeJ" ADD CONSTRAINT "TypeJ_fk0" FOREIGN KEY ("idTypeJ") REFERENCES "Schedule"("id");






