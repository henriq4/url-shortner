import axios from "axios";

export const apiClient = axios.create({
  // baseURL: import.meta.env.API_URL as string,
  baseURL: "http://localhost:8080",
});
