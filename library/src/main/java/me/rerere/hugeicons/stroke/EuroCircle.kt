package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EuroCircle: ImageVector
    get() {
        if (_euroCircle != null) {
            return _euroCircle!!
        }
        _euroCircle = ImageVector.Builder(
            name = "EuroCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14.4923f)
        curveTo(14.5216f, 15.3957f, 13.6512f, 16f, 12.6568f, 16f)
        curveTo(11.147f, 16f, 9.92308f, 14.6071f, 9.92308f, 12.8889f)
        verticalLineTo(11.1111f)
        curveTo(9.92308f, 9.39289f, 11.147f, 8f, 12.6568f, 8f)
        curveTo(13.6512f, 8f, 14.5216f, 8.60426f, 15f, 9.50774f)
        moveTo(9f, 12f)
        horizontalLineTo(12.9231f)
        }
        }.build()

        return _euroCircle!!
    }

private var _euroCircle: ImageVector? = null
