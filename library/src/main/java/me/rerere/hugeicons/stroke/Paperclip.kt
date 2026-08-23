package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = ImageVector.Builder(
            name = "Paperclip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.1688f, 12f)
            lineTo(19.713f, 10.4558f)
            curveTo(21.4186f, 8.75022f, 21.4186f, 5.98485f, 19.713f, 4.27922f)
            curveTo(18.0073f, 2.57359f, 15.242f, 2.57359f, 13.5363f, 4.27922f)
            lineTo(4.27141f, 13.5442f)
            curveTo(2.56578f, 15.2498f, 2.56578f, 18.0152f, 4.27141f, 19.7208f)
            curveTo(5.97704f, 21.4264f, 8.7424f, 21.4264f, 10.448f, 19.7208f)
            lineTo(13.9224f, 16.2464f)
            curveTo(14.9884f, 15.1804f, 14.9884f, 13.4521f, 13.9224f, 12.386f)
            curveTo(12.8564f, 11.32f, 11.128f, 11.32f, 10.062f, 12.386f)
            lineTo(8.1318f, 14.3162f)
        }
        }.build()

        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
