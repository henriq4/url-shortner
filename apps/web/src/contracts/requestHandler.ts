import { AxiosError, AxiosResponse } from "axios";

type Request<T, V> = (params?: T) => Promise<AxiosResponse<V>>;

type SucessResponse<V> = {
  code: "success";
  data: V;
};

type ErrorResponse<E = AxiosError> = {
  code: "error";
  error: E;
};

export const requestHandler =
  <T, V, E = AxiosError>(request: Request<T, V>) =>
  async (params?: T): Promise<SucessResponse<V> | ErrorResponse<E>> => {
    try {
      const response = await request(params);
      return {
        code: "success",
        data: response.data,
      };
    } catch (e) {
      return {
        code: "error",
        error: e as E,
      };
    }
  };
