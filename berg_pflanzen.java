void main() {
   vor();
   erklimmeBerg();
   kehreUm();
   bepflanzeBerg();
   gib();
   vor();
}

void rechtsUm() {
   linksUm();
   linksUm();
   linksUm();
}

void erklimmeStufe() {
   linksUm();
   vor();
   rechtsUm();
   vor();
}

void erklimmeBerg() {
   for(int i = 0; i < 5; i++) {
      erklimmeStufe();
   }
}

void kehreUm() {
   linksUm();
}

void bepflanzeUndVerlasseStufe() {
   vor();
   linksUm();
   vor();
   rechtsUm();
   gib();
}

void bepflanzeBerg() {
   for(int i = 0; i < 5; i++) {
      bepflanzeUndVerlasseStufe();
   }
}
