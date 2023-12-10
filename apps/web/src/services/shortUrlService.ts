import {requestHandler} from "../contracts/requestHandler.ts";
import {apiClient} from "../api/apiClient.ts";
import {createShortUrl} from "../schemas/createShortUrlSchema.ts";

export const createShortUrlService = requestHandler<createShortUrl, string>((params) =>
  apiClient.post("/", params)
)