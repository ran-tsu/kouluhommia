/* Taulukossa on JSON-muotoista dataa movies.js.
Käsittele taulukkoa map-metodilla niin, että saat uuden taulukon,
jossa on elokuvista vain title- ja release-kentät. */

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
  var newlist = [item.title,item.release];
  return newlist;
}
for (var i = 0; i < movies.length; i += 1) {
  console.log(" " + movies.map(newmovies).slice(i, i + 1));
}