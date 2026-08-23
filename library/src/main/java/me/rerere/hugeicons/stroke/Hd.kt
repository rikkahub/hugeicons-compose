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

val HugeIcons.Hd: ImageVector
    get() {
        if (_hd != null) {
            return _hd!!
        }
        _hd = ImageVector.Builder(
            name = "Hd",
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
            moveTo(2f, 11f)
            curveTo(2f, 8.17157f, 2f, 6.75736f, 2.87868f, 5.87868f)
            curveTo(3.75736f, 5f, 5.17157f, 5f, 8f, 5f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 5f, 20.2426f, 5f, 21.1213f, 5.87868f)
            curveTo(22f, 6.75736f, 22f, 8.17157f, 22f, 11f)
            verticalLineTo(13f)
            curveTo(22f, 15.8284f, 22f, 17.2426f, 21.1213f, 18.1213f)
            curveTo(20.2426f, 19f, 18.8284f, 19f, 16f, 19f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 19f, 3.75736f, 19f, 2.87868f, 18.1213f)
            curveTo(2f, 17.2426f, 2f, 15.8284f, 2f, 13f)
            verticalLineTo(11f)
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
            moveTo(10f, 9f)
            verticalLineTo(15f)
            moveTo(6f, 9f)
            verticalLineTo(15f)
            moveTo(6f, 12f)
            horizontalLineTo(10f)
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
            moveTo(14f, 15f)
            verticalLineTo(9f)
            horizontalLineTo(15f)
            curveTo(15.9319f, 9f, 16.3978f, 9f, 16.7654f, 9.15224f)
            curveTo(17.2554f, 9.35523f, 17.6448f, 9.74458f, 17.8478f, 10.2346f)
            curveTo(18f, 10.6022f, 18f, 11.0681f, 18f, 12f)
            curveTo(18f, 12.9319f, 18f, 13.3978f, 17.8478f, 13.7654f)
            curveTo(17.6448f, 14.2554f, 17.2554f, 14.6448f, 16.7654f, 14.8478f)
            curveTo(16.3978f, 15f, 15.9319f, 15f, 15f, 15f)
            horizontalLineTo(14f)
            close()
        }
        }.build()

        return _hd!!
    }

private var _hd: ImageVector? = null
