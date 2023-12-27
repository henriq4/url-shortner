import { useParams } from "react-router-dom";

import { apiUrl } from "../config/constants";

export default function Redirect() {
  const { codeUrl } = useParams();

  window.location.href = `${apiUrl}/c/${codeUrl}`;

  return null;
}
