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

val HugeIcons.BaggageClaim: ImageVector
    get() {
        if (_baggageClaim != null) {
            return _baggageClaim!!
        }
        _baggageClaim = ImageVector.Builder(
            name = "BaggageClaim",
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
            moveTo(3f, 21.5f)
            horizontalLineTo(21f)
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
            moveTo(17f, 10f)
            horizontalLineTo(7f)
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
            moveTo(15f, 6.5f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 6.5f, 4.75736f, 6.5f, 3.87868f, 7.37868f)
            curveTo(3f, 8.25736f, 3f, 9.67157f, 3f, 12.5f)
            curveTo(3f, 15.3284f, 3f, 16.7426f, 3.87868f, 17.6213f)
            curveTo(4.75736f, 18.5f, 6.17157f, 18.5f, 9f, 18.5f)
            horizontalLineTo(15f)
            curveTo(17.8284f, 18.5f, 19.2426f, 18.5f, 20.1213f, 17.6213f)
            curveTo(21f, 16.7426f, 21f, 15.3284f, 21f, 12.5f)
            curveTo(21f, 9.67157f, 21f, 8.25736f, 20.1213f, 7.37868f)
            curveTo(19.2426f, 6.5f, 17.8284f, 6.5f, 15f, 6.5f)
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
            moveTo(9f, 6.5f)
            verticalLineTo(5.5f)
            curveTo(9f, 4.56812f, 9f, 4.10218f, 9.15224f, 3.73463f)
            curveTo(9.35523f, 3.24458f, 9.74458f, 2.85523f, 10.2346f, 2.65224f)
            curveTo(10.6022f, 2.5f, 11.0681f, 2.5f, 12f, 2.5f)
            curveTo(12.9319f, 2.5f, 13.3978f, 2.5f, 13.7654f, 2.65224f)
            curveTo(14.2554f, 2.85523f, 14.6448f, 3.24458f, 14.8478f, 3.73463f)
            curveTo(15f, 4.10218f, 15f, 4.56812f, 15f, 5.5f)
            verticalLineTo(6.5f)
        }
        }.build()

        return _baggageClaim!!
    }

private var _baggageClaim: ImageVector? = null
