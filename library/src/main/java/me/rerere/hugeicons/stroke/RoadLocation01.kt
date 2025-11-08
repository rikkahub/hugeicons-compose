package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RoadLocation01: ImageVector
    get() {
        if (_roadLocation01 != null) {
            return _roadLocation01!!
        }
        _roadLocation01 = ImageVector.Builder(
            name = "RoadLocation01",
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
        moveTo(18.5f, 15f)
        lineTo(16.5f, 15f)
        moveTo(13f, 15f)
        lineTo(11f, 15f)
        moveTo(7.5f, 15f)
        lineTo(5.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(9.79086f, 2f, 8f, 3.80892f, 8f, 6.04033f)
        curveTo(8f, 7.31626f, 8.5f, 8.30834f, 9.5f, 9.1945f)
        curveTo(10.2049f, 9.81911f, 11.0588f, 10.8566f, 11.5714f, 11.6975f)
        curveTo(11.8173f, 12.1008f, 12.165f, 12.1008f, 12.4286f, 11.6975f)
        curveTo(12.9672f, 10.8733f, 13.7951f, 9.81911f, 14.5f, 9.1945f)
        curveTo(15.5f, 8.30834f, 16f, 7.31626f, 16f, 6.04033f)
        curveTo(16f, 3.80892f, 14.2091f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 8f)
        curveTo(19.7745f, 8.14988f, 20.3588f, 8.40002f, 20.8284f, 8.81749f)
        curveTo(22f, 9.85903f, 22f, 11.5353f, 22f, 14.888f)
        curveTo(22f, 18.2406f, 22f, 19.9169f, 20.8284f, 20.9585f)
        curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 22f, 4.34315f, 22f, 3.17157f, 20.9585f)
        curveTo(2f, 19.9169f, 2f, 18.2406f, 2f, 14.888f)
        curveTo(2f, 11.5353f, 2f, 9.85902f, 3.17157f, 8.81749f)
        curveTo(3.64118f, 8.40002f, 4.2255f, 8.14988f, 5f, 8f)
        }
        }.build()

        return _roadLocation01!!
    }

private var _roadLocation01: ImageVector? = null
