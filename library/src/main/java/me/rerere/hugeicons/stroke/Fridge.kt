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

val HugeIcons.Fridge: ImageVector
    get() {
        if (_fridge != null) {
            return _fridge!!
        }
        _fridge = ImageVector.Builder(
            name = "Fridge",
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
            moveTo(13f, 2f)
            horizontalLineTo(11f)
            curveTo(8.17157f, 2f, 6.75736f, 2f, 5.87868f, 2.87868f)
            curveTo(5f, 3.75736f, 5f, 5.17157f, 5f, 8f)
            verticalLineTo(16f)
            curveTo(5f, 18.8284f, 5f, 20.2426f, 5.87868f, 21.1213f)
            curveTo(6.75736f, 22f, 8.17157f, 22f, 11f, 22f)
            horizontalLineTo(13f)
            curveTo(15.8284f, 22f, 17.2426f, 22f, 18.1213f, 21.1213f)
            curveTo(19f, 20.2426f, 19f, 18.8284f, 19f, 16f)
            verticalLineTo(8f)
            curveTo(19f, 5.17157f, 19f, 3.75736f, 18.1213f, 2.87868f)
            curveTo(17.2426f, 2f, 15.8284f, 2f, 13f, 2f)
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
            moveTo(5f, 11f)
            horizontalLineTo(19f)
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
            moveTo(9f, 18f)
            lineTo(9f, 15f)
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
            moveTo(9f, 7f)
            lineTo(9f, 6f)
        }
        }.build()

        return _fridge!!
    }

private var _fridge: ImageVector? = null
