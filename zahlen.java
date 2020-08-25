void main() {
   schreibeZwei();
}

void rechtsUm() {
   linksUm();
   linksUm();
   linksUm();
}

void andereRichtung() {
   linksUm();
   linksUm();
   linksUm();
   linksUm();
}

void gibUndGeh() {
   if(!kornDa()) {
      gib();
   }
   vor();
}

void schreibeNull() {
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   rechtsUm();

   while(vornFrei()) {
      vor();
   }
   rechtsUm();
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   rechtsUm();

   while(vornFrei()) {
      vor();
   }
}

void schreibeEins() {
   for(int i = 0; i < 2; i++) {
      gib();
      linksUm();
      vor();
      rechtsUm();
      vor();
   }

   rechtsUm();

   while(vornFrei()) {
      vor();

      if(!kornDa()) {
         gib();
      }
   }
}

void schreibeZwei() {
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   rechtsUm();
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   rechtsUm();
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   linksUm();
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   linksUm();
   for(int i = 0; i < 3; i++) {
      gibUndGeh();
   }
}

void schreibeDrei() {
   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   rechtsUm();

   while(vornFrei()) {
      vor();
      gib();
   }
   rechtsUm();

   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   rechtsUm();

   vor();
   vor();
   rechtsUm();

   for(int i = 0; i < 2; i++) {
      gibUndGeh();
   }
}

void schreibeVier() {
   for (int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   linksUm();

   for (int i = 0; i < 2; i++) {
      gibUndGeh();
   }
   linksUm();

   while(vornFrei()) {
      vor();
   }
   andereRichtung();

   while(vornFrei()) {
      gib();
      vor();
   }
}
