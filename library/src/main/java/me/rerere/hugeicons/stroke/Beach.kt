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

val HugeIcons.Beach: ImageVector
    get() {
        if (_beach != null) {
            return _beach!!
        }
        _beach = ImageVector.Builder(
            name = "Beach",
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
            moveTo(10.5128f, 8.50195f)
            lineTo(7.49414f, 15.5004f)
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
            moveTo(12.9036f, 2.97659f)
            curveTo(10.5213f, 1.95129f, 7.84887f, 2.63719f, 6.20986f, 4.48844f)
            curveTo(5.68751f, 5.07843f, 5.42633f, 5.37342f, 5.53667f, 5.87689f)
            curveTo(5.64701f, 6.38035f, 6.08935f, 6.57072f, 6.97403f, 6.95147f)
            lineTo(14.2225f, 10.0711f)
            curveTo(15.1098f, 10.4529f, 15.5534f, 10.6439f, 15.9872f, 10.3728f)
            curveTo(16.4211f, 10.1018f, 16.447f, 9.70476f, 16.4988f, 8.91071f)
            curveTo(16.661f, 6.42691f, 15.2841f, 4.0011f, 12.9036f, 2.97659f)
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
            moveTo(3f, 16.5f)
            curveTo(3f, 16.5f, 4.61581f, 15.5f, 7.5f, 15.5f)
            curveTo(12f, 15.5f, 15f, 18f, 21f, 18f)
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
            moveTo(3f, 20.5f)
            horizontalLineTo(21f)
        }
        }.build()

        return _beach!!
    }

private var _beach: ImageVector? = null
