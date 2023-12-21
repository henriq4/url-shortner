import { createBrowserRouter } from "react-router-dom";

import Home from "../pages/Home";
import Redirect from "../pages/Redirect";

export const router = createBrowserRouter([
  {
    path: "/",
    element: <Home />,
  },
  {
    path: "/redirect",
    element: <Redirect />,
  },
]);
