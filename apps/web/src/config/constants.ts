const mode = import.meta.env.PROD ? "prod" : "dev";

const baseUrl =
  mode == "prod" ? import.meta.env.BASE_URL : "http://localhost:5173/";

const apiUrl = import.meta.env.VITE_API_URL;

export { mode, baseUrl, apiUrl };
