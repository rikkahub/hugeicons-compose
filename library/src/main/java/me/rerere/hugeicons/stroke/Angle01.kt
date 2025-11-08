package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Angle01: ImageVector
    get() {
        if (_angle01 != null) {
            return _angle01!!
        }
        _angle01 = ImageVector.Builder(
            name = "Angle01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 20f)
        horizontalLineTo(6.47347f)
        curveTo(4.36707f, 20f, 3.31387f, 20f, 3.05177f, 19.3827f)
        curveTo(2.78966f, 18.7654f, 3.53439f, 18.0388f, 5.02384f, 16.5858f)
        lineTo(17.9249f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 20f)
        curveTo(11f, 17.3517f, 9.77371f, 15.0655f, 8f, 14f)
        }
        }.build()

        return _angle01!!
    }

private var _angle01: ImageVector? = null
