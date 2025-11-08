package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Waiter: ImageVector
    get() {
        if (_waiter != null) {
            return _waiter!!
        }
        _waiter = ImageVector.Builder(
            name = "Waiter",
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
        moveTo(20f, 22.0017f)
        verticalLineTo(16.0275f)
        curveTo(20f, 15.0787f, 20f, 14.6043f, 19.8416f, 14.2303f)
        curveTo(19.6413f, 13.7575f, 19.2669f, 13.3798f, 18.7958f, 13.1755f)
        curveTo(18.4232f, 13.0139f, 17.9488f, 13.0099f, 17f, 13.0017f)
        curveTo(17f, 18.0017f, 12f, 20.0017f, 12f, 20.0017f)
        curveTo(12f, 20.0017f, 7f, 18.0017f, 7f, 13.0017f)
        curveTo(6.06812f, 13.0017f, 5.60218f, 13.0017f, 5.23463f, 13.154f)
        curveTo(4.74458f, 13.357f, 4.35523f, 13.7463f, 4.15224f, 14.2364f)
        curveTo(4f, 14.6039f, 4f, 15.0699f, 4f, 16.0017f)
        verticalLineTo(22.0017f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        lineTo(14f, 12.5f)
        verticalLineTo(14.5f)
        lineTo(12f, 13.5f)
        moveTo(12f, 13.5f)
        lineTo(10f, 12.5002f)
        verticalLineTo(14.5002f)
        lineTo(12f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 6.50012f)
        verticalLineTo(5.50012f)
        curveTo(15.5f, 3.56713f, 13.933f, 2.00012f, 12f, 2.00012f)
        curveTo(10.067f, 2.00012f, 8.5f, 3.56713f, 8.5f, 5.50012f)
        verticalLineTo(6.50012f)
        curveTo(8.5f, 8.43312f, 10.067f, 10.0001f, 12f, 10.0001f)
        curveTo(13.933f, 10.0001f, 15.5f, 8.43312f, 15.5f, 6.50012f)
        }
        }.build()

        return _waiter!!
    }

private var _waiter: ImageVector? = null
