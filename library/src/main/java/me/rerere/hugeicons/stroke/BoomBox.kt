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

val HugeIcons.BoomBox: ImageVector
    get() {
        if (_boomBox != null) {
            return _boomBox!!
        }
        _boomBox = ImageVector.Builder(
            name = "BoomBox",
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
            moveTo(18f, 15f)
            arcTo(2f, 2f, 0f, true, false, 14f, 15f)
            arcTo(2f, 2f, 0f, true, false, 18f, 15f)
            close()
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
            moveTo(10f, 15f)
            arcTo(2f, 2f, 0f, true, false, 6f, 15f)
            arcTo(2f, 2f, 0f, true, false, 10f, 15f)
            close()
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
            moveTo(8f, 21f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 21f, 20.2426f, 21f, 21.1213f, 20.1213f)
            curveTo(22f, 19.2426f, 22f, 17.8284f, 22f, 15f)
            curveTo(22f, 12.1716f, 22f, 10.7574f, 21.1213f, 9.87868f)
            curveTo(20.2426f, 9f, 18.8284f, 9f, 16f, 9f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 9f, 3.75736f, 9f, 2.87868f, 9.87868f)
            curveTo(2f, 10.7574f, 2f, 12.1716f, 2f, 15f)
            curveTo(2f, 17.8284f, 2f, 19.2426f, 2.87868f, 20.1213f)
            curveTo(3.75736f, 21f, 5.17157f, 21f, 8f, 21f)
            close()
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
            moveTo(14f, 3f)
            horizontalLineTo(10f)
            curveTo(7.17157f, 3f, 5.75736f, 3f, 4.87868f, 3.87868f)
            curveTo(4f, 4.75736f, 4f, 6.17157f, 4f, 9f)
            horizontalLineTo(20f)
            curveTo(20f, 6.17157f, 20f, 4.75736f, 19.1213f, 3.87868f)
            curveTo(18.2426f, 3f, 16.8284f, 3f, 14f, 3f)
            close()
        }
        }.build()

        return _boomBox!!
    }

private var _boomBox: ImageVector? = null
