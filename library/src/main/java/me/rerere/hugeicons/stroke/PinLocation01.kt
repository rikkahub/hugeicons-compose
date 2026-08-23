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

val HugeIcons.PinLocation01: ImageVector
    get() {
        if (_pinLocation01 != null) {
            return _pinLocation01!!
        }
        _pinLocation01 = ImageVector.Builder(
            name = "PinLocation01",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 7f)
            arcTo(4f, 4f, 0f, true, false, 8f, 7f)
            arcTo(4f, 4f, 0f, true, false, 16f, 7f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 11f)
            lineTo(12f, 18f)
        }

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
            moveTo(15.847f, 16f)
            curveTo(17.4943f, 18.113f, 18.3179f, 19.1695f, 17.8865f, 20.006f)
            curveTo(17.8466f, 20.0832f, 17.7999f, 20.1578f, 17.7469f, 20.229f)
            curveTo(17.1723f, 21f, 15.6875f, 21f, 12.7178f, 21f)
            horizontalLineTo(11.2822f)
            curveTo(8.31251f, 21f, 6.82765f, 21f, 6.25311f, 20.229f)
            curveTo(6.20005f, 20.1578f, 6.15339f, 20.0832f, 6.11355f, 20.006f)
            curveTo(5.68206f, 19.1695f, 6.50571f, 18.113f, 8.15301f, 16f)
        }
        }.build()

        return _pinLocation01!!
    }

private var _pinLocation01: ImageVector? = null
