package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PieChart01: ImageVector
    get() {
        if (_pieChart01 != null) {
            return _pieChart01!!
        }
        _pieChart01 = ImageVector.Builder(
            name = "PieChart01",
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
        moveTo(21f, 12.502f)
        curveTo(21f, 17.7487f, 16.7467f, 22.002f, 11.5f, 22.002f)
        curveTo(6.25329f, 22.002f, 2f, 17.7487f, 2f, 12.502f)
        curveTo(2f, 7.25525f, 6.25329f, 3.00195f, 11.5f, 3.00195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.7046f, 7.38562f)
        lineTo(14.5805f, 4.77321f)
        curveTo(15.1261f, 3.14611f, 15.3989f, 2.33256f, 16.2494f, 2.07407f)
        curveTo(17.0999f, 1.81558f, 17.6633f, 2.25023f, 18.79f, 3.11953f)
        curveTo(19.5732f, 3.72378f, 20.2762f, 4.42682f, 20.8805f, 5.21f)
        curveTo(21.7498f, 6.33675f, 22.1844f, 6.90012f, 21.9259f, 7.75059f)
        curveTo(21.6674f, 8.60106f, 20.8539f, 8.87386f, 19.2268f, 9.41946f)
        lineTo(16.6144f, 10.2954f)
        curveTo(14.7053f, 10.9356f, 13.7508f, 11.2557f, 13.2475f, 10.7525f)
        curveTo(12.7443f, 10.2492f, 13.0644f, 9.2947f, 13.7046f, 7.38562f)
        }
        }.build()

        return _pieChart01!!
    }

private var _pieChart01: ImageVector? = null
