import * as yup from "yup";

export const createShortUrlSchema = yup.object().shape({
  url: yup.string().url("Insert a valid URL").required("The URL is required"),
});

export type createShortUrl = yup.InferType<typeof createShortUrlSchema>;
