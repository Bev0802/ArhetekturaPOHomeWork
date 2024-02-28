CREATE TABLE "public.Client" (
	"idClient" serial NOT NULL,
	"name" TEXT NOT NULL,
	"login" TEXT NOT NULL,
	"pasword" integer NOT NULL,
	"e-mail" TEXT NOT NULL,
	"phone" integer NOT NULL,
	"dataB" DATE NOT NULL,
	CONSTRAINT "Client_pk" PRIMARY KEY ("idClient")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Table" (
	"idTable" serial NOT NULL,
	"seats" integer NOT NULL,
	"idHall" integer NOT NULL,
	"idImg" integer NOT NULL,
	"coment" TEXT NOT NULL,
	CONSTRAINT "Table_pk" PRIMARY KEY ("idTable")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Hall" (
	"idHall" serial NOT NULL,
	"nameHall" TEXT NOT NULL,
	CONSTRAINT "Hall_pk" PRIMARY KEY ("idHall")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Image" (
	"idImage" serial NOT NULL,
	"byte" integer NOT NULL,
	CONSTRAINT "Image_pk" PRIMARY KEY ("idImage")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "public.Order" (
	"idOrder" serial NOT NULL,
	"idClient" integer NOT NULL,
	"idTable" integer NOT NULL,
	"dateTimeStart" DATE NOT NULL,
	"dateTimeEnd" DATE NOT NULL,
	"prise" integer NOT NULL,
	CONSTRAINT "Order_pk" PRIMARY KEY ("idOrder")
) WITH (
  OIDS=FALSE
);




ALTER TABLE "Table" ADD CONSTRAINT "Table_fk0" FOREIGN KEY ("idHall") REFERENCES "Hall"("idHall");
ALTER TABLE "Table" ADD CONSTRAINT "Table_fk1" FOREIGN KEY ("idImg") REFERENCES "Image"("idImage");



ALTER TABLE "Order" ADD CONSTRAINT "Order_fk0" FOREIGN KEY ("idClient") REFERENCES "Client"("idClient");
ALTER TABLE "Order" ADD CONSTRAINT "Order_fk1" FOREIGN KEY ("idTable") REFERENCES "Table"("idTable");






