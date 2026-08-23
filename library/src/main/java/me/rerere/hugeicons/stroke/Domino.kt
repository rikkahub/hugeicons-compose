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

val HugeIcons.Domino: ImageVector
    get() {
        if (_domino != null) {
            return _domino!!
        }
        _domino = ImageVector.Builder(
            name = "Domino",
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
            moveTo(19f, 16f)
            curveTo(19f, 18.8284f, 19f, 20.2426f, 17.9749f, 21.1213f)
            curveTo(16.9497f, 22f, 15.2998f, 22f, 12f, 22f)
            curveTo(8.70017f, 22f, 7.05025f, 22f, 6.02513f, 21.1213f)
            curveTo(5f, 20.2426f, 5f, 18.8284f, 5f, 16f)
            lineTo(5f, 8f)
            curveTo(5f, 5.17157f, 5f, 3.75736f, 6.02513f, 2.87868f)
            curveTo(7.05026f, 2f, 8.70017f, 2f, 12f, 2f)
            curveTo(15.2998f, 2f, 16.9497f, 2f, 17.9749f, 2.87868f)
            curveTo(19f, 3.75736f, 19f, 5.17157f, 19f, 8f)
            lineTo(19f, 16f)
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
            moveTo(19f, 12f)
            lineTo(5f, 12f)
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
            moveTo(12.125f, 7f)
            horizontalLineTo(12f)
            moveTo(12.25f, 7f)
            curveTo(12.25f, 7.13807f, 12.1381f, 7.25f, 12f, 7.25f)
            curveTo(11.8619f, 7.25f, 11.75f, 7.13807f, 11.75f, 7f)
            curveTo(11.75f, 6.86193f, 11.8619f, 6.75f, 12f, 6.75f)
            curveTo(12.1381f, 6.75f, 12.25f, 6.86193f, 12.25f, 7f)
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
            moveTo(9.625f, 16f)
            horizontalLineTo(9.5f)
            moveTo(9.75f, 16f)
            curveTo(9.75f, 16.1381f, 9.63807f, 16.25f, 9.5f, 16.25f)
            curveTo(9.36193f, 16.25f, 9.25f, 16.1381f, 9.25f, 16f)
            curveTo(9.25f, 15.8619f, 9.36193f, 15.75f, 9.5f, 15.75f)
            curveTo(9.63807f, 15.75f, 9.75f, 15.8619f, 9.75f, 16f)
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
            moveTo(14.625f, 18f)
            horizontalLineTo(14.5f)
            moveTo(14.75f, 18f)
            curveTo(14.75f, 18.1381f, 14.6381f, 18.25f, 14.5f, 18.25f)
            curveTo(14.3619f, 18.25f, 14.25f, 18.1381f, 14.25f, 18f)
            curveTo(14.25f, 17.8619f, 14.3619f, 17.75f, 14.5f, 17.75f)
            curveTo(14.6381f, 17.75f, 14.75f, 17.8619f, 14.75f, 18f)
            close()
        }
        }.build()

        return _domino!!
    }

private var _domino: ImageVector? = null
