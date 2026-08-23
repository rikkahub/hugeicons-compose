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

val HugeIcons.Radical: ImageVector
    get() {
        if (_radical != null) {
            return _radical!!
        }
        _radical = ImageVector.Builder(
            name = "Radical",
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
            moveTo(21.9927f, 5.00012f)
            horizontalLineTo(13.6065f)
            curveTo(12.3725f, 5.00012f, 11.9577f, 5.13992f, 11.6517f, 6.36406f)
            lineTo(9.33181f, 15.6417f)
            curveTo(8.78216f, 17.8399f, 8.50734f, 18.939f, 7.77749f, 18.9977f)
            curveTo(7.04764f, 19.0565f, 6.543f, 18.0201f, 5.53372f, 15.9473f)
            lineTo(4.96282f, 14.7749f)
            curveTo(4.52809f, 13.8821f, 4.31072f, 13.4357f, 3.87123f, 13.3148f)
            curveTo(3.20977f, 13.1328f, 2.50108f, 13.6704f, 1.99268f, 14.0001f)
        }
        }.build()

        return _radical!!
    }

private var _radical: ImageVector? = null
