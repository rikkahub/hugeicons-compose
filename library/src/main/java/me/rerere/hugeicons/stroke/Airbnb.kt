package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Airbnb: ImageVector
    get() {
        if (_airbnb != null) {
            return _airbnb!!
        }
        _airbnb = ImageVector.Builder(
            name = "Airbnb",
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
        moveTo(12f, 18.7753f)
        curveTo(10.3443f, 16.7754f, 9f, 15.5355f, 9f, 13.5f)
        curveTo(9f, 11.4645f, 10.5033f, 10f, 12.0033f, 10f)
        curveTo(13.5033f, 10f, 15f, 11.4645f, 15f, 13.5f)
        curveTo(15f, 15.5355f, 13.6557f, 16.7754f, 12f, 18.7753f)
        moveTo(12f, 18.7753f)
        curveTo(10f, 21.3198f, 6.02071f, 21.4621f, 4.34969f, 20.302f)
        curveTo(2.67867f, 19.1419f, 2.65485f, 16.7398f, 3.75428f, 14.1954f)
        curveTo(4.85371f, 11.651f, 6.31925f, 8.5977f, 9.25143f, 4.52665f)
        curveTo(10.2123f, 3.45799f, 10.8973f, 3f, 11.9967f, 3f)
        moveTo(12f, 18.7753f)
        curveTo(14f, 21.3198f, 17.9793f, 21.4621f, 19.6503f, 20.302f)
        curveTo(21.3213f, 19.1419f, 21.3451f, 16.7398f, 20.2457f, 14.1954f)
        curveTo(19.1463f, 11.651f, 17.6807f, 8.5977f, 14.7486f, 4.52665f)
        curveTo(13.7877f, 3.45799f, 13.1027f, 3f, 12.0033f, 3f)
        }
        }.build()

        return _airbnb!!
    }

private var _airbnb: ImageVector? = null
