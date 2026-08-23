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

val HugeIcons.GoogleLens: ImageVector
    get() {
        if (_googleLens != null) {
            return _googleLens!!
        }
        _googleLens = ImageVector.Builder(
            name = "GoogleLens",
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
            moveTo(21f, 14f)
            verticalLineTo(11f)
            curveTo(21f, 8.17157f, 21f, 6.75736f, 20.1213f, 5.87868f)
            curveTo(19.2426f, 5f, 17.8284f, 5f, 15f, 5f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 5f, 4.75736f, 5f, 3.87868f, 5.87868f)
            curveTo(3f, 6.75736f, 3f, 8.17157f, 3f, 11f)
            moveTo(13f, 21f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 21f, 4.75736f, 21f, 3.87868f, 20.1213f)
            curveTo(3f, 19.2426f, 3f, 17.8284f, 3f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 3f)
            horizontalLineTo(14f)
            lineTo(15f, 4.5f)
            horizontalLineTo(9f)
            lineTo(10f, 3f)
            close()
        }

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
            moveTo(15f, 13f)
            arcTo(3f, 3f, 0f, true, false, 9f, 13f)
            arcTo(3f, 3f, 0f, true, false, 15f, 13f)
            close()
        }

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
            moveTo(21f, 19f)
            arcTo(2f, 2f, 0f, true, false, 17f, 19f)
            arcTo(2f, 2f, 0f, true, false, 21f, 19f)
            close()
        }
        }.build()

        return _googleLens!!
    }

private var _googleLens: ImageVector? = null
