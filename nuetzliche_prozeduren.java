void main() {
   sicheresVor();
   sicheresNimm();
   sicheresGib();
   laufeVor();
   sammle();
   legAb();
}

void sicheresVor() {
   if(vornFrei()) {
      vor();
   }
}

void sicheresNimm() {
   if(kornDa()) {
      nimm();
   }
}

void sicheresGib() {
   if(!maulLeer()) {
      gib();
   }
}

void laufeVor() {
   while(vornFrei()) {
      vor();
   }
}

void sammle() {
   while(kornDa()) {
      nimm();
   }
}

void legAb() {
   while(!maulLeer()) {
      gib();
   }
}