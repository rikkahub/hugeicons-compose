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

val HugeIcons.Yurt: ImageVector
    get() {
        if (_yurt != null) {
            return _yurt!!
        }
        _yurt = ImageVector.Builder(
            name = "Yurt",
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
            moveTo(22f, 9.5f)
            horizontalLineTo(2f)
            verticalLineTo(15.5f)
            curveTo(2f, 18.3284f, 2f, 19.7426f, 2.87868f, 20.6213f)
            curveTo(3.75736f, 21.5f, 5.17157f, 21.5f, 8f, 21.5f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 21.5f, 20.2426f, 21.5f, 21.1213f, 20.6213f)
            curveTo(22f, 19.7426f, 22f, 18.3284f, 22f, 15.5f)
            verticalLineTo(9.5f)
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
            moveTo(10f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(10f, 15.3954f, 10.8954f, 14.5f, 12f, 14.5f)
            curveTo(13.1046f, 14.5f, 14f, 15.3954f, 14f, 16.5f)
            verticalLineTo(21.5f)
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
            moveTo(18f, 9.5f)
            verticalLineTo(21.5f)
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
            moveTo(6f, 9.5f)
            verticalLineTo(21.5f)
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
            moveTo(22f, 9.5f)
            lineTo(15.7482f, 4.60902f)
            curveTo(13.951f, 3.20301f, 13.0523f, 2.5f, 12f, 2.5f)
            curveTo(10.9477f, 2.5f, 10.049f, 3.20301f, 8.25183f, 4.60902f)
            lineTo(2f, 9.5f)
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
            moveTo(15f, 9.5f)
            lineTo(13.1245f, 4.60902f)
            curveTo(12.5853f, 3.20301f, 12.3157f, 2.5f, 12f, 2.5f)
            curveTo(11.6843f, 2.5f, 11.4147f, 3.20301f, 10.8755f, 4.60902f)
            lineTo(9f, 9.5f)
        }
        }.build()

        return _yurt!!
    }

private var _yurt: ImageVector? = null
