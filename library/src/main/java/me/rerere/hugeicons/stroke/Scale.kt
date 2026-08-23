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

val HugeIcons.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = ImageVector.Builder(
            name = "Scale",
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
            moveTo(13.9934f, 5f)
            arcTo(2f, 2f, 0f, true, false, 9.9934f, 5f)
            arcTo(2f, 2f, 0f, true, false, 13.9934f, 5f)
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
            moveTo(9.99341f, 5f)
            horizontalLineTo(3.99341f)
            moveTo(13.9934f, 5f)
            horizontalLineTo(19.9934f)
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
            moveTo(16.9934f, 21f)
            horizontalLineTo(6.99341f)
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
            moveTo(11.9934f, 7f)
            verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.96285f, 5f)
            lineTo(3.16812f, 13.3842f)
            curveTo(3.06143f, 13.7043f, 3.00809f, 13.8643f, 2.99682f, 14.148f)
            curveTo(2.98554f, 14.4317f, 3.003f, 14.5023f, 3.03792f, 14.6436f)
            curveTo(3.34227f, 15.8749f, 4.53628f, 16.5f, 5.96285f, 16.5f)
            curveTo(7.38943f, 16.5f, 8.58344f, 15.8749f, 8.88778f, 14.6436f)
            curveTo(8.9227f, 14.5023f, 8.94016f, 14.4317f, 8.92889f, 14.148f)
            curveTo(8.91761f, 13.8643f, 8.86427f, 13.7043f, 8.75759f, 13.3842f)
            lineTo(5.96285f, 5f)
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
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(18.0229f, 5f)
            lineTo(15.2282f, 13.3842f)
            curveTo(15.1215f, 13.7043f, 15.0681f, 13.8643f, 15.0569f, 14.148f)
            curveTo(15.0456f, 14.4317f, 15.0631f, 14.5023f, 15.098f, 14.6436f)
            curveTo(15.4023f, 15.8749f, 16.5963f, 16.5f, 18.0229f, 16.5f)
            curveTo(19.4495f, 16.5f, 20.6435f, 15.8749f, 20.9478f, 14.6436f)
            curveTo(20.9828f, 14.5023f, 21.0002f, 14.4317f, 20.9889f, 14.148f)
            curveTo(20.9777f, 13.8643f, 20.9243f, 13.7043f, 20.8176f, 13.3842f)
            lineTo(18.0229f, 5f)
            close()
        }
        }.build()

        return _scale!!
    }

private var _scale: ImageVector? = null
