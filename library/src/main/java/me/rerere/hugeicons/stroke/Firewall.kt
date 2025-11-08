package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Firewall: ImageVector
    get() {
        if (_firewall != null) {
            return _firewall!!
        }
        _firewall = ImageVector.Builder(
            name = "Firewall",
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
        moveTo(19f, 14f)
        horizontalLineTo(5f)
        curveTo(3.58579f, 14f, 2.87868f, 14f, 2.43934f, 14.4393f)
        curveTo(2f, 14.8787f, 2f, 15.5858f, 2f, 17f)
        verticalLineTo(19f)
        curveTo(2f, 20.4142f, 2f, 21.1213f, 2.43934f, 21.5607f)
        curveTo(2.87868f, 22f, 3.58579f, 22f, 5f, 22f)
        horizontalLineTo(19f)
        curveTo(20.4142f, 22f, 21.1213f, 22f, 21.5607f, 21.5607f)
        curveTo(22f, 21.1213f, 22f, 20.4142f, 22f, 19f)
        verticalLineTo(17f)
        curveTo(22f, 15.5858f, 22f, 14.8787f, 21.5607f, 14.4393f)
        curveTo(21.1213f, 14f, 20.4142f, 14f, 19f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 18f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        lineTo(12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        lineTo(7f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 22f)
        lineTo(17f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8412f, 11f)
        curveTo(18.5539f, 9.80598f, 17.8362f, 8.63931f, 16.3747f, 7.6f)
        curveTo(12.4372f, 4.8f, 11.9997f, 2f, 11.9997f, 2f)
        curveTo(11.9997f, 2f, 7.93797f, 5.6f, 10.2497f, 10f)
        curveTo(8.14967f, 10.32f, 7.17231f, 8f, 6.94613f, 6.8f)
        curveTo(5.97628f, 8.08998f, 5.20609f, 9.53564f, 5.03516f, 11f)
        }
        }.build()

        return _firewall!!
    }

private var _firewall: ImageVector? = null
