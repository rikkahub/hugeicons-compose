package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Marketing: ImageVector
    get() {
        if (_marketing != null) {
            return _marketing!!
        }
        _marketing = ImageVector.Builder(
            name = "Marketing",
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
        moveTo(18f, 2f)
        curveTo(14.8969f, 2f, 8.46512f, 4.37761f, 4.77105f, 5.85372f)
        curveTo(3.07942f, 6.52968f, 2f, 8.17832f, 2f, 10f)
        curveTo(2f, 11.8217f, 3.07942f, 13.4703f, 4.77105f, 14.1463f)
        curveTo(8.46512f, 15.6224f, 14.8969f, 18f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        lineTo(9.05674f, 20.9303f)
        curveTo(6.94097f, 19.7657f, 5.74654f, 17.4134f, 6.04547f, 15f)
        }
        }.build()

        return _marketing!!
    }

private var _marketing: ImageVector? = null
