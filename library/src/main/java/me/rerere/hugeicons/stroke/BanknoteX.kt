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

val HugeIcons.BanknoteX: ImageVector
    get() {
        if (_banknoteX != null) {
            return _banknoteX!!
        }
        _banknoteX = ImageVector.Builder(
            name = "BanknoteX",
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
            moveTo(13f, 17f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 17f, 3.75736f, 17f, 2.87868f, 16.1213f)
            curveTo(2f, 15.2426f, 2f, 13.8284f, 2f, 11f)
            verticalLineTo(9f)
            curveTo(2f, 6.17157f, 2f, 4.75736f, 2.87868f, 3.87868f)
            curveTo(3.75736f, 3f, 5.17157f, 3f, 8f, 3f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 3f, 20.2426f, 3f, 21.1213f, 3.87868f)
            curveTo(22f, 4.75736f, 22f, 6.17157f, 22f, 9f)
            verticalLineTo(11f)
            curveTo(22f, 11.7641f, 22.0173f, 11.925f, 22f, 12.5f)
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
            moveTo(15f, 10f)
            curveTo(15f, 11.6569f, 13.6569f, 13f, 12f, 13f)
            curveTo(10.3431f, 13f, 9f, 11.6569f, 9f, 10f)
            curveTo(9f, 8.34315f, 10.3431f, 7f, 12f, 7f)
            curveTo(13.6569f, 7f, 15f, 8.34315f, 15f, 10f)
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
            moveTo(19f, 6f)
            horizontalLineTo(17f)
            moveTo(5f, 14f)
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
            moveTo(17f, 16f)
            lineTo(22f, 21f)
            moveTo(22f, 16f)
            lineTo(17f, 21f)
        }
        }.build()

        return _banknoteX!!
    }

private var _banknoteX: ImageVector? = null
