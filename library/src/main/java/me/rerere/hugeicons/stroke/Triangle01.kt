package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Triangle01: ImageVector
    get() {
        if (_triangle01 != null) {
            return _triangle01!!
        }
        _triangle01 = ImageVector.Builder(
            name = "Triangle01",
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
        moveTo(7.89754f, 6.73262f)
        curveTo(9.71204f, 3.57754f, 10.6193f, 2f, 12f, 2f)
        curveTo(13.3807f, 2f, 14.288f, 3.57754f, 16.1025f, 6.73262f)
        lineTo(19.8592f, 13.2648f)
        curveTo(21.5848f, 16.2653f, 22.4476f, 17.7656f, 21.7671f, 18.8828f)
        curveTo(21.0866f, 20f, 19.3099f, 20f, 15.7567f, 20f)
        horizontalLineTo(8.24328f)
        curveTo(4.69006f, 20f, 2.91344f, 20f, 2.23293f, 18.8828f)
        curveTo(1.55242f, 17.7656f, 2.41522f, 16.2653f, 4.14082f, 13.2648f)
        lineTo(7.89754f, 6.73262f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9f)
        lineTo(18f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        lineTo(6f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14.409f)
        curveTo(5.88945f, 15.0512f, 7.25244f, 16.8771f, 7.25244f, 19.0294f)
        curveTo(7.25244f, 19.3617f, 7.21994f, 19.6863f, 7.158f, 20f)
        moveTo(16.842f, 20f)
        curveTo(16.7801f, 19.6863f, 16.7476f, 19.3617f, 16.7476f, 19.0294f)
        curveTo(16.7476f, 16.8771f, 18.1105f, 15.0512f, 20f, 14.409f)
        moveTo(15.2815f, 6f)
        curveTo(14.429f, 6.83606f, 13.273f, 7.34965f, 12f, 7.34965f)
        curveTo(10.727f, 7.34965f, 9.57102f, 6.83606f, 8.71851f, 6f)
        }
        }.build()

        return _triangle01!!
    }

private var _triangle01: ImageVector? = null
