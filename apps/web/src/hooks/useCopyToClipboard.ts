import { useState } from "react";

type TextValue = string | null;
type CopyToClipboardFn = (text: TextValue) => Promise<boolean>;

export function useCopyToClipboard(): [TextValue, CopyToClipboardFn] {
  const [copiedText, setCopiedText] = useState<TextValue>(null);

  const copy: CopyToClipboardFn = async (text) => {
    if (!navigator?.clipboard) return false;

    if (!text) return false;

    try {
      await navigator.clipboard.writeText(text);
      setCopiedText(text);
      return true;
    } catch (error) {
      setCopiedText(null);
      return false;
    }
  };

  return [copiedText, copy];
}
