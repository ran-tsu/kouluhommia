/* Siivilöi filter-metodilla movies.js taulukosta vain ne elokuvat,
jotka ovat ilmestyneet vuoden 2011 jälkeen.*/

var movies = [ 
  { 
     title: 'Harry Potter and the Deathly Hallows: Part 2', 
     director: 'David Yates', 
     release: 2011  
   },
   { 
     title: 'The Lord of the Rings: The Fellowship of the Ring', 
     director: 'Peter Jackson', 
     release: 2001  
   }, 
   { 
     title: 'Titanic', 
     director: 'James Cameron', 
     release: 1997 
   }, 
   { 
     title: 'Avatar', 
     director: 'James Cameron', 
     release: 2009 
   }, 
   { 
     title: 'The Hobbit: An Unexpected Journey', 
     director: 'Peter Jackson', 
     release: 2012 
   }, 
   { 
     title: 'The Matrix', 
     director: 'Andy Wachowski', 
     release: 1999 
   }, 
   { 
     title: 'Inception', 
     director: 'Christopher Nolan', 
     release: 2010 
   }, 
   { 
     title: 'The Town', 
     director: 'Ben Affleck', 
     release: 2010 
   }, 
   { 
     title: 'The Dark Knight Rises', 
     director: 'Christopher Nolan', 
     release: 2012 
   }, 
   { 
     title: 'My Neighbor Totoro', 
     director: 'Hayao Miyazaki', 
     release: 1988 
   }, 
   { 
     title: 'Spirited Away', 
     director: 'Hayao Miyazaki', 
     release: 2001 
   } 
];

function newmovies(item) {
  var newlist = [item.title,item.director,item.release];
  return newlist;
}
var afterYear = movies.filter(movies => movies.release > 2011);
for (var i = 0; i < afterYear.length; i++) {
      console.log(" " + afterYear.map(newmovies).slice(i, i + 1));
}