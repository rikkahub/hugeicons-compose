package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Constellation: ImageVector
    get() {
        if (_constellation != null) {
            return _constellation!!
        }
        _constellation = ImageVector.Builder(
            name = "Constellation",
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
        moveTo(12f, 14f)
        curveTo(13.1046f, 14f, 14f, 13.1046f, 14f, 12f)
        curveTo(14f, 10.8954f, 13.1046f, 10f, 12f, 10f)
        curveTo(10.8954f, 10f, 10f, 10.8954f, 10f, 12f)
        curveTo(10f, 13.1046f, 10.8954f, 14f, 12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18f)
        curveTo(21.1046f, 18f, 22f, 17.1046f, 22f, 16f)
        curveTo(22f, 14.8954f, 21.1046f, 14f, 20f, 14f)
        curveTo(18.8954f, 14f, 18f, 14.8954f, 18f, 16f)
        curveTo(18f, 17.1046f, 18.8954f, 18f, 20f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 22f)
        curveTo(12.1046f, 22f, 13f, 21.1046f, 13f, 20f)
        curveTo(13f, 18.8954f, 12.1046f, 18f, 11f, 18f)
        curveTo(9.89543f, 18f, 9f, 18.8954f, 9f, 20f)
        curveTo(9f, 21.1046f, 9.89543f, 22f, 11f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 6f)
        curveTo(16.1046f, 6f, 17f, 5.10457f, 17f, 4f)
        curveTo(17f, 2.89543f, 16.1046f, 2f, 15f, 2f)
        curveTo(13.8954f, 2f, 13f, 2.89543f, 13f, 4f)
        curveTo(13f, 5.10457f, 13.8954f, 6f, 15f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        curveTo(5.10457f, 10f, 6f, 9.10457f, 6f, 8f)
        curveTo(6f, 6.89543f, 5.10457f, 6f, 4f, 6f)
        curveTo(2.89543f, 6f, 2f, 6.89543f, 2f, 8f)
        curveTo(2f, 9.10457f, 2.89543f, 10f, 4f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.2983f, 5.87309f)
        lineTo(12.7032f, 10.1268f)
        moveTo(13.1207f, 4.68359f)
        lineTo(5.88086f, 7.31625f)
        moveTo(11.7527f, 13.9847f)
        lineTo(11.2489f, 18.0152f)
        moveTo(13.79f, 12.8945f)
        lineTo(18.2115f, 15.1053f)
        moveTo(18.1727f, 16.8124f)
        lineTo(12.8288f, 19.1874f)
        }
        }.build()

        return _constellation!!
    }

private var _constellation: ImageVector? = null
