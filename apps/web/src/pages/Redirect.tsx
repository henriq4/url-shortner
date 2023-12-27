import { useParams } from "react-router-dom";

export default function Redirect() {
  const { codeUrl } = useParams();

  // window.location.href = `${import.meta.env}${codeUrl}`;
  window.location.href = `http://localhost:3000/${codeUrl}`;
  return null;
}
