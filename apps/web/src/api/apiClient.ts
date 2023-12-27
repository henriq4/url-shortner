import axios from "axios";
import { apiUrl } from "../config/constants";

export const apiClient = axios.create({
  baseURL: apiUrl,
});
