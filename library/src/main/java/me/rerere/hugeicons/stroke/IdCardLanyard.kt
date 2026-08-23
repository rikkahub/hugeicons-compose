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

val HugeIcons.IdCardLanyard: ImageVector
    get() {
        if (_idCardLanyard != null) {
            return _idCardLanyard!!
        }
        _idCardLanyard = ImageVector.Builder(
            name = "IdCardLanyard",
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
            moveTo(15f, 4f)
            curveTo(15.93f, 4f, 16.395f, 4f, 16.7765f, 4.10222f)
            curveTo(17.8117f, 4.37962f, 18.6204f, 5.18827f, 18.8978f, 6.22354f)
            curveTo(19f, 6.60504f, 19f, 7.07003f, 19f, 8f)
            verticalLineTo(16f)
            curveTo(19f, 18.8284f, 19f, 20.2426f, 18.1213f, 21.1213f)
            curveTo(17.2426f, 22f, 15.8284f, 22f, 13f, 22f)
            horizontalLineTo(11f)
            curveTo(8.17157f, 22f, 6.75736f, 22f, 5.87868f, 21.1213f)
            curveTo(5f, 20.2426f, 5f, 18.8284f, 5f, 16f)
            verticalLineTo(10f)
            curveTo(5f, 7.17157f, 5f, 5.75736f, 5.87868f, 4.87868f)
            curveTo(6.75736f, 4f, 8.17157f, 4f, 11f, 4f)
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
            moveTo(10f, 8f)
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
            moveTo(12f, 8f)
            lineTo(16f, 2f)
            moveTo(9.33333f, 4f)
            lineTo(8f, 2f)
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
            moveTo(14.5f, 14.5f)
            curveTo(14.5f, 13.1193f, 13.3807f, 12f, 12f, 12f)
            curveTo(10.6193f, 12f, 9.5f, 13.1193f, 9.5f, 14.5f)
            curveTo(9.5f, 15.8807f, 10.6193f, 17f, 12f, 17f)
            curveTo(13.3807f, 17f, 14.5f, 15.8807f, 14.5f, 14.5f)
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
            moveTo(7.02466f, 21.5f)
            curveTo(7.27552f, 18.9733f, 9.4073f, 17f, 12f, 17f)
            curveTo(14.5926f, 17f, 16.7244f, 18.9733f, 16.9753f, 21.5f)
        }
        }.build()

        return _idCardLanyard!!
    }

private var _idCardLanyard: ImageVector? = null
