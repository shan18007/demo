
interface allColors{
    color: "red" | "green" | "blue";
 }
function paintWall(id: number,color:NonNullable<allColors['color']>){
    return {
        id,
        color
    };
}
type painWallReturns = ReturnType<typeof paintWall>;
paintWall(23,'red');
//undefined and null should not accept but its accepting 
//paintWall(34,undefined);

