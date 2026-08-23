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

val HugeIcons.Goal: ImageVector
    get() {
        if (_goal != null) {
            return _goal!!
        }
        _goal = ImageVector.Builder(
            name = "Goal",
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
            moveTo(15f, 14.6699f)
            curveTo(18.4956f, 15.0818f, 21f, 16.193f, 21f, 17.4992f)
            curveTo(21f, 19.1561f, 16.9706f, 20.4992f, 12f, 20.4992f)
            curveTo(7.02944f, 20.4992f, 3f, 19.1561f, 3f, 17.4992f)
            curveTo(3f, 16.193f, 5.50442f, 15.0818f, 9f, 14.6699f)
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
            moveTo(12f, 17.5f)
            lineTo(12f, 11.5538f)
            moveTo(12f, 11.5538f)
            lineTo(12f, 7.09421f)
            curveTo(12f, 5.15244f, 12f, 4.18155f, 12.6235f, 3.73601f)
            curveTo(12.6729f, 3.70075f, 12.7244f, 3.6684f, 12.7777f, 3.63913f)
            curveTo(13.4517f, 3.2694f, 14.3627f, 3.66782f, 16.1849f, 4.46466f)
            curveTo(18.6837f, 5.55739f, 19.9331f, 6.10376f, 19.9963f, 6.99149f)
            curveTo(20.0012f, 7.05989f, 20.0012f, 7.12853f, 19.9963f, 7.19693f)
            curveTo(19.9331f, 8.08465f, 18.6837f, 8.63102f, 16.1849f, 9.72376f)
            lineTo(12f, 11.5538f)
            close()
        }
        }.build()

        return _goal!!
    }

private var _goal: ImageVector? = null
