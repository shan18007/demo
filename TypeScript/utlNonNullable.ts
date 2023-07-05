
interface allColors{
    color: "red" | "green" | "blue";
 }
function paint(cid: number,color:NonNullable<allColors['color']>){

}

paint(12,null);
