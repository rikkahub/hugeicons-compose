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

val HugeIcons.ToolCase: ImageVector
    get() {
        if (_toolCase != null) {
            return _toolCase!!
        }
        _toolCase = ImageVector.Builder(
            name = "ToolCase",
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
            moveTo(20.0004f, 10.9826f)
            curveTo(20.6281f, 10.1316f, 21f, 9.07385f, 21f, 7.92761f)
            curveTo(21f, 5.11556f, 18.7614f, 2.83594f, 16f, 2.83594f)
            curveTo(14.0209f, 2.83594f, 12.3104f, 4.00687f, 11.5f, 5.70554f)
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
            moveTo(14.6364f, 21.1658f)
            horizontalLineTo(9.36364f)
            curveTo(6.67794f, 21.1658f, 5.33509f, 21.1658f, 4.40253f, 20.4549f)
            curveTo(4.13533f, 20.2512f, 3.89812f, 20.0096f, 3.69811f, 19.7375f)
            curveTo(3f, 18.7879f, 3f, 17.4204f, 3f, 14.6855f)
            curveTo(3f, 13.1226f, 3f, 12.3412f, 3.39892f, 11.7986f)
            curveTo(3.51321f, 11.6431f, 3.64876f, 11.505f, 3.80144f, 11.3887f)
            curveTo(4.33434f, 10.9824f, 5.10168f, 10.9824f, 6.63636f, 10.9824f)
            horizontalLineTo(17.3636f)
            curveTo(18.8983f, 10.9824f, 19.6657f, 10.9824f, 20.1986f, 11.3887f)
            curveTo(20.3512f, 11.505f, 20.4868f, 11.6431f, 20.6011f, 11.7986f)
            curveTo(21f, 12.3412f, 21f, 13.1226f, 21f, 14.6855f)
            curveTo(21f, 17.4204f, 21f, 18.7879f, 20.3019f, 19.7375f)
            curveTo(20.1019f, 20.0096f, 19.8647f, 20.2512f, 19.5975f, 20.4549f)
            curveTo(18.6649f, 21.1658f, 17.3221f, 21.1658f, 14.6364f, 21.1658f)
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
            moveTo(10f, 15.0547f)
            horizontalLineTo(14f)
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
            moveTo(13.6858f, 10.9826f)
            lineTo(13.335f, 10.1564f)
            curveTo(13.2474f, 9.94999f, 13.2565f, 9.71349f, 13.3595f, 9.51989f)
            lineTo(14.9144f, 6.59747f)
            curveTo(15.1776f, 6.10273f, 14.7982f, 5.48558f, 14.2636f, 5.53902f)
            lineTo(11.1099f, 5.85432f)
            curveTo(10.9004f, 5.87526f, 10.692f, 5.78776f, 10.5492f, 5.6189f)
            lineTo(8.39732f, 3.07491f)
            curveTo(8.03241f, 2.64349f, 7.37203f, 2.82539f, 7.26584f, 3.38656f)
            lineTo(6.63969f, 6.69573f)
            curveTo(6.59813f, 6.91538f, 6.46021f, 7.09827f, 6.26863f, 7.18779f)
            lineTo(3.38401f, 8.53572f)
            curveTo(2.89509f, 8.76418f, 2.86669f, 9.49366f, 3.33529f, 9.78682f)
            lineTo(5.24666f, 10.9826f)
        }
        }.build()

        return _toolCase!!
    }

private var _toolCase: ImageVector? = null
