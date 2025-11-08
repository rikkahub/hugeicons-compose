package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MapsCircle01: ImageVector
    get() {
        if (_mapsCircle01 != null) {
            return _mapsCircle01!!
        }
        _mapsCircle01 = ImageVector.Builder(
            name = "MapsCircle01",
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
        moveTo(15.1287f, 13.7468f)
        curveTo(14.9601f, 13.9092f, 14.7347f, 14f, 14.5001f, 14f)
        curveTo(14.2655f, 14f, 14.0401f, 13.9092f, 13.8715f, 13.7468f)
        curveTo(12.3272f, 12.2504f, 10.2576f, 10.5788f, 11.2669f, 8.15187f)
        curveTo(11.8126f, 6.83966f, 13.1225f, 6f, 14.5001f, 6f)
        curveTo(15.8777f, 6f, 17.1876f, 6.83966f, 17.7333f, 8.15187f)
        curveTo(18.7413f, 10.5757f, 16.6768f, 12.2555f, 15.1287f, 13.7468f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 9.5f)
        horizontalLineTo(14.509f)
        }

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
        moveTo(9f, 15f)
        lineTo(5f, 19f)
        moveTo(15f, 21f)
        lineTo(3f, 9f)
        }
        }.build()

        return _mapsCircle01!!
    }

private var _mapsCircle01: ImageVector? = null
