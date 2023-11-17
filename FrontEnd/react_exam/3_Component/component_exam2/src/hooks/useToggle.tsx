import * as React from 'react';

interface useToggleReturnType {
    hideCount: boolean;
    toggle: ()=> void;
}
// type useToggleReturnType = [boolean, ()=> void0;]

export function useToggle(): useToggleReturnType{
    const [hideCount, setHideCount] = React.useState(false);
    const toggle = () => setHideCount(!hideCount);
    return {hideCount, toggle};
}