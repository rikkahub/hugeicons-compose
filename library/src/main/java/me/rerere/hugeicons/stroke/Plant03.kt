package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plant03: ImageVector
    get() {
        if (_plant03 != null) {
            return _plant03!!
        }
        _plant03 = ImageVector.Builder(
            name = "Plant03",
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
        moveTo(14.5f, 11.5f)
        curveTo(14.5f, 11.5f, 12f, 13.5f, 12f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.063f, 9.06301f)
        curveTo(11.3123f, 7.8137f, 11.3123f, 5.78815f, 10.063f, 4.53884f)
        curveTo(8.17794f, 2.65376f, 4.03078f, 3.03078f, 4.03078f, 3.03078f)
        curveTo(4.03078f, 3.03078f, 3.65376f, 7.17794f, 5.53884f, 9.06301f)
        curveTo(6.78815f, 10.3123f, 8.8137f, 10.3123f, 10.063f, 9.06301f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.8031f, 11.1969f)
        curveTo(15.874f, 12.2677f, 17.6102f, 12.2677f, 18.681f, 11.1969f)
        curveTo(20.2968f, 9.58109f, 19.9736f, 6.02638f, 19.9736f, 6.02638f)
        curveTo(19.9736f, 6.02638f, 16.4189f, 5.70322f, 14.8031f, 7.319f)
        curveTo(13.7323f, 8.38985f, 13.7323f, 10.126f, 14.8031f, 11.1969f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 9.5f)
        curveTo(10f, 9.5f, 12f, 12f, 12f, 16.9993f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 21f)
        curveTo(18.8012f, 18.5471f, 15.5841f, 17f, 12f, 17f)
        curveTo(8.41592f, 17f, 5.19883f, 18.5471f, 3f, 21f)
        }
        }.build()

        return _plant03!!
    }

private var _plant03: ImageVector? = null
