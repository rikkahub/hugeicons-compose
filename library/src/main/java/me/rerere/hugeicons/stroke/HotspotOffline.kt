package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HotspotOffline: ImageVector
    get() {
        if (_hotspotOffline != null) {
            return _hotspotOffline!!
        }
        _hotspotOffline = ImageVector.Builder(
            name = "HotspotOffline",
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
        moveTo(14f, 14f)
        curveTo(14f, 15.1046f, 13.1046f, 16f, 12f, 16f)
        curveTo(10.8954f, 16f, 10f, 15.1046f, 10f, 14f)
        curveTo(10f, 12.8954f, 10.8954f, 12f, 12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 20.001f)
        curveTo(2.74418f, 18.3295f, 2f, 16.2516f, 2f, 14f)
        curveTo(2f, 10.7288f, 3.57069f, 7.82446f, 5.99903f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 4.62961f)
        curveTo(9.58934f, 4.22255f, 10.7687f, 4f, 12f, 4f)
        curveTo(17.5228f, 4f, 22f, 8.47715f, 22f, 14f)
        curveTo(22f, 15.2313f, 21.7775f, 16.4107f, 21.3704f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50087f, 18f)
        curveTo(6.56753f, 16.9385f, 6f, 15.5367f, 6f, 14f)
        curveTo(6f, 11.913f, 7.04673f, 10.0749f, 8.63494f, 9f)
        moveTo(16.2877f, 18f)
        curveTo(16.5573f, 17.6934f, 16.7963f, 17.3584f, 17f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14f)
        curveTo(18f, 10.6863f, 15.3137f, 8f, 12f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _hotspotOffline!!
    }

private var _hotspotOffline: ImageVector? = null
