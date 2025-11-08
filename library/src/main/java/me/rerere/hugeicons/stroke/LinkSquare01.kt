package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LinkSquare01: ImageVector
    get() {
        if (_linkSquare01 != null) {
            return _linkSquare01!!
        }
        _linkSquare01 = ImageVector.Builder(
            name = "LinkSquare01",
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
        moveTo(11.1004f, 3.00208f)
        curveTo(7.4515f, 3.00864f, 5.54073f, 3.09822f, 4.31962f, 4.31931f)
        curveTo(3.00183f, 5.63706f, 3.00183f, 7.75796f, 3.00183f, 11.9997f)
        curveTo(3.00183f, 16.2415f, 3.00183f, 18.3624f, 4.31962f, 19.6801f)
        curveTo(5.6374f, 20.9979f, 7.75836f, 20.9979f, 12.0003f, 20.9979f)
        curveTo(16.2421f, 20.9979f, 18.3631f, 20.9979f, 19.6809f, 19.6801f)
        curveTo(20.902f, 18.4591f, 20.9916f, 16.5484f, 20.9982f, 12.8996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.4803f, 3.51751f)
        lineTo(14.931f, 9.0515f)
        moveTo(20.4803f, 3.51751f)
        curveTo(19.9863f, 3.023f, 16.6587f, 3.0691f, 15.9552f, 3.0791f)
        moveTo(20.4803f, 3.51751f)
        curveTo(20.9742f, 4.01202f, 20.9282f, 7.34329f, 20.9182f, 8.04754f)
        }
        }.build()

        return _linkSquare01!!
    }

private var _linkSquare01: ImageVector? = null
