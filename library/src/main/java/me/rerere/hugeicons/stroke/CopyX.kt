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

val HugeIcons.CopyX: ImageVector
    get() {
        if (_copyX != null) {
            return _copyX!!
        }
        _copyX = ImageVector.Builder(
            name = "CopyX",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13f, 2f)
            curveTo(10.1716f, 2f, 8.75736f, 2f, 7.87868f, 2.87868f)
            curveTo(7f, 3.75736f, 7f, 5.17157f, 7f, 8f)
            verticalLineTo(12f)
            curveTo(7f, 14.8284f, 7f, 16.2426f, 7.87868f, 17.1213f)
            curveTo(8.75736f, 18f, 10.1716f, 18f, 13f, 18f)
            horizontalLineTo(15f)
            curveTo(17.8284f, 18f, 19.2426f, 18f, 20.1213f, 17.1213f)
            curveTo(21f, 16.2426f, 21f, 14.8284f, 21f, 12f)
            verticalLineTo(8f)
            curveTo(21f, 5.17157f, 21f, 3.75736f, 20.1213f, 2.87868f)
            curveTo(19.2426f, 2f, 17.8284f, 2f, 15f, 2f)
            horizontalLineTo(13f)
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
            moveTo(11.5f, 7.5f)
            lineTo(16.5f, 12.5f)
            moveTo(16.5f, 7.5f)
            lineTo(11.5f, 12.5f)
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
            moveTo(17f, 22f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 22f, 4.75736f, 22f, 3.87868f, 21.1213f)
            curveTo(3f, 20.2426f, 3f, 18.8284f, 3f, 16f)
            verticalLineTo(6f)
        }
        }.build()

        return _copyX!!
    }

private var _copyX: ImageVector? = null
