void main() {
   erklimmeUndSammle();

   geheNachOben();

   legeKoerner();
}

// turn right
void rechtsUm() {
   linksUm();
   linksUm();
   linksUm();
}

// move to start position for putting down the corns
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

// procedure for putting down two corns
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

// procedure for putting down three corns
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

// loop for putting down all corns until the hamster has none left
void legeKoerner() {
   while(!maulLeer()) {
      legeZweiKoerner();
      legeDreiKoerner();
   }
}

// go upwards and collect all corns
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
