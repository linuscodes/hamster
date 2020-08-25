void main() {
   erklimmeUndSammle();

   geheNachOben();

   legeKoerner();
}

void rechtsUm() {
   linksUm();
   linksUm();
   linksUm();
}

void geheNachOben() {
   linksUm();
   vor();
   rechtsUm();

   while(vornFrei()) {
      vor();
   }

   linksUm();
   vor();
   vor();
   linksUm();
   vor();
}

void legeZweiKoerner() {
   rechtsUm();
   vor();
   linksUm();
   vor();
   vor();
   vor();
   linksUm();
   gib();
   gib();
}

void legeDreiKoerner() {
   rechtsUm();
   vor();
   linksUm();
   vor();
   vor();
   vor();
   linksUm();
   gib();
   gib();
   gib();
}

void legeKoerner() {
   while(!maulLeer()) {
      legeZweiKoerner();
      legeDreiKoerner();
   }
}

void erklimmeUndSammle() {
   int anzahlKoerner = 0;

   while(anzahlKoerner <= 12) {
      if(vornFrei()) {
         vor();
      } else {
         linksUm();
         vor();
         rechtsUm();
      }

      while(kornDa()) {
         nimm();
         anzahlKoerner++;
      }
   }
}
