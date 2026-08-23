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

val HugeIcons.CursorInWindow: ImageVector
    get() {
        if (_cursorInWindow != null) {
            return _cursorInWindow!!
        }
        _cursorInWindow = ImageVector.Builder(
            name = "CursorInWindow",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.7793f, 12.9054f)
            lineTo(19.1313f, 14.2171f)
            curveTo(21.0646f, 14.9736f, 22.0313f, 15.3518f, 21.9992f, 15.9518f)
            curveTo(21.9672f, 16.5519f, 20.9583f, 16.827f, 18.9407f, 17.3773f)
            curveTo(18.34f, 17.5411f, 18.0396f, 17.6231f, 17.8313f, 17.8313f)
            curveTo(17.623f, 18.0396f, 17.5411f, 18.3399f, 17.3772f, 18.9407f)
            curveTo(16.827f, 20.9583f, 16.5518f, 21.9672f, 15.9518f, 21.9992f)
            curveTo(15.3518f, 22.0313f, 14.9736f, 21.0646f, 14.217f, 19.1313f)
            lineTo(12.9054f, 15.7793f)
            curveTo(12.1134f, 13.7552f, 11.7173f, 12.7431f, 12.2302f, 12.2302f)
            curveTo(12.7431f, 11.7173f, 13.7552f, 12.1134f, 15.7793f, 12.9054f)
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
            moveTo(21f, 11f)
            verticalLineTo(8f)
            curveTo(21f, 5.17157f, 21f, 3.75736f, 20.1213f, 2.87868f)
            curveTo(19.2426f, 2f, 17.8284f, 2f, 15f, 2f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 2f, 3.75736f, 2f, 2.87868f, 2.87868f)
            curveTo(2f, 3.75736f, 2f, 5.17157f, 2f, 8f)
            verticalLineTo(13f)
            curveTo(2f, 15.8284f, 2f, 17.2426f, 2.87868f, 18.1213f)
            curveTo(3.75736f, 19f, 5.17157f, 19f, 8f, 19f)
            horizontalLineTo(10f)
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
            moveTo(2f, 6f)
            horizontalLineTo(21f)
        }
        }.build()

        return _cursorInWindow!!
    }

private var _cursorInWindow: ImageVector? = null
