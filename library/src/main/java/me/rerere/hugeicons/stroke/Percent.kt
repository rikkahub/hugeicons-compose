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

val HugeIcons.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = ImageVector.Builder(
            name = "Percent",
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
            moveTo(4f, 20f)
            lineTo(20f, 4f)
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
            moveTo(8.26777f, 4.73223f)
            curveTo(9.24408f, 5.70854f, 9.24408f, 7.29146f, 8.26777f, 8.26777f)
            curveTo(7.29146f, 9.24408f, 5.70854f, 9.24408f, 4.73223f, 8.26777f)
            curveTo(3.75592f, 7.29146f, 3.75592f, 5.70854f, 4.73223f, 4.73223f)
            curveTo(5.70854f, 3.75592f, 7.29146f, 3.75592f, 8.26777f, 4.73223f)
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
            moveTo(19.2678f, 15.7322f)
            curveTo(20.2441f, 16.7085f, 20.2441f, 18.2915f, 19.2678f, 19.2678f)
            curveTo(18.2915f, 20.2441f, 16.7085f, 20.2441f, 15.7322f, 19.2678f)
            curveTo(14.7559f, 18.2915f, 14.7559f, 16.7085f, 15.7322f, 15.7322f)
            curveTo(16.7085f, 14.7559f, 18.2915f, 14.7559f, 19.2678f, 15.7322f)
            close()
        }
        }.build()

        return _percent!!
    }

private var _percent: ImageVector? = null
