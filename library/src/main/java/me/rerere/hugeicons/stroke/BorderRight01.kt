package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderRight01: ImageVector
    get() {
        if (_borderRight01 != null) {
            return _borderRight01!!
        }
        _borderRight01 = ImageVector.Builder(
            name = "BorderRight01",
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
        moveTo(17.5f, 2.5f)
        curveTo(18.5939f, 2.69854f, 19.399f, 3.04969f, 20.0355f, 3.6708f)
        curveTo(21.5f, 5.09987f, 21.5f, 7.39991f, 21.5f, 12f)
        curveTo(21.5f, 16.6001f, 21.5f, 18.9001f, 20.0355f, 20.3292f)
        curveTo(19.399f, 20.9503f, 18.5939f, 21.3015f, 17.5f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.31035f, 2.75143f)
        curveTo(5.26828f, 2.94471f, 4.50135f, 3.28657f, 3.89503f, 3.89124f)
        curveTo(3.28872f, 4.49591f, 2.94592f, 5.26076f, 2.75211f, 6.3f)
        moveTo(14f, 2.50495f)
        curveTo(13.414f, 2.5f, 12.7117f, 2.5f, 12.0259f, 2.5f)
        curveTo(11.3401f, 2.5f, 10.5751f, 2.5f, 9.9891f, 2.50495f)
        moveTo(2.50497f, 10.1f)
        curveTo(2.5f, 10.6844f, 2.5f, 11.3161f, 2.5f, 12f)
        curveTo(2.5f, 12.6839f, 2.5f, 13.3156f, 2.50497f, 13.9001f)
        moveTo(2.75211f, 17.7f)
        curveTo(2.94592f, 18.7392f, 3.28871f, 19.5041f, 3.89503f, 20.1088f)
        curveTo(4.50135f, 20.7134f, 5.26828f, 21.0553f, 6.31035f, 21.2486f)
        moveTo(14f, 21.495f)
        curveTo(13.414f, 21.5f, 12.7117f, 21.5f, 12.0259f, 21.5f)
        curveTo(11.3402f, 21.5f, 10.5751f, 21.5f, 9.9891f, 21.495f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.5f)
        verticalLineTo(4f)
        moveTo(12f, 20f)
        verticalLineTo(21.5f)
        moveTo(15f, 12f)
        horizontalLineTo(9f)
        moveTo(4.46875f, 12f)
        horizontalLineTo(3f)
        moveTo(12f, 9f)
        lineTo(12f, 15f)
        }
        }.build()

        return _borderRight01!!
    }

private var _borderRight01: ImageVector? = null
