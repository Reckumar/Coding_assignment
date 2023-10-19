//for string array
// const array = ['b', 'z', 'a', 'f'];
// const descArray = array.sort().reverse();
// console.log(descArray);


const arrOfInt = [23, 4, 63, 1, 2, 5];
function arrSort(arr){
    arr.sort((a, b) => b - a);
    return arr;
}
console.log(arrSort(arrOfInt));

