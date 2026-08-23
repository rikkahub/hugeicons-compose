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

val HugeIcons.Radio01: ImageVector
    get() {
        if (_radio01 != null) {
            return _radio01!!
        }
        _radio01 = ImageVector.Builder(
            name = "Radio01",
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
            moveTo(14f, 6f)
            horizontalLineTo(10f)
            curveTo(6.22876f, 6f, 4.34315f, 6f, 3.17157f, 7.17157f)
            curveTo(2f, 8.34315f, 2f, 10.2288f, 2f, 14f)
            curveTo(2f, 17.7712f, 2f, 19.6569f, 3.17157f, 20.8284f)
            curveTo(4.34315f, 22f, 6.22876f, 22f, 10f, 22f)
            horizontalLineTo(14f)
            curveTo(17.7712f, 22f, 19.6569f, 22f, 20.8284f, 20.8284f)
            curveTo(22f, 19.6569f, 22f, 17.7712f, 22f, 14f)
            curveTo(22f, 10.2288f, 22f, 8.34315f, 20.8284f, 7.17157f)
            curveTo(19.6569f, 6f, 17.7712f, 6f, 14f, 6f)
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
            moveTo(17.4635f, 12.0003f)
            curveTo(18.5679f, 13.9132f, 17.9125f, 16.3591f, 15.9997f, 17.4635f)
            curveTo(14.0868f, 18.5679f, 11.6409f, 17.9125f, 10.5365f, 15.9997f)
            moveTo(17.4635f, 12.0003f)
            curveTo(16.3591f, 10.0875f, 13.9132f, 9.43209f, 12.0003f, 10.5365f)
            curveTo(10.0875f, 11.6409f, 9.43209f, 14.0868f, 10.5365f, 15.9997f)
            moveTo(17.4635f, 12.0003f)
            lineTo(10.5365f, 15.9997f)
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
            moveTo(17f, 2f)
            lineTo(6.5f, 6f)
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
            moveTo(6.125f, 10f)
            horizontalLineTo(6f)
            moveTo(6.25f, 10f)
            curveTo(6.25f, 10.1381f, 6.13807f, 10.25f, 6f, 10.25f)
            curveTo(5.86193f, 10.25f, 5.75f, 10.1381f, 5.75f, 10f)
            curveTo(5.75f, 9.86193f, 5.86193f, 9.75f, 6f, 9.75f)
            curveTo(6.13807f, 9.75f, 6.25f, 9.86193f, 6.25f, 10f)
            close()
        }
        }.build()

        return _radio01!!
    }

private var _radio01: ImageVector? = null
