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

val HugeIcons.Landmark: ImageVector
    get() {
        if (_landmark != null) {
            return _landmark!!
        }
        _landmark = ImageVector.Builder(
            name = "Landmark",
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
            moveTo(19.5f, 19f)
            horizontalLineTo(4.5f)
            curveTo(4.22121f, 19f, 4.08181f, 19f, 3.96589f, 19.0231f)
            curveTo(3.48986f, 19.1177f, 3.11775f, 19.4899f, 3.02306f, 19.9659f)
            curveTo(3f, 20.0818f, 3f, 20.2212f, 3f, 20.5f)
            curveTo(3f, 20.7788f, 3f, 20.9182f, 3.02306f, 21.0341f)
            curveTo(3.11775f, 21.5101f, 3.48986f, 21.8823f, 3.96589f, 21.9769f)
            curveTo(4.08181f, 22f, 4.22121f, 22f, 4.5f, 22f)
            horizontalLineTo(19.5f)
            curveTo(19.7788f, 22f, 19.9182f, 22f, 20.0341f, 21.9769f)
            curveTo(20.5101f, 21.8823f, 20.8823f, 21.5101f, 20.9769f, 21.0341f)
            curveTo(21f, 20.9182f, 21f, 20.7788f, 21f, 20.5f)
            curveTo(21f, 20.2212f, 21f, 20.0818f, 20.9769f, 19.9659f)
            curveTo(20.8823f, 19.4899f, 20.5101f, 19.1177f, 20.0341f, 19.0231f)
            curveTo(19.9182f, 19f, 19.7788f, 19f, 19.5f, 19f)
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
            moveTo(20.6864f, 6.81552f)
            lineTo(12.931f, 2.25351f)
            curveTo(12.6488f, 2.08753f, 12.3274f, 2f, 12f, 2f)
            curveTo(11.6726f, 2f, 11.3512f, 2.08753f, 11.069f, 2.25351f)
            lineTo(3.31361f, 6.81552f)
            curveTo(3.11931f, 6.92982f, 3f, 7.13842f, 3f, 7.36385f)
            curveTo(3f, 7.71518f, 3.28482f, 8f, 3.63615f, 8f)
            horizontalLineTo(20.3638f)
            curveTo(20.7152f, 8f, 21f, 7.71518f, 21f, 7.36385f)
            curveTo(21f, 7.13842f, 20.8807f, 6.92982f, 20.6864f, 6.81552f)
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
            moveTo(18f, 11f)
            verticalLineTo(19f)
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
            moveTo(14f, 11f)
            verticalLineTo(19f)
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
            moveTo(10f, 11f)
            verticalLineTo(19f)
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
            moveTo(6f, 11f)
            verticalLineTo(19f)
        }
        }.build()

        return _landmark!!
    }

private var _landmark: ImageVector? = null
