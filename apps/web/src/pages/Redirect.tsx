interface RedirectProps {
  codeUrl: string;
}

export default function Redirect({ codeUrl }: RedirectProps) {
  // window.location.href = `${import.meta.env}${codeUrl}`;
  window.location.href = `http://localhost:3000/${codeUrl}`;
  return null;
}
