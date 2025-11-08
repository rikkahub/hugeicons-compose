package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PieChart09: ImageVector
    get() {
        if (_pieChart09 != null) {
            return _pieChart09!!
        }
        _pieChart09 = ImageVector.Builder(
            name = "PieChart09",
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
        moveTo(16.5557f, 4.61883f)
        curveTo(15.7488f, 4.07099f, 14.8724f, 3.64848f, 13.9552f, 3.3602f)
        curveTo(12.7981f, 2.99648f, 12.2195f, 2.81462f, 11.6098f, 3.2715f)
        curveTo(11f, 3.72839f, 11f, 4.4705f, 11f, 5.95472f)
        verticalLineTo(10.5064f)
        curveTo(11f, 11.7697f, 11f, 12.4013f, 11.2341f, 12.9676f)
        curveTo(11.4683f, 13.534f, 11.9122f, 13.9761f, 12.8f, 14.8604f)
        lineTo(15.999f, 18.0466f)
        curveTo(17.0421f, 19.0855f, 17.5637f, 19.605f, 18.3116f, 19.4823f)
        curveTo(19.0596f, 19.3597f, 19.3367f, 18.8125f, 19.8911f, 17.7182f)
        curveTo(20.3153f, 16.881f, 20.6251f, 15.9835f, 20.8079f, 15.0499f)
        curveTo(21.1937f, 13.0788f, 20.9957f, 11.0358f, 20.2388f, 9.17903f)
        curveTo(19.4819f, 7.32232f, 18.2002f, 5.73535f, 16.5557f, 4.61883f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 20.4185f)
        curveTo(13.0736f, 20.7935f, 12.0609f, 21f, 11f, 21f)
        curveTo(6.58172f, 21f, 3f, 17.4183f, 3f, 13f)
        curveTo(3f, 9.56306f, 5.16736f, 6.63232f, 8.20988f, 5.5f)
        }
        }.build()

        return _pieChart09!!
    }

private var _pieChart09: ImageVector? = null
