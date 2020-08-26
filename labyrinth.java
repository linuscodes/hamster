void main() {
   solveLabyrith();
}

// turn right
void rechtsUm() {
   linksUm();
   linksUm();
   linksUm();
}

// check if the left side is free to walk to
boolean linksFrei() {
   linksUm();
   boolean frei = vornFrei();
   rechtsUm();

   return frei;
}

// check if hamster is in the middle
boolean finished() {
   boolean frei = false;

   for(int i = 0; i < 3; i++) {
      linksUm();
      frei = vornFrei();
   }

   return frei;
}

// solve labyrinth
void solveLabyrith() {
   int finishedCounter = 0;
   vor();

   while(finishedCounter <= 4) {
      while(!finished()) {
         if(!linksFrei()) {
            vor();
         } else {
            linksUm();
            vor();
         }

         if(kornDa()) {
            nimm();
         }
      }

      finishedCounter++;
   }
}
