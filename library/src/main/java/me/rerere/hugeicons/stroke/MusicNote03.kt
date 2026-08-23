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

val HugeIcons.MusicNote03: ImageVector
    get() {
        if (_musicNote03 != null) {
            return _musicNote03!!
        }
        _musicNote03 = ImageVector.Builder(
            name = "MusicNote03",
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
            moveTo(10f, 18.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 3f, 18.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 10f, 18.5f)
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
            moveTo(21f, 16f)
            arcTo(3f, 3f, 0f, true, false, 15f, 16f)
            arcTo(3f, 3f, 0f, true, false, 21f, 16f)
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
            moveTo(10f, 18.5f)
            lineTo(10f, 7f)
            curveTo(10f, 6.07655f, 10f, 5.61483f, 10.2635f, 5.32794f)
            curveTo(10.5269f, 5.04106f, 11.0175f, 4.9992f, 11.9986f, 4.91549f)
            curveTo(16.022f, 4.57222f, 18.909f, 3.26005f, 20.3553f, 2.40978f)
            curveTo(20.6508f, 2.236f, 20.7986f, 2.14912f, 20.8993f, 2.20672f)
            curveTo(21f, 2.26432f, 21f, 2.4315f, 21f, 2.76587f)
            verticalLineTo(16f)
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
            moveTo(10f, 10f)
            curveTo(15.8667f, 10f, 19.7778f, 7.66667f, 21f, 7f)
        }
        }.build()

        return _musicNote03!!
    }

private var _musicNote03: ImageVector? = null
