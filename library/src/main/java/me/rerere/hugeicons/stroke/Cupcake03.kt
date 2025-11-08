package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cupcake03: ImageVector
    get() {
        if (_cupcake03 != null) {
            return _cupcake03!!
        }
        _cupcake03 = ImageVector.Builder(
            name = "Cupcake03",
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
        moveTo(12f, 4f)
        curveTo(13.1046f, 4f, 14f, 4.89543f, 14f, 6f)
        curveTo(14f, 7.10457f, 13.1046f, 8f, 12f, 8f)
        curveTo(10.8954f, 8f, 10f, 7.10457f, 10f, 6f)
        curveTo(10f, 4.89543f, 10.8954f, 4f, 12f, 4f)
        moveTo(12f, 4f)
        curveTo(12f, 3.5f, 12.4f, 2.4f, 14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6f)
        curveTo(7.79149f, 6f, 5.9019f, 8.49273f, 7.24928f, 10.0811f)
        curveTo(5.6231f, 9.73961f, 4f, 10.9457f, 4f, 12.5341f)
        curveTo(4f, 15.4859f, 8.66165f, 15.9075f, 9.27999f, 13.0367f)
        curveTo(9.84382f, 15.6544f, 14.1562f, 15.6544f, 14.72f, 13.0367f)
        curveTo(15.3384f, 15.9075f, 20f, 15.4859f, 20f, 12.5341f)
        curveTo(20f, 10.9457f, 18.3769f, 9.73961f, 16.7507f, 10.0811f)
        curveTo(18.0981f, 8.49273f, 16.2085f, 6f, 14f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        lineTo(7.17111f, 19.0989f)
        curveTo(7.57006f, 20.4952f, 7.76954f, 21.1934f, 8.30421f, 21.5967f)
        curveTo(8.83888f, 22f, 9.56499f, 22f, 11.0172f, 22f)
        horizontalLineTo(12.9828f)
        curveTo(14.435f, 22f, 15.1611f, 22f, 15.6958f, 21.5967f)
        curveTo(16.2305f, 21.1934f, 16.4299f, 20.4952f, 16.8289f, 19.0989f)
        lineTo(18f, 15f)
        }
        }.build()

        return _cupcake03!!
    }

private var _cupcake03: ImageVector? = null
