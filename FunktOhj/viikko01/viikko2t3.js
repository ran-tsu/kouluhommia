// Funktioita taulukossa.

'use strict'

const offset = [1,2];
const zoom = 2;
const rotate = Math.PI;

const point = { x: 1, y: 1};

const pipeline  = [   // 2D-muunnoksia
    
    function translate(p){
        return { x: p.x + offset[0], y: p.y + offset[1] };
    },

    function scale(p){
        return { x: p.x * zoom, y: p.y * zoom};
    },
    function rotation(p){
        return { x: p.x*Math.cos(rotate) - p.y*Math.sin(rotate), y: p.x*Math.sin(rotate) + p.y*Math.cos(rotate) };
    },
];


function muunnos(point){
     for(let i=0; i<pipeline.length; i++){   
        point = pipeline[i](point);
    }
    return point;
}


console.log(point);
console.log(muunnos(point));