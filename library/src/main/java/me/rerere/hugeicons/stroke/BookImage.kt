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

val HugeIcons.BookImage: ImageVector
    get() {
        if (_bookImage != null) {
            return _bookImage!!
        }
        _bookImage = ImageVector.Builder(
            name = "BookImage",
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
            moveTo(20f, 22f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
            moveTo(4f, 20f)
            curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(6f)
            curveTo(20f, 4.11438f, 20f, 3.17157f, 19.4142f, 2.58579f)
            curveTo(18.8284f, 2f, 17.8856f, 2f, 16f, 2f)
            horizontalLineTo(10f)
            curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
            curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
            verticalLineTo(20f)
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
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
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
            moveTo(9.5f, 9f)
            curveTo(10.3284f, 9f, 11f, 8.32843f, 11f, 7.5f)
            curveTo(11f, 6.67158f, 10.3284f, 6f, 9.5f, 6f)
            curveTo(8.67157f, 6f, 8f, 6.67158f, 8f, 7.5f)
            curveTo(8f, 8.32843f, 8.67157f, 9f, 9.5f, 9f)
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
            moveTo(7f, 18f)
            lineTo(13.8319f, 10.7126f)
            curveTo(14.2582f, 10.258f, 14.8536f, 10f, 15.4768f, 10f)
            curveTo(16.127f, 10f, 16.7456f, 10.2807f, 17.1738f, 10.77f)
            lineTo(20f, 14f)
        }
        }.build()

        return _bookImage!!
    }

private var _bookImage: ImageVector? = null
