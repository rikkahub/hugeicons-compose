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

val HugeIcons.SwatchBook: ImageVector
    get() {
        if (_swatchBook != null) {
            return _swatchBook!!
        }
        _swatchBook = ImageVector.Builder(
            name = "SwatchBook",
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
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 7f)
            verticalLineTo(17f)
            curveTo(3f, 19.2091f, 4.79086f, 21f, 7f, 21f)
            curveTo(9.20914f, 21f, 11f, 19.2091f, 11f, 17f)
            verticalLineTo(7f)
            curveTo(11f, 5.11438f, 11f, 4.17157f, 10.4142f, 3.58579f)
            curveTo(9.82843f, 3f, 8.88562f, 3f, 7f, 3f)
            curveTo(5.11438f, 3f, 4.17157f, 3f, 3.58579f, 3.58579f)
            curveTo(3f, 4.17157f, 3f, 5.11438f, 3f, 7f)
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
            moveTo(7.5f, 21.0002f)
            lineTo(17f, 21.0002f)
            curveTo(18.8856f, 21.0002f, 19.8284f, 21.0002f, 20.4142f, 20.4144f)
            curveTo(21f, 19.8286f, 21f, 18.8858f, 21f, 17.0002f)
            curveTo(21f, 15.5042f, 21f, 14.6016f, 20.7075f, 14f)
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
            moveTo(9.99842f, 20.1396f)
            curveTo(10.2609f, 19.9784f, 10.5089f, 19.7841f, 10.7362f, 19.5567f)
            lineTo(17.8073f, 12.4857f)
            curveTo(19.1406f, 11.1523f, 19.8073f, 10.4857f, 19.8073f, 9.65723f)
            curveTo(19.8073f, 8.8288f, 19.1406f, 8.16213f, 17.8073f, 6.8288f)
            curveTo(16.474f, 5.49547f, 15.8073f, 4.8288f, 14.9789f, 4.8288f)
            curveTo(14.6439f, 4.8288f, 14.3353f, 4.93783f, 13.9984f, 5.15588f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 17f)
            horizontalLineTo(7.00898f)
        }
        }.build()

        return _swatchBook!!
    }

private var _swatchBook: ImageVector? = null
